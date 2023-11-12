package Week7.product;

public class Buyer {
    private int money = 1000;
    private int bonusPoint;
    private Product[] cart = new Product[10];
    private  int i = 0;

    public void buy(Product p){
        if( money < p.getPrice() ){
            System.out.println("잔액부족");
            return;
        }
        if( i >= cart.length ){
            System.out.println("장바구니 자리 부족");
            return;
        }
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        cart[i++] = p;
    }

    public void listCartItem() {
        for(int j = 0; i < i; j++){
            System.out.println(cart[j]);
        }
    }

    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
