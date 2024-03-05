package com.system.Library.UserData;

import java.util.LinkedList;

public class UserData {
    
    private int userId;
    private String userName;
    private String password;
    
    public static LinkedList<UserData> userList= new LinkedList<>();
    
    static {
        userList.add(new UserData(101,"Venkat","1234"));
        userList.add(new UserData(102,"Roshan","1234"));
        userList.add(new UserData(103,"Madhu","1234"));
    }
    
    public UserData(int userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
    
    public UserData() {
        
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public LinkedList<UserData> returnList(){
        return userList;
    }
    
}
