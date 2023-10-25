package creditcard;

import java.util.Scanner;

public class CreditCardTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of card owner: ");
        String owner1 = scanner.nextLine();

        System.out.print("Enter the limit of card: ");
        int limit1 = scanner.nextInt();

        CreditCard c1 = new CreditCard(owner1, limit1);

        int payment = 0;
        while (payment != -1){
            System.out.print("How much do you pay? ");
            int price = scanner.nextInt();
            payment = c1.pay(price);
            System.out.println(c1.info());
        }

    }
}
