package Week7;

public class Test {
    public static void main(String[] args) {
        Buyer b = new Buyer(); //new Buy() + ctrl + alt + v
//        System.out.println("b = " + b); // -> sou

        Tv tv = new Tv(100);
        b.buy(tv);
        System.out.println("After buying Tv, money : " + b.getMoney() + " bonusPoint : " + b.getBonusPoint());
        b.listCartItem();

        Computer c = new Computer(200);
        b.buy(c);
        System.out.println("After buying Computer, money : " + b.getMoney() + " bonusPoint : " + b.getBonusPoint());
        b.listCartItem();

        Audio a = new Audio(500);
        b.buy(a);
        System.out.println("After buying Audio, money : " + b.getMoney() + " bonusPoint : " + b.getBonusPoint());
        b.listCartItem();

        Computer c1 = new Computer(300);
        b.buy(c1);
        System.out.println("After buying Computer, money : " + b.getMoney() + " bonusPoint : " + b.getBonusPoint());
        b.listCartItem();
    }
}
