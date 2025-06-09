import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int start = 1;
        int count = 1;

        while (num > start) {
            start = start + (count * 6);
            count++;

        }
        System.out.println(count);
    }
}
