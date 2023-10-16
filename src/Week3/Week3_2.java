package Week3;

public class Week3_2 {
    public static void main(String[] args) {
//        System.out.println("card width = " + Card.width);
//        System.out.println("card height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = 9;
//        System.out.println("c1 info : kind = " + c1.kind);
//        System.out.println("c1 info : number = " + c1.number);
//        System.out.println("c1 info : height = " + c1.height);
//        System.out.println("c1 info : width = " + c1.width);
        info(c1);

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = 5;
        info(c2);
    }
    static void info(Card c){
        System.out.println("c info : kind = " + c.kind);
        System.out.println("c info : number = " + c.number);
        System.out.println("c info : height = " + c.height);
        System.out.println("c info : width = " + c.width);
    }
}
class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

}