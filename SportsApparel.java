class SportsApparel
{
    private String apparelCategory;
    private String size;
    private String color;

    SportsApparel(){
        super();
        apparelCategory = "NAME-CATEGORY";
        size = "SIZE";
        color = "COLOR";
    }
    
    SportsApparel(String itemID, String brandName, int stockQuantity, float price,
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


}