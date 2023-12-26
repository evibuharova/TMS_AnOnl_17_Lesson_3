import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number from 1 to 12");
    int seasons = scanner.nextInt();
    if (seasons == 12 ||  seasons == 1 || seasons == 2) {
        System.out.println("Winter");
    }
   else if (seasons == 3 || seasons == 4 || seasons == 5) {
        System.out.println("Spring");
    }
  else if (seasons == 6 || seasons == 7 || seasons == 8) {
        System.out.println("Summer");
    }
    else if (seasons == 9 || seasons == 10 || seasons == 11) {
        System.out.println("Autumn");
    }
            else {
            System.out.println("Write another number");
        }
    }
    }

