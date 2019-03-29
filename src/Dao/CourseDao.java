package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bean.Course;

public class CourseDao {
	public CourseDao(){
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
	public List<Course> ListCourseByLaiYuan(String name){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class where laiyuan like '%"+name+"%'";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
	public List<Course> ListCourseByType(String name){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class where leixing like '%"+name+"%'";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
	public List<Course> ListCourseByCost1(){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class order By cost";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
	public List<Course> ListCourseByCost2(){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class order By cost desc";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
	public List<Course> ListCourseByRenQi1(){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class order By renqi";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
	public List<Course> ListCourseByRenQi2(){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class order By renqi desc";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
	public List<Course> ListCourse(){
		List<Course> L = new ArrayList<Course>();
		String sql="select * from class";
		try(Connection c = getConnection();Statement s = c.createStatement()){
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				Course w = new Course();
				w.setName(rs.getString(1));
				w.setKemu(rs.getString(2));
				
				w.setNianji(rs.getString(3));
				w.setLeixing(rs.getString(4));
				w.setLaiyuan(rs.getString(5));
				w.setRenqi(rs.getInt(6));
				w.setCost(rs.getDouble(7));
				L.add(w);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return L;
	}
}
