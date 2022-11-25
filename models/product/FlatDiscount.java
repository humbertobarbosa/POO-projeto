package models.product;

public class FlatDiscount implements IDiscount {

    @Override
    public float getDiscount(float originalPrice, float discount) {
        if (discount < originalPrice) {
            originalPrice -= discount;
        }
        
        return originalPrice;
    }
    
}
