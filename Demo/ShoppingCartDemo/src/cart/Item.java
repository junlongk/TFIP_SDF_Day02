package cart;

public class Item {
    
    private String code = "";
    private String name = "";
    private Float price = 0f;
    private Integer quantity = 0;

    //cannot create product if no code and name
    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //total cost which multiplies by the price
    public Float getTotalCost() {
        return this.price * this.quantity;
    }

}
