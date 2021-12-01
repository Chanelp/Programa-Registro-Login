package login_registro_diseño;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINERD
 */
public class Mi_CNX {
    
    private static String servidor = "localhost";
    private static String nusuario = "root";
    private static String dbnombre = "usuarios_db";
    private static int puertonum = 3306;
    private static String contrasena = "password";
    
    
    public static Connection getConnection(){
    
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servidor);
        datasource.setUser(nusuario);
        datasource.setPassword(contrasena);
        datasource.setDatabaseName(dbnombre);
        datasource.setPortNumber(puertonum);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("  Conseguir Conección ->" + Mi_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
}
