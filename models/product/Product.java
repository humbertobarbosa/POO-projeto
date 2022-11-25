package models.product;

public class Product {

    public enum CapType {
        TRUCKER,
        FLAT_BRIM,
        CURVED_BRIM,
        SNAPBACK,
        DAD_HAT,
        PANEL,
        STRAPBACK,
    }
  
    private String name;
    private int id;
    private float originalPrice, currentPrice;
    private CapType type;
    private String colors[];
    
    public Product(String name, int id, float originalPrice, float currentPrice, CapType type, String[] colors) {
        this.name = name;
        this.id = id;
        this.originalPrice = originalPrice;
        this.currentPrice = currentPrice;
        this.type = type;
        this.colors = colors;
    }
    
    public void changePrice(float newPrice) {
        this.originalPrice = newPrice;
    }

    public void addDiscount(float discount) {
        this.currentPrice -= discount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public float getCurrentPrince() {
        return currentPrice;
    }

}
