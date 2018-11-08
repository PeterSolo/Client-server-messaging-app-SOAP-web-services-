/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassStructureBeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author w1597188
 */
public class ThreadBean {
    private String title;
    private String LastManEditor;
    private HashMap<String, ArrayList<String>> Message = new HashMap<String, ArrayList<String>>();
    private String date;
    private int threadId;
    private String LastPersonEditor;

   
   
   public ThreadBean(){} 
    public ThreadBean(String title, String LastEditor, HashMap<String,ArrayList<String>> Message, String date, int threadId){
    this.title=title;
    this.LastManEditor=LastEditor;
    this.Message=Message;
    this.date=date; 
    this.threadId=threadId;
    }
    
     public void setLastPersonEditor(String LastPersonEditor) {
        this.LastPersonEditor = LastPersonEditor;
    }

    public String getLastPersonEditor() {
        return LastPersonEditor;
    }
    
    public void setTitle(String title){
    this.title=title;
    }
    
     public void seteditor(String editor){
    this.LastManEditor=editor;
    }
    
     public void setMessage(HashMap<String,ArrayList<String>> Message){
    this.Message=Message;
    }
    
    public void setDate(String date){
    this.date=date;
    }
    
    public String getTitle(){
    return title;
    }
    
     public String getEditor(){
    return LastManEditor;
    }
    
     public HashMap<String,ArrayList<String>> getMessage(){
      return Message;
     }
    
     public String getDate(){
    return date;
    }
     public int getthreadId(){
    return threadId;
    }
     public void setthreadId(int id){
    this.threadId=id;
    }
    
    
    
    
}
