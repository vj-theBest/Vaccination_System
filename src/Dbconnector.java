import java.sql.*;
public class Dbconnector {

	public static void main(String[] args)throws Exception {
	String url="";
	String uname="root";
	String pass ="";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,uname,pass);

	}

}
