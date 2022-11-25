package models.product;

public interface IDiscount {

    public abstract float getDiscount(float originalPrice, float discount);
    
}
