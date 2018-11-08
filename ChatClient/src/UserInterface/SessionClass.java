/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;


import chatTransfer.ThreadBean;
import java.util.ArrayList;
import java.util.List;


public class SessionClass {
    
    
  public static String username;
  public static String nickname;
  public static int    userId;  
  public static int    currentThreadId;  
  public static String currentThreadTitle;  
  public static List<ThreadBean> sessionArray = new ArrayList<ThreadBean>();  
  
}
