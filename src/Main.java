import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần hiển thị : ");
        int numberInput = sc.nextInt();
        int count = 0;
        for (int i = 2; count < numberInput; i++) {
            if (checkIsPrime(i) == true){
                System.out.println(i);
                count ++;
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
