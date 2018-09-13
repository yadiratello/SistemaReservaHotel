
package Logica;

import Datos.DProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LProducto {
    private Conexion mysql = new Conexion();
    
    private Connection cn = mysql.conectar();
    
    private String sql = ""; //almacenando la cadena de conexion
    
    public Integer totalRegistros;
    
    
    
    
    //---------------------     BUSCAR  --------------------- 
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Producto","Descripción","Unidad Medida","Precio Venta"};//vector para guardar los titulos de las culumnas
        
        String[] registro = new String[5];//almacenará los registros de c/u de esos titulos
        
        totalRegistros=0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "Select * from producto where nombre like '%"+buscar+"%' order by idproducto desc";
        
        try {
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){//recorriendo el rs
                //almacenandolo en el vector
                registro[0]=rs.getString("idproducto");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("descripcion");
                registro[3]=rs.getString("unidad_medida");
                registro[4]=rs.getString("precio_venta");
                
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
    public boolean insertar(DProducto dts){
        
        sql = "insert into producto (nombre,descripcion,unidad_medida,precio_venta) values (?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getUnidadMedida());
            pst.setDouble(4, dts.getPrecioVenta());
            
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
    public boolean editar(DProducto dts){
        
        sql="update producto set nombre=?, descripcion=?, unidad_medida=?, precio_venta=? where idproducto=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getUnidadMedida());
            pst.setDouble(4, dts.getPrecioVenta());
            pst.setInt(5, dts.getIdproducto());
            
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
    public boolean eliminar(DProducto dts){
        
        sql="delete from producto where idproducto=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdproducto());
            
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
