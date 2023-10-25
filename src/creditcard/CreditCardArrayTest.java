package creditcard;

import java.util.Scanner;

//3번문제
public class CreditCardArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many cards do you want? ");
        int size = input.nextInt();
        String a = input.nextLine();

        System.out.print("Enter the name of card owner: ");
        String name = input.nextLine();

        CreditCard[] creditCards = new CreditCard[size];

        for (int i = 0; i < size; i++) {
            CreditCard creditCard = new CreditCard(name, ((int) Math.floor(Math.random() * 3000) + 2000));
            creditCards[i] = creditCard;
        }
        for (int i = 0; i < size * 2; i++) {
            int exCard = (int) Math.floor(Math.random() * size);
            int exPrice = (int) Math.floor(Math.random() * 1500);

            int A = creditCards[exCard].pay(exPrice);
            if (A != -1) {
                System.out.println("Card number " + exCard + "'s limit is " + creditCards[exCard].getLimit() +
                        " and used amount is " + creditCards[exCard].getUsedAmount());
            }
            else {
                System.out.println("Card number " + exCard + " is declined");
            }}
        System.out.println("The value of numOfCards is " + CreditCard.getNumOfCards());
    }
}
