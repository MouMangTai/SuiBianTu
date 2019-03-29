package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.User;

public class UserDao {
	public UserDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException{
	
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/suibiantu"
				+ "?characterEncoding=UTF-8","root","admin");
		
	}
	public User getUser(String mail,String mima){
		User u = null;
		String sql = "select * from users where mail = ? and mima = ?";
		try(Connection c = getConnection();PreparedStatement s = c.prepareStatement(sql)){
			s.setString(1, mail);
			s.setString(2, mima);
			ResultSet rs = s.executeQuery();
			while(rs.next()){
				u = new User();
				u.setMail(rs.getString(1));
				u.setMima(rs.getString(2));
				u.setName(rs.getString(3));
				u.setXingming(rs.getString(4));
				u.setXingbie(rs.getString(5));
				u.setNianji(rs.getString(6));
				u.setShenfen(rs.getString(7));
				u.setQq(rs.getString(8));
				u.setPhone(rs.getString(9));
				u.setIsAdmin(rs.getInt(10));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	public User getUser(String mail){
		User u = null;
		String sql = "select * from users where mail =?";
		try(Connection c = getConnection();PreparedStatement s = c.prepareStatement(sql)){
			s.setString(1, mail);
			ResultSet rs = s.executeQuery();
			while(rs.next()){
				u = new User();
				u.setMail(rs.getString(1));
				u.setMima(rs.getString(2));
				u.setName(rs.getString(3));
				u.setXingming(rs.getString(4));
				u.setXingbie(rs.getString(5));
				u.setNianji(rs.getString(6));
				u.setShenfen(rs.getString(7));
				u.setQq(rs.getString(8));
				u.setPhone(rs.getString(9));
				u.setIsAdmin(rs.getInt(10));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	public void addUser(String mail,String password,String name,String shenfen){
		String sql = "insert into users (mail,mima,name,shenfen,isAdmin)values(?,?,?,?,?)";
		try(Connection c = getConnection();PreparedStatement s = c.prepareStatement(sql)){
			s.setString(1, mail);
			s.setString(2, password);
			s.setString(3, name);
			s.setString(4, shenfen);
			s.setInt(5, 0);
			s.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateUser(User u){
		String sql = "UPDATE users SET name=?,xingming=?,xingbie=?,nianji=?,shenfen=?,qq=?,phone=? WHERE mail = ?";
		try(Connection c = getConnection();PreparedStatement s = c.prepareStatement(sql)){
			s.setString(1, u.getName());
			s.setString(2, u.getXingming());
			s.setString(3, u.getXingbie());
			s.setString(4, u.getNianji());
			s.setString(5, u.getShenfen());
			s.setString(6, u.getQq());
			s.setString(7, u.getPhone());
			s.setString(8, u.getMail());
			s.execute();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
