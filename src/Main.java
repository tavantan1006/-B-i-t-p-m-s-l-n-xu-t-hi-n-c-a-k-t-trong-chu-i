import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Thực hành] Đảo ngược các phần tử của mảng");
        Scanner sc = new Scanner(System.in);
        int size;
        int [] arrayA;
        do {
            System.out.println("Enter a size : ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("size < 20");
            }
        }while (size > 20);
        arrayA = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("Enter element array ["+i+"] = ");
            arrayA[i] = sc.nextInt();
            i++;
        }
        System.out.println("Show value of Elements : ");
        for (int j = 0; j < arrayA.length; j++) {
            System.out.print(arrayA[j] + "\t");
        }
        for (int j = 0; j < arrayA.length/2; j++) {
            int temp =  arrayA[j];
            arrayA[j] = arrayA[size - 1 - j];
            arrayA[size - 1 - j] = temp;
        }
        System.out.println();
        System.out.println("Reverse array : ");
        for (int j = 0; j < arrayA.length; j++) {
            System.out.print(arrayA[j] + "\t");
        }


    }
}
