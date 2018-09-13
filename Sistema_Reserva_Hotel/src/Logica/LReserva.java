
package Logica;

import Datos.DReserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LReserva {
    private Conexion mysql = new Conexion();
    
    private Connection cn = mysql.conectar();
    
    private String sql = ""; //almacenando la cadena de conexion
    
    public Integer totalRegistros;
    
    
    
    
    //---------------------     BUSCAR  --------------------- 
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Id habitacion","Numero","Id Cliente","Cliente","ID Trabajador","Trabajador","Tipo Reserva","Fecha Reserva","Fecha ingreso","Fecha Salida","Costo","Estado"};//vector para guardar los titulos de las culumnas
        
        String[] registro = new String[13];//almacenará los registros de c/u de esos titulos
        
        totalRegistros=0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "Select r.idreserva, r.idhabitacion,h.numero,r.idcliente, "
                + "(select nombre from persona where idpersona=r.idcliente) as nombre_cliente, "
                + "(select apaterno from persona where idpersona=r.idcliente) as apaterno_cliente,"
                + "r.idtrabajador,(select nombre from persona where idpersona=r.idtrabajador) as nombre_trabajador, "
                +"(select apaterno from persona where idpersona=r.idtrabajador) as apaterno_trabajador,"
                +"r.tipo_reserva,r.fecha_reserva,r.fecha_ingresa,r.fecha_salida, r.costo_alojamiento,r.estado "
                + " from reserva as r inner join habitacion as h on r.idhabitacion=h.idhabitacion where r.fecha_reserva like '%"+buscar+"%' order by idreserva desc";
        
        try {
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){//recorriendo el rs
                //almacenandolo en el vector
                registro[0]=rs.getString("idreserva");
                registro[1]=rs.getString("idhabitacion");
                registro[2]=rs.getString("numero");
                registro[3]=rs.getString("idcliente");
                registro[4]=rs.getString("nombre_cliente") +" "+ rs.getString("apaterno_cliente");
                registro[5]=rs.getString("idtrabajador");
                registro[6]=rs.getString("nombre_trabajador") +" "+ rs.getString("apaterno_trabajador");
                registro[7]=rs.getString("tipo_reserva");
                registro[8]=rs.getString("fecha_reserva");
                registro[9]=rs.getString("fecha_ingresa");
                registro[10]=rs.getString("fecha_salida");
                registro[11]=rs.getString("costo_alojamiento");
                registro[12]=rs.getString("estado");

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
    public boolean insertar(DReserva dts){
        
        sql = "insert into reserva(idhabitacion,idcliente,idtrabajador,tipo_reserva,fecha_reserva,fecha_ingresa,fecha_salida,costo_alojamiento,estado) values (?,?,?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdtrabajador());
            pst.setString(4, dts.getTipo_reserva());
            pst.setDate(5, dts.getFecha_reserva());
            pst.setDate(6, dts.getFecha_ingresa());
            pst.setDate(7, dts.getFecha_salida());
            pst.setDouble(8, dts.getCosto_alojamiento());
            pst.setString(9, dts.getEstado());
            
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
    public boolean editar(DReserva dts){
        
        sql="update producto set idhabitacion=?, idcliente=?, idtrabajador=?,tipo_reserva=?,fecha_reserva=?,fecha_ingresa=?,fecha_salida=?,costo_alojamiento=?,estado=? where idreserva=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdtrabajador());
            pst.setString(4, dts.getTipo_reserva());
            pst.setDate(5, dts.getFecha_reserva());
            pst.setDate(6, dts.getFecha_ingresa());
            pst.setDate(7, dts.getFecha_salida());
            pst.setDouble(8, dts.getCosto_alojamiento());
            pst.setString(9, dts.getEstado());
            
            pst.setInt(10, dts.getIdreserva());
            
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
    public boolean eliminar(DReserva dts){
        
        sql="delete from reserva where idreserva=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setInt(1, dts.getIdreserva());
            
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
