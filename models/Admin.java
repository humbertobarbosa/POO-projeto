package models;
import models.product.*;

import java.util.Date;

public class Admin extends User{
    private String accessKey;

    public Admin(String name, String email, String password, String string, String accessKey){
        super(name, email, password, string);
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
    public void createDiscount(String type, int capId, float discount) {
        if (type.equalsIgnoreCase("flat")) {
            FlatDiscount f = new FlatDiscount();
            Product cap = Database.getInstance().getProductByID(capId);
            f.addDiscount(cap.getOriginalPrice(), discount);
        } else if (type.equalsIgnoreCase("percentage")) {
            PercentageDiscount p = new PercentageDiscount();
            Product cap = Database.getInstance().getProductByID(capId);
            p.addDiscount(cap.getOriginalPrice(), discount);
        }
    }

}
