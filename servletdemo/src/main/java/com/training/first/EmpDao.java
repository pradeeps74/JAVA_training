package com.training.first;
import java.util.*;
import java.sql.*;
public class EmpDao {
    public final static String DB_DRIVER_CLASS="org.postgresql.Driver";
    private static String DB_URL="jdbc:postgresql://localhost:5432/vastpro";
    private static String DB_USER="postgres";
    private static String DB_PASSWORD="postgres";
	public static Connection getConnection() throws SQLException{  
     Connection connection=null;
        try{
        	
            Class.forName(DB_DRIVER_CLASS);  
  
        }
        catch(ClassNotFoundException e)
        {e.printStackTrace();
        }
         connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
           
        return connection;  
    }
    public static int save(Emp e) {  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into employee(id,name,password,email,country) values (?,?,?,?,?)");
            ps.setInt(1,e.getId());  
            ps.setString(2,e.getName());  
            ps.setString(3,e.getPassword());  
            ps.setString(4,e.getEmail());  
            ps.setString(5,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }
        catch(Exception ex){ex.printStackTrace();}  
          
      return status;
}

    public static int update(Emp e) {  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update employee set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id) {  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from employee where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Emp getEmployeeById(int id) {  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Emp> getAllEmployees() {  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}

