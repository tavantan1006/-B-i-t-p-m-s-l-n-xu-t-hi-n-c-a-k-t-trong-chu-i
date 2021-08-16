import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Thực hành] Tìm giá trị trong mảng");
        Scanner sc = new Scanner(System.in);
        int size;
        String [] arrayStudent;
        do {
            System.out.println("Enter a size : ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("size < 20");
            }
        }while (size > 20);
        sc.nextLine();
        arrayStudent = new String[size];
        int i = 0;
        while (i < size){
            System.out.println("Enter element array ["+i+"] = ");
            arrayStudent[i] = sc.nextLine();
            i++;
        }

        System.out.println("Show value of Elements : ");
        for (int j = 0; j < arrayStudent.length; j++) {
            System.out.print(arrayStudent[j] + "\t");
        }

        System.out.println();
        String name ="";
        System.out.println("Enter name you need to find : ");
        name = sc.nextLine();
        boolean check = false;
        for (int j = 0; j < arrayStudent.length; j++) {
            if (arrayStudent[j].equals(name)){
                System.out.println("arrayStudent ["+j+"] = "+name);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("No find to Name you need find ");
        }


    }
}
