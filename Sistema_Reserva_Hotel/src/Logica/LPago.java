
package Logica;

import Datos.DPago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LPago {
    private Conexion mysql = new Conexion();
    
    private Connection cn = mysql.conectar();
    
    private String sql = ""; //almacenando la cadena de conexion
    
    public Integer totalRegistros;
    
    
    
    
    //---------------------     BUSCAR  --------------------- 
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Id Reserva","Tipo Comprobante","Num. Comprobante","Igv","Total","Fecha Emision","Fecha Pago"};//vector para guardar los titulos de las culumnas
        
        String[] registro = new String[8];//almacenará los registros de c/u de esos titulos
        
        totalRegistros=0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "Select * from pago where idreserva ="+buscar+" order by idpago desc";
        
        try {
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){//recorriendo el rs
                //almacenandolo en el vector
                registro[0]=rs.getString("idpago");
                registro[1]=rs.getString("idreserva");
                registro[2]=rs.getString("tipo_comprobante");
                registro[3]=rs.getString("num_comprobante");
                registro[4]=rs.getString("igv");
                registro[5]=rs.getString("total_pago");
                registro[6]=rs.getString("fecha_emision");
                registro[7]=rs.getString("fecha_pago");
                
                totalRegistros += 1;
                modelo.addRow(registro);//agregando cada fila en el modelo
            }
            
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    
    
    //-------------------   INSERTAR    -----------------------
    public boolean insertar(DPago dts){
        
        sql = "insert into pago (idreserva,tipo_comprobante,num_comprobante,igv,total_pago,fecha_emision,fecha_pago) values (?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdreserva());
            pst.setString(2, dts.getTipo_comprobante());
            pst.setString(3, dts.getNum_comprobante());
            pst.setDouble(4, dts.getIgv());
            pst.setDouble(5, dts.getTotal_pago());
            pst.setDate(6, dts.getFecha_emision());
            pst.setDate(7, dts.getFecha_pago());
            
            int n = pst.executeUpdate();
            
            if(n!=0){//si se ha insertado registros
                return true;
            }else{
                return false;
            }
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    
    //-------------------   ACTUALIZAR    -----------------------
    public boolean editar(DPago dts){
        
        sql="update pago set idreserva=?, tipo_comprobante=?, num_comprobante=?, igv=?, total_pago=?, fecha_emision=?, fecha_pago=? where idpago=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdreserva());
            pst.setString(2, dts.getTipo_comprobante());
            pst.setString(3, dts.getNum_comprobante());
            pst.setDouble(4, dts.getIgv());
            pst.setDouble(5, dts.getTotal_pago());
            pst.setDate(6, dts.getFecha_emision());
            pst.setDate(7, dts.getFecha_pago());
            
            pst.setInt(8, dts.getIdpago());
            
            int n = pst.executeUpdate();
            
            if(n!=0){//si se ha insertado registros
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    
    //-------------------   ELIMINAR    -----------------------
    public boolean eliminar(DPago dts){
        
        sql="delete from pago where idpago=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdpago());
            
            int n = pst.executeUpdate();
            
            if(n!=0){//si se ha insertado registros
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
}
