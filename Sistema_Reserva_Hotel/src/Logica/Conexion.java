
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexion {
    
    public String db = "bd_reserva_hotel";
    public String url = "jdbc:mysql://127.0.0.1/"+db;
    public String user = "root";
    public String pass = "root";
    
    
    public Conexion(){
        
    }
    
    
    public Connection conectar(){
        
        Connection con = null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");//cargando el driver de la conexion 
            
            con = DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return con;
    }
    
}
