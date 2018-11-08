/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPersistence;

import ClassStructureBeans.ThreadBean;
import ClassStructureBeans.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author w1597188
 */
public class DataPersistenceAgent {
    
    
    public static void main(String[] args){
    DataPersistenceAgent test = new DataPersistenceAgent();

    getConnection();
    }
    
    
    public static Connection getConnection(){
    Connection connection=null;

try{
   
  Class.forName("com.mysql.jdbc.Driver");
  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatsystem", "Yourusername", "Yourpassword");

  
  System.out.println("Connection to database made");
  
 
 }catch(SQLException exception){
  exception.printStackTrace();
 }catch(ClassNotFoundException exc){
     exc.printStackTrace();
  }

return connection;
}
  
 public boolean checkValidity(String username,String password){
  boolean result=false;
  try{
  Connection connection =getConnection();
  String sql="Select username,password from userdetails where username=? and password=?";
  PreparedStatement statement=connection.prepareStatement(sql);
  statement.setString(1, username);
  statement.setString(2, password);
  ResultSet set=statement.executeQuery();
  while(set.next()){
   result=true;
  }
  connection.close();
  }catch(SQLException exc){
  exc.printStackTrace();
  }
  
  
  return result; 
  }


 public boolean registerUser(User user){
 boolean result=false;
 int rowsAffected=0;
 try{
  Connection connection =getConnection();
  String sql="insert into userdetails (username,password,nickname) values(?,?,?)";
  PreparedStatement statement=connection.prepareStatement(sql);
  statement.setString(1,user.getUsername());
  statement.setString(2, user.getPassword());
  statement.setString(3,user.getNickname());
  
  rowsAffected=statement.executeUpdate();
  
  connection.close();
  }catch(SQLException exc){
  exc.printStackTrace();
  }
 if(rowsAffected>0){result=true;}
 return result ;
 }



public int getThreadId(String name){
int id=0;

try{
  Connection connection =getConnection();
  String sql="Select threadId from threads where lasteditor=?";
  PreparedStatement statement=connection.prepareStatement(sql);
  statement.setString(1, name);
  ResultSet set=statement.executeQuery();
  while(set.next()){
  id=set.getInt(1);
          }
connection.close();  
}catch(SQLException exc){
  exc.printStackTrace();
  }
  System.out.println(id);
  return id;
}



public String getNickname(String username){
  String nickN="";
  try{
  Connection connection =getConnection();
  String sql="Select nickname from userdetails where username=?";
  PreparedStatement statement=connection.prepareStatement(sql);
  statement.setString(1, username);
  ResultSet set=statement.executeQuery();
  while(set.next()){
  nickN=set.getString(1);
          }
  connection.close();
  }catch(SQLException exc){
  exc.printStackTrace();
  }
    System.out.println(nickN);
   return nickN;
}


public List<ThreadBean> getThreads(){
     ResultSet set1=null;
     ResultSet set2=null;
     int id=0;
  List<ThreadBean> arrayList = new ArrayList<>();
  
  try{
  Connection connection1 =getConnection();
  Connection connection2 =getConnection();
  String sql0="Select * from threads";
  Statement statement = connection1.createStatement();
  set1=statement.executeQuery(sql0);
  
  while(set1.next()){
  ThreadBean threadB = new ThreadBean();
  threadB.setthreadId(set1.getInt("threadId"));
  
  id=set1.getInt("threadId");
  
  String sql02="Select editor,text from chats where threadId=?";
  PreparedStatement statement1 = connection2.prepareStatement(sql02);
  statement1.setInt(1,id);
  set2=statement1.executeQuery();
  HashMap<String, ArrayList<String>> hmap = new HashMap<String, ArrayList<String>>();
   
  
  
  
  while(set2.next()){
   String key=set2.getString("editor");
   String value= set2.getString("text");  
    
    ArrayList<String> list = hmap.get(key);
    if (list == null)
{
    list = new ArrayList<String>();
    list.add(value);
    hmap.put(key, list);
}
    else{ 
   hmap.put(key,list);
    
    }
  }
      System.out.println(hmap.size());
       System.out.println(hmap);
  threadB.setMessage(hmap);
  threadB.seteditor(set1.getString("lasteditor"));
  threadB.setLastPersonEditor(set1.getString("lasteditor"));
  threadB.setDate(set1.getString("editdate"));
  threadB.setTitle(set1.getString("title"));
  arrayList.add(threadB);
  }
  
  connection1.close();
  connection2.close();
  }catch(SQLException exc){
  exc.printStackTrace();
  }
    
  
  return arrayList;


}



public int newThread(String nickname,String title){
boolean result=false;
int rowsAffected=0;
int returnID=0;
 SimpleDateFormat dateformat = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
 Date date = new Date();
 String creationDate=dateformat.format(date);
 try{
  Connection connection =getConnection();
  String sql="insert into threads (lasteditor,editdate,title) values(?,?,?)";
  PreparedStatement statement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
  statement.setString(1,nickname);
  statement.setString(2,creationDate);
  statement.setString(3,title);
  rowsAffected=statement.executeUpdate();
  ResultSet rs=statement.getGeneratedKeys();
  if(rs.next()){ returnID=rs.getInt(1);
      System.out.println(returnID);}
 connection.close(); 
 }catch(SQLException exc){
  exc.printStackTrace();
  }

 if(rowsAffected!=0){
   return returnID;}
 else
 return 0;

}


public boolean addmessage(int id, String editor, String message,String dateAdded){
boolean result = false;
int rowsAffected=0;
 try{
  Connection connection =getConnection();
  String sql="insert into chats (threadId,editor,text,dateAdded) values(?,?,?,?)";
  PreparedStatement statement=connection.prepareStatement(sql);
  statement.setInt(1,id);
  statement.setString(2,editor);
  statement.setString(3,message);
  statement.setString(4,dateAdded);
  rowsAffected=statement.executeUpdate();
  
  connection.close();
  }catch(SQLException exc){
  exc.printStackTrace();
  }

 if(rowsAffected!=0){result=true;}

return result;
}
  
    
    
 public  List<String> getMessages(int Id){
    String id=Integer.toString(Id);
    List<String> messages = new ArrayList<>();
 try{
  Connection connection =getConnection();
  String sql="Select editor,text,dateAdded from chats where threadId=?";
  PreparedStatement statement=connection.prepareStatement(sql);
  statement.setString(1, id);
  ResultSet set=statement.executeQuery();
  while(set.next()){
   String key=set.getString("text");
   String value= set.getString("dateAdded");  
   String value1= set.getString("editor");  
   messages.add(key);
   messages.add(value); 
   messages.add(value1);
      
}
  connection.close();
  }catch(SQLException exc){
  exc.printStackTrace();
  }
 for(String item: messages){System.out.println(item);}
 return messages;
}   
    
    
    
}
