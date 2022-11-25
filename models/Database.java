import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database {
    public static final Database INSTANCE = new Database();
    private ArrayList<User> users;
    private ArrayList<Product> products;
    private Database(){

        users = new ArrayList<>();
        products = new ArrayList<Product>();
    }
    public static Database getInstance(){
        return INSTANCE;
    }

    public void CreateUser(String name, String email, String password, String repeatPassword, Date birthDate){
        if(password.equals(repeatPassword)){
            if(!getUserByEmail(email)){
                Client a = new Client(name, email, password, birthDate);
                users.add(a);
            }
        }else{
            System.out.println("Senhas não coincidem");
        }
    }
    public void RemoveUser(String email){
        users.remove(getUserByEmail(email));
    }
    public User getUserByEmail(String email){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getEmail.equals(email)){
                return  users.get(i);
            }
        }
    }
    public void CreateCap(String name, int id, float originalPrice, float currentPrice, CapType type, String colors){
        if(!getProductByID(id)){
            Product a = new Product(name, id, originalPrice, currentPrice, type, colors);
        }else{
            System.out.println("Esse id já esta cadastrado");
        }
    }
    public void RemoveCap(int id){
        products.remove(getProductByID(id));
    }
    public User getUserByEmail(String email){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getEmail.equals(email)){
                return  users.get(i);
            }
        }
    }
    public Product getProductByID(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId == id){
                return Product;
            }
        }
    }

}
