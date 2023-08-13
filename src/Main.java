import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            String url ="jdbc:mysql://localhost:3306/student";
            String uname ="root";
            String pass="Piash328911*#*";
            int id = 5;
            String dob= "1999-07-11";
            String email="haque@gmail.com";
            String name="Ashraful Haque";
            String query = "insert into student values(?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,id);
            st.setString(2,dob);
            st.setString(3,email);
            st.setString(4,name);
            int count = st.executeUpdate();
            System.out.println(count+ " row/s affected");


//            while(rs.next()) {
//                String userData = rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getString(3) + ": " + rs.getString(4);
//                System.out.println(userData);
//            }
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Not connected");
        }
    }
}