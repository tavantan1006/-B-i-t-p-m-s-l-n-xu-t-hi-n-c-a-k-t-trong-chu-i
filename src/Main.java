import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Bài tập] Thêm phần tử vào mảng");
        System.out.println("Array : ");
        int[] arrayA = {1,2,3,4,0,0,0,0,0};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int index;
        do {
            System.out.println("Nhập vị trí thêm phần tử : ");
             index = sc.nextInt();
             if (index <= -1 || index >= arrayA.length-1){
                 System.out.println("Không chèn được vào phần tử mảng !!!");
             }
        }while (index <= -1 || index >= arrayA.length-1);
        System.out.println("Nhập Giá trị phần tử cần thêm : ");
        int valueIndex = sc.nextInt();
        for (int i = arrayA.length-1; i >= index; i--) {
            if (i == index){
                arrayA[i] = valueIndex;
            }else {
                arrayA[i] = arrayA[i-1];
            }
        }
        System.out.println("Mảng mới : ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
    }

}
