package menu;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class koneksi {
    private String url = "jdbc:mysql://localhost:3306/bakery";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }

    public Connection getCon() {
        return con;
    }   
}
