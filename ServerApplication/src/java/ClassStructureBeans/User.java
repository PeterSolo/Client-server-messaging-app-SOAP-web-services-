/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassStructureBeans;

/**
 *
 * @author w1597188
 */
public class User {
   private int id; 
   private String nickname;  
   private String username;
   private String password;
    
  public User(){} 
   public User(int id,String nickname, String username, String password){
   this.id=id;
   this.nickname=nickname;
   this.username=username;
   this.password=password;
   }
   public User(String nickname, String username, String password){
   
   this.nickname=nickname;
   this.username=username;
   this.password=password;
   }
   
   public void setId(int id){
   this.id=id;
   }
   public void setNickname(String nickname){
   this.nickname=nickname;
   }
   public void setUsername(String username){
   this.username=username;
   }
   public void setPassword(String password){
   this.password=password;
   }
   
   public int getId(){
   return id;
   }
   
   public String getNickname(){
   return nickname;
   }
   
   public String getUsername(){
   return username;
   }
   
   public String getPassword(){
   return password;
   }
   
   
}
