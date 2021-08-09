import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần hiển thị : ");
        for (int i = 2; i < 100; i++) {
            if (checkIsPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public static boolean checkIsPrime(int number){
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i == 0){
                check = false;
                break;
            }
        }
        return check;
    }

}
