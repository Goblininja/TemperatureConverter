import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter which you would like: ");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scan.nextInt();

        while(choice != 1 || choice != 2) {
            if (choice == 1) {
                System.out.println("what number would you like to convert: ");
                int num = scan.nextInt();
                float answer = (num - 32.0f) * 5 / 9;
                System.out.println(num + " Fahrenheit to Celsius is " + answer);
                break;
            }
            else if (choice == 2) {
                System.out.println("what number would you like to convert: ");
                int num = scan.nextInt();
                float answer = (num * 9 / 5.0f) + 32;
                System.out.println(num + " Celsius to Fahrenheit is " + answer);
                break;
            }
            else {
                System.out.println("please choose either 1 or 2: ");
                choice = scan.nextInt();
            }
        }
    }
}