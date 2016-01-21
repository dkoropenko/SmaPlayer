/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vk;

import org.apache.http.client.HttpClient;

/**
 *
 * @author koropenkods
 */
public class Authorization {
    private String login;
    private String password;
    private String URL;
    
    private int appID = 5235983;
    private String redirect_uri = "http://oauth.vk.com/blank.html";
    private String display = "popup";
    private String responseType = "token";
    
    
    public Authorization(String login, String Password){
        this.login = login;
        this.password = password;
    }   
    
    public void getToken(){
        //HttpClient vkClient = DefaultHttpClient();
        URL = "https://oauth.vk.com/authorize?"
                + "client_id="+ appID 
                + "&redirect_uri="+ redirect_uri
                + "&display="+ display
                + "&response_type="+ responseType;
                
    }
    
    public static void main(String[] args) {
    }
    
}
