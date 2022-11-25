package models;

import java.util.Date;

public abstract class User {
    protected String name;
    protected String email;
    protected String password;
    protected Date birthDate;
    public User(String name, String email, String password, Date birthDate){
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public void changeName(String name){
        this.name = name;
    }
}
