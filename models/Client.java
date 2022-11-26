package models;
import models.product.*;

import java.util.ArrayList;

public class Client extends User{
    private Cart cart;


    public Client(String name, String email, String password, String birthDate){
        super(name, email, password, birthDate);
        cart = new Cart(new ArrayList<>());
    }
    public void addToCart(Product item){
        cart.addItem(item);
    }

    public void removeFromCart(int id){
        cart.removeCap(id);
    }


}
