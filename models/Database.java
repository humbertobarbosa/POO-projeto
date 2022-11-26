package models;
import models.product.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Database {
    public static Database instance;
    private ArrayList<User> users;
    private ArrayList<Product> products;
    private Database(){

        users = new ArrayList<User>();
        users.add(new Admin("Arthur", "arthur@gmail.com", "123456", new Date(2002, 5, 14), "abc"));
        products = new ArrayList<Product>();
    }
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void createUser(String name, String email, String password, String repeatPassword, Date birthDate){
        if(password.equals(repeatPassword)){
            if(getUserByEmail(email) != null){
                Client a = new Client(name, email, password, birthDate);
                users.add(a);
            }
        }else{
            System.out.println("Senhas não coincidem");
        }
    }
    public void removeUser(String email){
        users.remove(getUserByEmail(email));
    }
    public User getUserByEmail(String email){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getEmail().equals(email)){
                return users.get(i);
            }
        }
        return null;
    }
    public void createCap(String name, int id, float originalPrice, float currentPrice, Product.CapType type, String[] colors){
        if(getProductByID(id) != null){
            Product a = new Product(name, id, originalPrice, currentPrice, type, colors);
        }else{
            System.out.println("Esse id já esta cadastrado");
        }
    }
    public void removeCap(int id){
        products.remove(getProductByID(id));
    }
    public Product getProductByID(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                return products.get(i);
            }
        }
        return null;
    }
    public void promoteUser(String email, String accessKey){
       User a = getUserByEmail(email);
       Admin admin = new Admin(a.getName(), a.getEmail(), a.getPassword(), a.getBirthDate(), accessKey);
    }

}
