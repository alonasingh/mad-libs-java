
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         //SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        String currency = "$";
        double total;

        System.out.println("Item to buy: ");
        item = scanner.nextLine();
        System.out.println("Enter the price: ");
        price = scanner.nextDouble();
        System.out.println("What is the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\n You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scanner.close();


        }
    }