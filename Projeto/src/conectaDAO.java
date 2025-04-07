
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            //String url = "jdbc:mysql://localhost:3306/leiloes";
            String url = "jdbc:mysql://localhost:3306/leiloes?useSSL=false";
            String user = "root";
            String password = "sql2007BIA";

            conn = DriverManager.getConnection(url, user, password);
           //modo menos segur-> conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=");
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao conetar com o banco de dados (ConectaDAO)" + erro.getMessage());
        }
        return conn;
    }
    
}