
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter adjective1 : ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter noun : ");
        noun1 = scanner.nextLine();
        System.out.println("Enter adjective2 : ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter verb : ");
        verb1 = scanner.nextLine();
        System.out.println("Enter adjective3 : ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to an " + adjective1 + " office");
        System.out.println("At the office, I learnt " + noun1 + "." );
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("At the end of the workday I was " + adjective3 + ".");

        scanner.close();



        }
    }