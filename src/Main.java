import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Thực hành] Tìm giá trị Max trong mảng");
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
        System.out.println("Max in Arrays : ");
        int max;
        max = arrayA[0];
        for (int j = 0; j < arrayA.length; j++) {
            if (max < arrayA[j]){
                max = arrayA[j];
            }
        }
        System.out.print(max);


    }
}
