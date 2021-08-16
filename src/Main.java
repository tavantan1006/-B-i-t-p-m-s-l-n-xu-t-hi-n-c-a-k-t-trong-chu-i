import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Chuyển từ F --> C");
            System.out.println("2.Chuyển từ C --> F");
            System.out.println("3.Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập F : ");
                    F = sc.nextDouble();
                    System.out.println(F+"F = "+(5.0/9)*(F-32)+"oC" );
                    break;
                case 2:
                    System.out.println("Nhập C : ");
                    C = sc.nextDouble();
                    System.out.println(C+"C = "+(32+C*9/5)+"oF" );
                    break;
                default:
                    System.out.println("Nhấn 3 để thoát vòng lặp !!!");
            }
        }while (choice != 3);
    }
}
