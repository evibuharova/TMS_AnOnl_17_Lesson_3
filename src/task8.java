import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        int n = 1;
        for (int summ = a + n; ; ) {
            System.out.println(summ);
            break;
        }
    }
}
