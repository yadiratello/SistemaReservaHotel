
package Logica;

import Datos.DConsumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LConsumo {
    private Conexion mysql = new Conexion();
    
    private Connection cn = mysql.conectar();
    
    private String sql = ""; 
    
    public Integer totalRegistros;
    public double totalConsumo;
    
    
    
    //---------------------     BUSCAR  --------------------- 
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Id Reserva","Id Producto","Nombre","Cantidad","Precio Venta","Estado"};//vector para guardar los titulos de las culumnas
        
        String[] registro = new String[7];//almacenará los registros de c/u de esos titulos
        
        totalRegistros=0;
        totalConsumo=0.0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "Select c.idconsumo,c.idreserva,c.idproducto,p.nombre,c.cantidad,c.precio_venta,c.estado "
              + "from consumo as c inner join producto as p on c.idproducto=p.idproducto "
                + "where c.idreserva ="+buscar+" order by c.idconsumo desc";
        
        try {
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){//recorriendo el rs
                //almacenandolo en el vector
                registro[0]=rs.getString("idconsumo");
                registro[1]=rs.getString("idreserva");
                registro[2]=rs.getString("idproducto");
                registro[3]=rs.getString("nombre");
                registro[4]=rs.getString("cantidad");
                registro[5]=rs.getString("precio_venta");
                registro[6]=rs.getString("estado");
                
                totalRegistros += 1;
                
                //calculando el total de consumo de dicha reserva
                totalConsumo += (rs.getDouble("cantidad") * rs.getDouble("precio_venta"));
                
                modelo.addRow(registro);//agregando cada fila en el modelo
            }
            
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    
    
    //-------------------   INSERTAR    -----------------------
    public boolean insertar(DConsumo dts){
        
        sql = "insert into consumo (idreserva,idproducto,cantidad,precio_venta,estado) values (?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdreserva());
            pst.setInt(2, dts.getIdproducto());
            pst.setInt(3, dts.getCantidad());
            pst.setDouble(4, dts.getPrecio_venta());
            pst.setString(5, dts.getEstado());
            
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
    public boolean editar(DConsumo dts){
        
        sql="update consumo set idreserva=?,idproducto=?,cantidad=?,precio_venta=?,estado=? where idconsumo=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdreserva());
            pst.setInt(2, dts.getIdproducto());
            pst.setInt(3, dts.getCantidad());
            pst.setDouble(4, dts.getPrecio_venta());
            pst.setString(5, dts.getEstado());
            
            pst.setInt(6, dts.getIdconsumo());
            
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
    public boolean eliminar(DConsumo dts){
        
        sql="delete from consumo where idconsumo=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdconsumo());
            
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
