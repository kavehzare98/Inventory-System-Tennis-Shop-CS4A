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

    // PLEASE FIX THESE, had to add these in just to compile.
    @Override
    public String getInfo() {
        return "getInfo() function for SportsApparel";
    }

    // @Override
    // public float calculateRestockCost(int quantity) {
    //     // Just to test
    //     System.out.println("calculateRestockCost() function called by SportsApparel");
    //     return 0.00f;    // change this line
    // }


}
