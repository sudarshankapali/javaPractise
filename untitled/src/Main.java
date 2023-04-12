import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class .forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/sudarshan";
        Connection conn = DriverManager.getConnection(url,"root","root");
        System.out.println("connection success");

        //lets create the query
        Statement stm = conn.createStatement();
        ResultSet rs =  stm.executeQuery("select * from new_table");
//        System.out.println(rs.getNextResultset());
        while (rs.next()){
            String id = rs.getString("ID");
            String name = rs.getString("Name");
            String address = rs.getString("Address");
            System.out.println(id);
            System.out.println(name);
            System.out.println(address);
        }
    }
}
