package Logica;

import Datos.DCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LCliente {

    private Conexion mysql = new Conexion();

    private Connection cn = mysql.conectar();

    private String sql = "";
    private String sql2 = "";

    public Integer totalRegistros;

    //---------------------     MOSTRARs  --------------------- 
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"ID", "8ombre", "Ape. Paterno", "Ape. materno", "Doc", "Num. Documento", "Dirección", "Teléfono", "Email", "Código"};//vector para guardar los titulos de las culumnas

        String[] registro = new String[10];//almacenará los registros de c/u de esos titulos

        totalRegistros = 0;

        modelo = new DefaultTableModel(null, titulos);

        sql = "Select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento, p.direccion, p.telefono,p.email,c.codigo_cliente "
                + "from persona as p inner join cliente as c on p.idpersona=c.idpersona "
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
                registro[9] = rs.getString("codigo_cliente");

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
    public boolean insertar(DCliente dts) {
        //insertando en la tabla persona
        sql = "insert into persona (nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email) values (?,?,?,?,?,?,?,?)";

        //insertando a esa persona en la tabla cliente
        sql2 = "insert into cliente(idpersona,codigo_cliente) values ((select idpersona from persona order by idpersona desc limit 1),?)";//1er parametro se saca de la ultima persona insertada en la tabla persona y el 2do parametro sera ingresada por parametro

        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            PreparedStatement pst2 = cn.prepareStatement(sql2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApaterno());
            pst.setString(3, dts.getAmaterno());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());

            pst2.setString(1, dts.getCodigo_cliente());

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

    //-------------------   ACTUALIZAR de 2 tablas   -----------------------
    public boolean editar(DCliente dts) {
        //actualizando la tabla persona
        sql = "update persona set nombre=?, apaterno=?,amaterno=?,tipo_documento=?,num_documento=?, direccion=?, telefono=?, email=? where idpersona=?";
        
        //actualizando la tabla cliente
        sql2 = "update cliente set codigo_cliente=? where idpersona=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);//tabla persona
            PreparedStatement pst2 = cn.prepareStatement(sql2);//tabla cliente

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApaterno());
            pst.setString(3, dts.getAmaterno());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());
            pst.setInt(9, dts.getIdpersona());

            pst2.setString(1, dts.getCodigo_cliente());
            pst2.setInt(2, dts.getIdpersona());

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
    public boolean eliminar(DCliente dts) {

        sql = "delete from cliente where idpersona=?";//eliminando primero d emi tabla persona para despues eliminarlo de la tabla persona

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
