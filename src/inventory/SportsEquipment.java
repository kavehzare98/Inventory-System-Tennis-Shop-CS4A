package inventory;

public class SportsEquipment extends InventoryItem {
    // Private attributes
    private String equipmentCategory;
    private String model;
    private String size;
    private float weightInGrams;

    // Default constructor
    public SportsEquipment() {
        super(); // Call parent's default constructor
        equipmentCategory = "CATEGORY";
        model = "MODEL";
        size = "SIZE";
        weightInGrams = 0.00f;
    }

    // Parameterized constructor
    public SportsEquipment(int itemID, String brandName, float price, int stockQuantity,
                           float purchaseCost, String sport, String description, String equipmentCategory,
                           String model, String size, float weightInGrams) {
        // Added full parent constructor call with all required parameters
        super(itemID, brandName, stockQuantity, price, purchaseCost, sport, description);
        
        this.equipmentCategory = equipmentCategory;
        this.model = model;
        this.size = size;
        this.weightInGrams = weightInGrams;
    }

    // Getters and Setters
    public String getEquipmentCategory() {
        return equipmentCategory;
    }

    public void setEquipmentCategory(String category) {
        // Added input validation
        this.equipmentCategory = (category != null && !category.trim().isEmpty()) ? category : this.equipmentCategory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        // Added input validation
        this.model = (model != null && !model.trim().isEmpty()) ? model : this.model;
    }

    public String getSize() {
        // Return a defensive copy to prevent external modification
        // return size != null ? size.clone() : null;
        return size;
    }

    public void setSize(String size) {
        // Deep copy of input array
        this.size = size; // -!= null ? size.clone() : null;
    }

    public float getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(float weight) {
        // Void return type, added validation
        this.weightInGrams = (weight > 0) ? weight : this.weightInGrams;
    }

    // Override getInfo() method from parent class
    @Override
    public String getInfo() {
        // Null handling and formatting
        // StringBuilder sizeStr = new StringBuilder();
        // if (this.size != null && this.size.length() > 0) {
        //     for (int i = 0; i < this.size.length(); i++) {
        //         sizeStr.append(this.size.charAt(i));
        //         if (i < this.size.length() - 1) {
        //             sizeStr.append(", ");
        //         }
        //     }
        // } else {
        //     sizeStr.append("No sizes specified");
        // }
        
        return String.format("\nSports Equipment Details:\n\n" +
                         "Item ID: %d\n" +        // %d for integer ID
                         "Brand Name: %s\n" +     // %s for String brand name
                         "Equipment Category: %s\n" + // %s for String category
                         "Model: %s\n" +          // %s for String model
                         "Size: %s\n" +           // %s for String size
                         "Weight: %.2f grams\n" + // %.2f for float weight
                         "Description: %s\n" +    // %s for String description
                         "Price: $%.2f\n" +       // %.2f for float price
                         "Stock Quantity: %d",    // %d for integer quantity
                         super.getItemID(),
                         super.getBrandName(),
                         equipmentCategory,
                         model,
                         size,
                         weightInGrams,
                         super.getDescription(),
                         super.getPrice(),
                         super.getStockQuantity());
}

    // Added toString() method for printing
    @Override
    public String toString() {
        return getInfo();
    }
}
