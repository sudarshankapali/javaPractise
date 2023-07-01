import java.sql.*;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/sudarshan";
        try {
            Connection conn = DriverManager.getConnection(url,"root","root");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from new_table");
            while(rs.next()){
                int ID = rs.getInt("ID");
                String name = rs.getString("Name");
                System.out.println(ID +"->"+name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}