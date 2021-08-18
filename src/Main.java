import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Bài tập] Gộp mảng");
        System.out.println("Array : ");
        int[] arrayA = {1,2,3,4,0,0,0,0,0};
        int[] arrayB = {5,6,7,8,0,0,0,0,0};
        int[] arrayC = new int[arrayA.length+arrayB.length];
        System.out.println("Mảng 1 : ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println();
        System.out.println("Mảng 2 : ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + "\t");
        }
        System.out.println();
        System.out.println("Mảng 3 : ");
        for (int i = 0; i < arrayC.length; i++) {
            if (i <=  arrayA.length-1){
                arrayC[i] = arrayA[i];
            }else {
                arrayC[i] = arrayB[i-arrayA.length];
            }
            System.out.print(arrayC[i] + "\t");
        }
    }
}
