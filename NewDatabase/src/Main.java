import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/sudarshan";
        Connection conn = DriverManager.getConnection(url,"root", "root");
        System.out.println("Connection sucess");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from new_table");
        while(rs.next()){
            String name = rs.getString("Name");
            System.out.println(name);
        }
        stm.executeUpdate("update new_table set Name = 'Sudarshan kapali' where ID=1");
//        stm.executeUpdate("delete from new_table where id = 2");
//        stm.executeUpdate("insert into new_table (Name,Address) values ('nirendra','basantapur')");
        stm.executeUpdate("insert into new_table (Name,Address) values ('rohan','kathmandu')");

    }
}