import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice  : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (j<= i){System.out.print(" *");}
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (j>= i){System.out.print(" *");}
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thoát ra ngoài !!");
                    break;
                default:
                    System.out.println("No choice");
            }

        }
    }
}
