package Logica;

import Datos.DTrabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LTrabajador {

    private Conexion mysql = new Conexion();

    private Connection cn = mysql.conectar();

    private String sql = "";
    private String sql2 = "";

    public Integer totalRegistros;

    //---------------------     MOSTRAR  --------------------- 
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Ape. Paterno", "Ape. materno", "Doc", "Num. Documento", "Dirección", "Teléfono", "Email", "Sueldo","Acceso","Login","Clave","Estado"};//vector para guardar los titulos de las culumnas

        String[] registro = new String[14];//almacenará los registros de c/u de esos titulos

        totalRegistros = 0;

        modelo = new DefaultTableModel(null, titulos);

        sql = "Select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento, p.direccion, p.telefono,p.email,t.sueldo,t.acceso,t.login,t.password,t.estado "
                + "from persona as p inner join trabajador as t on p.idpersona=t.idpersona "
                + "where p.num_documento like '%" + buscar + "%' order by p.idpersona desc";

        try {

            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {//recorriendo el rs
                //almacenandolo en el vector
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apaterno");
                registro[3] = rs.getString("amaterno");
                registro[4] = rs.getString("tipo_documento");
                registro[5] = rs.getString("num_documento");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("telefono");
                registro[8] = rs.getString("email");
                registro[9] = rs.getString("sueldo");
                registro[10] = rs.getString("acceso");
                registro[11] = rs.getString("login");
                registro[12] = rs.getString("password");
                registro[13] = rs.getString("estado");

                totalRegistros += 1;
                modelo.addRow(registro);//agregando cada fila en el modelo
            }

            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //-------------------   INSERTAR en 2 tablas   -----------------------
    public boolean insertar(DTrabajador dts) {
        //insertando en la tabla persona
        sql = "insert into persona (nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email) values (?,?,?,?,?,?,?,?)";

        //insertando a esa persona en la tabla trabajador
        sql2 = "insert into trabajador(idpersona,sueldo,acceso,login,password,estado) values ((select idpersona from persona order by idpersona desc limit 1),?,?,?,?,?)";//1er parametro se saca de la ultima persona insertada en la tabla persona y los demas parametros los paso

        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            PreparedStatement pst2 = cn.prepareStatement(sql2);

            //tabla persona
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApaterno());
            pst.setString(3, dts.getAmaterno());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());

            //tabla trabajador
            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());

            int n = pst.executeUpdate();

            if (n != 0) {//si se ha insertado registros en la tabla persona entonces si puedo insertar ahora un cliente

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    //-------------------   ACTUALIZAR de 2 tablas   -----------------------
    public boolean editar(DTrabajador dts) {
        //actualizando la tabla persona
        sql = "update persona set nombre=?, apaterno=?,amaterno=?,tipo_documento=?,num_documento=?, direccion=?, telefono=?, email=? where idpersona=?";
        
        //actualizando la tabla cliente
        sql2 = "update trabajador set sueldo=?,login=?,acceso=?,password=?,estado=? where idpersona=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);//tabla persona
            PreparedStatement pst2 = cn.prepareStatement(sql2);//tabla trabajador

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApaterno());
            pst.setString(3, dts.getAmaterno());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());
            pst.setInt(9, dts.getIdpersona());

            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());
            pst2.setInt(6, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {//si se ha insertado registros en la tabla persona entonces si puedo insertar ahora un cliente

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    //-------------------   ELIMINAR    -----------------------
    public boolean eliminar(DTrabajador dts) {

        sql = "delete from trabajador where idpersona=?";//eliminando primero d emi tabla trabajador para despues eliminarlo de la tabla persona

        sql2 = "delete from persona where idpersona=?";//eliminandolo de la tabla persona
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);//tabla persona
            PreparedStatement pst2 = cn.prepareStatement(sql2);//tabla cliente

            pst.setInt(1, dts.getIdpersona());

            pst2.setInt(1, dts.getIdpersona());

            
            int n = pst.executeUpdate();

            if (n != 0) {//si se ha insertado registros en la tabla persona entonces si puedo insertar ahora un cliente

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
}
