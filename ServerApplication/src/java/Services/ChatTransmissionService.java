/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import ClassStructureBeans.ThreadBean;
import DataPersistence.DataPersistenceAgent;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author w1597188
 */
@WebService(serviceName = "ChatTransmissionService")
public class ChatTransmissionService {
    DataPersistenceAgent chats = new DataPersistenceAgent();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "getThreads")
    public java.util.List<ThreadBean> getThreads() {
         return chats.getThreads();
       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMessages")
    public List<String> getMessages(@WebParam(name = "threadId") int threadId) {
        
        return chats.getMessages(threadId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addMessage")
    public Boolean addMessage(@WebParam(name = "id") int id, @WebParam(name = "editor") String editor, @WebParam(name = "message") String message,@WebParam(name = "dateAdded") String dateAdded) {
        //TODO write your implementation code here:
        return chats.addmessage(id, editor, message,dateAdded);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "newThread")
    public int newThread(@WebParam(name = "nickname") String nickname, @WebParam(name = "title") String title) {
        //TODO write your implementation code here:
        return chats.newThread(nickname, title);
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
