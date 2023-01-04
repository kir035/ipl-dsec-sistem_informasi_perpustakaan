package perpustakaan;
/**
 *
 * @author Enigma
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url;
                url="jdbc:http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=sisteminformasiperpus";
                String user ="root";
                String pass= "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            }catch (SQLException t){
                JOptionPane.showMessageDialog(null, "Koneksi Error");
            }
        }return koneksi;
    }static Object getConnection(){
            throw new UnsupportedOperationException("Not Yet Implemented");
    }
}