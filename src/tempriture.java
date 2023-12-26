import java.util.Scanner;
public class tempriture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Hot");
        }
        else if (-5 >= temperature || temperature< -20) {
            System.out.println("Normal");
        }
        else if (-20 >= temperature) {
            System.out.println("Cold");
        }
        else  {
            System.out.println("Dangerous");
        }
    }

}

