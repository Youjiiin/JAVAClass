package Week7.product;

public class Product {
    private int price;
    private int bonusPoint;

    public Product() {}

    public Product(int price){
        this(price, (int)(price * 0.02));
    }
    public Product(int price, int bonusPoint){
        this.price = price;
        this.bonusPoint = bonusPoint;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
