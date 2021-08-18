import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[*Bài tập] Đếm số lần xuất hiện của ký tự trong chuỗi");
        String text = "Hello world !!";
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự bạn muốn kiểm tra : ");
        char characterCheck = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.trim().length(); i++) {
            if (characterCheck == (text.trim().toLowerCase().charAt(i))){
                count++;
            }
        }
        System.out.println("Số lần ký tự xuất hiện trong chuỗi là : " +count);
    }
}
