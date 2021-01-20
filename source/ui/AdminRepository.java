//package repositories;
import java.sql.*;
public class AdminRepository{
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;

    public AdminRepository(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_admin","root","");
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public boolean getUserValidity(String username,String password){
        try{
            query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }

    }

    public boolean insertUserIntoDB(String username,String password){
        try{
            query="INSERT INTO users(username,password) VALUES('"+username+"','"+password+"')";
            int i=stmt.executeUpdate(query);
            if(i==1){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }

    }
  }
