import java.util.Scanner;

public class rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Red");
        }
        else if (n == 2) {
            System.out.println("Orange");
        }
        else if (n == 3) {
            System.out.println("Yellow");
        }
        else if (n == 4) {
            System.out.println("Green");
        }
        else if (n == 5) {
            System.out.println("Shy blue");
        }
        else if (n == 6) {
            System.out.println("Blue");
        }
        else if (n == 7) {
            System.out.println("Violet");
        }
        else {
            System.out.println("Write another number");
        }
    }
}
