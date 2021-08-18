import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tìm giá trị nhỏ nhất trong mảng");
        System.out.println("Array : ");
        int[][] arrayA = {{1,2,3,4,0,0,0,0,0},{1,2,3,4,5}};
        System.out.println("Mảng 1 : ");
        int min = arrayA[0][0];
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (min > arrayA[i][j]){
                    min = arrayA[i][j];
                }
                System.out.print(arrayA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Phần tử min : " + min);
    }
}
