import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[*Bài tập] Tính tổng các số ở một cột xác định");
        System.out.println("Array : ");
        int[][] arrayA = {{1,2,3,4,0,0,0,0,0},{1,2,3,4,5}};
        System.out.println("Mảng 1 : ");
        int lengMax = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (lengMax < arrayA[i].length){
                lengMax = arrayA[i].length;
            }
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.print(arrayA[i][j] + "\t");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        int col;
        int total = 0;
        do {
            System.out.println("Nhập cột cần tính tổng : ");
             col = sc.nextInt();
             if (col < 1 || col > lengMax){
                 System.out.println("Không được vượt quá độ dài cột của mảng !! ");
             }
        }while (col < 1 || col > lengMax);
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (j == col-1){
                    total+= arrayA[i][j];
                }
            }
        }
        System.out.println("Tổng giá trị cột "+col+ ": "+total);
    }
}
