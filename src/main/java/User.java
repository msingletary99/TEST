/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */

public class User {
    public String userName;
    public String password;
    public float dailyLoggedOnHours;
    public String email;
    
    public static void main(String[] args) {
    
}
   
    

public void User(String email, String username, String password, float dailyLoggedOnHours){

    this.email=email;
    this.userName=username;
    this.password=password;
    this.dailyLoggedOnHours=dailyLoggedOnHours;
    
}

public void User(){
    email="";
    userName="";
    password="";
    dailyLoggedOnHours=0;
    
}

public float calculateYearlyLoggedOnHours(float dailyLoggedOnHours){
    float yearlyLoggedOnHours = dailyLoggedOnHours*365;
    return yearlyLoggedOnHours;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email=email;
}

public String getUserName(){
    return userName;
}

public void setUserName(String username){
    this.userName=username;
}
public String getPassword(){
    return password;
}
public void setPasword(String password){
    this.password=password;
    
}

public float getDailyLoggedOnHours(){
    return dailyLoggedOnHours;
    
}
public void setDailyLoggedOnHours(){
    this.dailyLoggedOnHours=dailyLoggedOnHours;
}
}
