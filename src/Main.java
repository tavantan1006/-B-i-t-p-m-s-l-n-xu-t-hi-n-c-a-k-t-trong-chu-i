import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Thực hành] Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức");
        int[] arrayA = {4,5,6,78,9,6,45};
        System.out.println("Show Array : ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println();
        System.out.println("Min in Array : "+Min(arrayA));
    }
    public static int Min (int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
