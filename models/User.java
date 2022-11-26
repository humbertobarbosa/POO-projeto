package models;

public abstract class User {
    protected String name;
    protected String email;
    protected String password;
    protected String birthDate;
    public User(String name, String email, String password, String birthDate){
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

    public String getEmail(){
        return email;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPassword() {
        return password;
    }
}
