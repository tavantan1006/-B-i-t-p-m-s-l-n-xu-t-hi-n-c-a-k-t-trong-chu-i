import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[*Bài tập] Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông");
        System.out.println("Array : ");
        int[][] arrayA = {{1,2,3,4,0},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        System.out.println("Mảng 1 : ");
        int tong = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.print(arrayA[i][j] + "\t");
                if (j==i){
                    tong+= arrayA[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Tổng đường chéo chính : " + tong);

    }
}
