import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;
        System.out.println("Nhập số tiền cần quy đổi : ");
        float usd = scanner.nextFloat();
        System.out.println("Result : "+usd*rate + "VND");

    }
}
