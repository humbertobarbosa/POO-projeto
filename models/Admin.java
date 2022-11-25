package models;
import models.product.*;

import java.util.Date;

public class Admin extends User{
    private String accessKey;

    public Admin(String name, String email, String password, Date birthDate, String accessKey){
        super(name, email, password, birthDate);
        this.accessKey = accessKey;
    }
    public void removeCap(int id){
        Database.getInstance().removeCap(id);
    }
    public void createCap(String name, int id, float originalPrice, float currentPrice, Product.CapType type, String[] colors){
        Database.getInstance().createCap(name, id, originalPrice, currentPrice, type, colors);
    }
    public void promoteUser(String email, String accessKey){
        Database.getInstance().promoteUser(email, accessKey);
    }

}
