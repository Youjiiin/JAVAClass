package Week7.product;

import Week7.product.Product;

public class Tv extends Product {
    public Tv(){}
    public Tv(int price){
        super(price);
    }
    public Tv(int price, int bonusPoint){
        super(price, bonusPoint);
    }
}
