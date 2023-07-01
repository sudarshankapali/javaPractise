import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/sudarshan";
        Connection conn = DriverManager.getConnection(url,"root", "root");
        System.out.println("Connection success");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from new_table");
        while(rs.next()){
            int id = rs.getInt("ID");
            String name = rs.getString("Name");
            String address = rs.getString("Address");
            System.out.println(id+" "+name+" "+address);
        }
//        stm.executeUpdate("update new_table set Name = 'Sudarshan kapali' where ID=1");
//        stm.executeUpdate("delete from new_table where id = 2");
//        stm.executeUpdate("insert into new_table (Name,Address) values ('nirendra','basantapur')");
//        stm.executeUpdate("insert into new_table (Name,Address) values ('rohan','kathmandu')");
////prepaid statement
//        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM new_table WHERE id=?");
//        preparedStatement.setInt(1,3);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (rs.next()){
//            String name = rs.getString("name");
//            System.out.println(name);
//        }
    }
}