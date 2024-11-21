/*
* Kelly Dempster : Project 2 InventoryItem Class
* */

package inventory;

public abstract class InventoryItem {
    private String itemID;
    private String brandName;
    private int stockQuantity;
    private float price;
    private float purchaseCost;
    private String sport;
    private String description;

    // Construct an item object with null values
    protected InventoryItem(){
        itemID = "00";
        brandName = "null";
        stockQuantity = 0;
        price = 0f;
        purchaseCost = 0f;
        sport = "null";
        description = "null";
    }

    protected InventoryItem(String itemID, String brandName, int stockQuantity, float price,
                            float purchaseCost, String sport, String description){
        this.itemID = itemID;
        this.brandName = brandName;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.purchaseCost = purchaseCost;
        this.sport = sport;
        this.description = description;
    }

    /* Getters and Setters for class members...lines 33 to 88 */
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(float purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /* END of getters/setters */

    /* Returns if Item is in stock */
    public boolean isInStock(){
        return (stockQuantity > 0);
    }

    /* Adds quantity to stockQuantity if quantity is valid (positive value) */
    public void restock(int quantity){
        if (quantity > 0) {
            stockQuantity += quantity;
        }
        else{
            System.out.println("[ERR] Stock input must be positive.");
        }
    }

    /* Removes quantity from stock if Items are avaliable */
    public void sell(int quantity){
       if (quantity <= 0 || quantity  > stockQuantity)
       {
           System.out.println("[ERR] Quantity (" + quantity + " is greater than stock quantity or invalid format.");
       }
       else
       {
           stockQuantity -= quantity;
       }
    }

    public float calculateRestockCost(int quantity){
        return (quantity * purchaseCost);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(itemID).append("\nBrand: ").append(stockQuantity).append("\nPrice: ").append(price);
        sb.append("\nPurchase Cost: ").append(purchaseCost).append("\nSport: ").append(sport).append("\nDescription:");
        sb.append(description);

        return sb.toString();
    }

    public abstract String getInfo();

} // END class InventoryItem
