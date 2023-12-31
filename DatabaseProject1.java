import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseProject1 {
    public static void main(String[] args) {
        DatabaseProject1 pro = new DatabaseProject1();
        pro.createConnection();
    }

    void createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "root");
            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("Select * from users");
            ResultSet rs = stmt.executeQuery("Select * from users where name like 'A%'");
            while(rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }
            System.out.println("Database Connection Success");
        }catch (ClassNotFoundException ex){
            Logger.getLogger(DatabaseProject1.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(DatabaseProject1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
