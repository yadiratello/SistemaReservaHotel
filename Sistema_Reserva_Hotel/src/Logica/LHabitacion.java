
package Logica;

import Datos.DHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LHabitacion {
    
    private Conexion mysql = new Conexion();
    
    private Connection cn = mysql.conectar();
    
    private String sql = ""; //almacenando la cadena de conexion
    
    public Integer totalRegistros;
    
    
    
    
    //---------------------     BUSCAR  --------------------- 
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Número","Piso","Descripción","Características","Precio","Estado","Tipo Habitación"};//vector para guardar los titulos de las culumnas
        
        String[] registro = new String[8];//almacenará los registros de c/u de esos titulos
        
        totalRegistros=0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "Select * from habitacion where piso like '%"+buscar+"%' order by idhabitacion";
        
        try {
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){//recorriendo el rs
                //almacenandolo en el vector
                registro[0]=rs.getString("idhabitacion");
                registro[1]=rs.getString("numero");
                registro[2]=rs.getString("piso");
                registro[3]=rs.getString("descripcion");
                registro[4]=rs.getString("caracteristicas");
                registro[5]=rs.getString("precio_diario");
                registro[6]=rs.getString("estado");
                registro[7]=rs.getString("tipo_habitacion");
                
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
    public boolean insertar(DHabitacion dts){
        
        sql = "insert into habitacion (numero,piso,descripcion,caracteristicas,precio_diario,estado,tipo_habitacion) values (?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_habitacion());
            
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
    public boolean editar(DHabitacion dts){
        
        sql="update habitacion set numero=?, piso=?, descripcion=?, caracteristicas=?, precio_diario=?, estado=?, tipo_habitacion=? where idhabitacion=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_habitacion());
            pst.setInt(8, dts.getIdhabitacion());
            
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
    public boolean eliminar(DHabitacion dts){
        
        sql="delete from habitacion where idhabitacion=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdhabitacion());
            
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
