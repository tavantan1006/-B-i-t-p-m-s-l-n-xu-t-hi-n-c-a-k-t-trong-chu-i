import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều");
        System.out.println("Array : ");
        int[][] arrayA = {{1,2,3,4,0,0,0,0,0},{1,2,3,4,5}};
        System.out.println("Mảng 1 : ");
        int max = arrayA[0][0];
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (max < arrayA[i][j]){
                    max = arrayA[i][j];
                }
                System.out.print(arrayA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Phần tử max : " + max);
    }
}
