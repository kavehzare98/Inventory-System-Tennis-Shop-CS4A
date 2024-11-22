package inventory;

import inventory.InventoryItem;

public class SportsApparel extends InventoryItem{
    private String apparelCategory;
    private String size;
    private String color;

    public SportsApparel(){
        super();
        apparelCategory = "NAME-CATEGORY";
        size = "SIZE";
        color = "COLOR";
    }
    
    public SportsApparel(String itemID, String brandName, int stockQuantity, float price,
    float purchaseCost, String sport, String description, String apparelCategory, String size, String color){
        // super();
        // this.apparelCategory = apparelCategory;
        // this.size = size;
        // this.color = color;
        
    }


    public String getApparelCategory() {
        return apparelCategory;
    }
    public void setApparelCategory(String apparelCategory) {
        this.apparelCategory = apparelCategory;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    };

    @Override
    public String getInfo() {
        return String.format("\nSports Apparel Details:\n\n" +
                         "Item ID: %d\n" +        // %d for integer ID
                         "Brand Name: %s\n" +     // %s for String brand name
                         "Apparel Category: %s\n" + // %s for String category
                         "Size: %s\n" +           // %s for String size
                         "Color: %s \n" +         // %s for String color
                         "Description: %s \n" +   // %s for String description
                         "Price: $%.2f\n" +       // %.2f for float price
                         "Stock Quantity: %d",    // %d for integer quantity
                         super.getItemID(),
                         super.getBrandName(),
                         apparelCategory,
                         size,
                         color,
                         super.getDescription(),
                         super.getPrice(),
                         super.getStockQuantity());
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Apperal Category: ").append(apparelCategory).append("\nSize: ").append(size).append("\nColor: ");
        sb.append(color);
        sb.append("\nID: ").append(super.getItemID()).append("\nBrand: ").append(super.getStockQuantity()).append("\nPrice: ").append(super.getPrice());
        sb.append("\nPurchase Cost: ").append(super.getPurchaseCost()).append("\nSport: ").append(super.getSport()).append("\nDescription:");
        sb.append(super.getDescription());

        return sb.toString();
    }
    // @Override
    // public float calculateRestockCost(int quantity) {
    //     // Just to test
    //     System.out.println("calculateRestockCost() function called by SportsApparel");
    //     return 0.00f;    // change this line
    // }


}
