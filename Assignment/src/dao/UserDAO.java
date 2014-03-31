package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.User;

public class UserDAO {
	public static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	
	public void insert(User user){
		try {
			conn = DriverManager.getConnection(url, "hr", "hr");
			pstmt = conn.prepareStatement("insert into userlogin values(?,?,?,?)");
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPasswd());
			pstmt.setString(3, user.getPasswd());
			pstmt.setInt(4, user.getAge());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
