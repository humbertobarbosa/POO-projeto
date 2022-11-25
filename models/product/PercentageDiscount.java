package models.product;

public class PercentageDiscount implements IDiscount {

    @Override
    public float addDiscount(float originalPrice, float discount) {
        if (discount >= 1 && discount < 100) {
            discount /= 100;
            originalPrice *= (1 - discount);
        } else if (discount > 0 && discount < 1) {
            originalPrice *= (1 - discount);
        }
        
        return originalPrice;
    }
    
}
