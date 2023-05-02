import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/assignment";
        Connection conn = DriverManager.getConnection(url,"root","root");
        System.out.println("connection succeded");
        //executing queries
        Statement stm = conn.createStatement();
//        stm.executeUpdate("insert into student_info (id,name,class,address,hours) values (9,'test_person3','BIT','Baneshwor',1.00)");
        stm.executeUpdate("update student_info set name ='new person' where id = 6");
        stm.executeUpdate("delete  from student_info where id > 6");
        ResultSet rs = stm.executeQuery("select * from student_info");
        System.out.println("The data in database are:");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String cla = rs.getString("class");
            String add = rs.getString("address");
            double hours = rs.getDouble("hours");
            System.out.printf(String.valueOf(id)+"\t");
            System.out.printf(name+"\t\t\t\t");
            System.out.printf(cla+"\t");
            System.out.printf(add+"\t\t");
            System.out.printf(String.valueOf(hours)+"\t");
            System.out.println();
        }
    }
}