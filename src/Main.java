import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Thực hành] Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức");
        int [] arrayA = {4, 5, 6, 78, 9, 6, 45};
        System.out.println("Show Array : ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element need delete in Array : ");
        int element = sc.nextInt();
        int count = arrayA.length;
        int check = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (element == arrayA[i]){
                count--;
            }
        }
        int [] arrayNew = new int[count];
        for (int i = 0; i < arrayNew.length; i++) {
            if (element == arrayA[i+check]){
                check ++;
                arrayNew[i] = arrayA[i+check];
                continue;
            }else {
                arrayNew[i] = arrayA[i+check];
            }
        }
        System.out.println("New array : ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + "\t");
        }

    }
}
