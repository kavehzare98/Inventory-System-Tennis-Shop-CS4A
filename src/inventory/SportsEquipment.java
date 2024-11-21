package inventory;

public class SportsEquipment extends InventoryItem {
    // Private attributes
    private String sportName;
    private String equipmentCategory;
    private String model;
    private String size;
    private float weightInGrams;

    // Default constructor
    public SportsEquipment() {
        super(); // Call parent's default constructor
        sportName = "SPORT NAME";
        equipmentCateogry = "CATEGORY";
        model = "MODEL";
        size = "SIZE";
        weightInGrams = 0.00;
    }

    // Parameterized constructor
    public SportsEquipment(String itemID, String name, float price, int stockQuantity,
                           String sportName, String equipmentCategory, 
                           String model, String size, float weightInGrams) {
        // Added full parent constructor call with all required parameters
        super(itemID, name, price, stockQuantity);
        
        this.sportName = sportName;
        this.equipmentCategory = equipmentCategory;
        this.model = model;
        this.size = size;
        this.weightInGrams = weightInGrams;
    }

    // Getters and Setters
    public String getSportName() {
        return sportName;
    }

    public void setSportName(String name) {
        // Added input validation
        this.sportName = (name != null && !name.trim().isEmpty()) ? name : this.sportName;
    }

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

    public String[] getSize() {
        // Return a defensive copy to prevent external modification
        return size != null ? size.clone() : null;
    }

    public void setSize(String size) {
        // Deep copy of input array
        this.size = size != null ? size.clone() : null;
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
        StringBuilder sizeStr = new StringBuilder();
        if (size != null && size.length > 0) {
            for (int i = 0; i < size.length; i++) {
                sizeStr.append(size[i]);
                if (i < size.length - 1) {
                    sizeStr.append(", ");
                }
            }
        } else {
            sizeStr.append("No sizes specified");
        }
        
        return String.format("Sports Equipment Details:\n" +
                             "Item ID: %s\n" +
                             "Name: %s\n" +
                             "Sport Name: %s\n" +
                             "Equipment Category: %s\n" +
                             "Model: %s\n" +
                             "Size(s): %s\n" +
                             "Weight: %.2f grams\n" +
                             "Price: $%.2f\n" +
                             "Stock Quantity: %d",
                             getItemID(),
                             getName(),
                             sportName, 
                             equipmentCategory, 
                             model, 
                             sizeStr.toString(), 
                             weightInGrams,
                             getPrice(),
                             getStockQuantity());
    }

    // Added toString() method for printing
    @Override
    public String toString() {
        return getInfo();
    }
}
