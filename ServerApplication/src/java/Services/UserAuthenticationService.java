/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import ClassStructureBeans.User;
import DataPersistence.DataPersistenceAgent;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author w1597188
 */
@WebService(serviceName = "UserAuthenticationService")
public class UserAuthenticationService {
    
    DataPersistenceAgent check = new DataPersistenceAgent();
    
    
    
    
    
    
    
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
    @WebMethod(operationName = "LoginAuthentication")
    public boolean LoginAuthentication(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        System.out.println("in stabbed method");
        return check.checkValidity(username, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registerUser")
    public Boolean registerUser(@WebParam(name = "user") User user) {
        
        return check.registerUser(user);
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNickName")
    public String getNickName(@WebParam(name = "nickname") String nickname) {
        //TODO write your implementation code here:
        return check.getNickname(nickname);
    }





































}
