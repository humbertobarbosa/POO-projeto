package models;

import java.util.Date;

public class Client extends User{
    private Cart cart;


    public Client(String name, String email, String password, Date birthDate){
        super(name, email, password, birthDate);
        cart = new Cart();
    }
    public void addToCart(Product item){
        cart.addItem(item);
    }


}
