import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Hiện tại giá trị quy đổi tiền: 1$=23.000");
       float exchange=23000;
        System.out.println("Nhập số cần quy đổi: ");
        float number= Float.parseFloat(sc.nextLine());
        float sum= exchange * number;
        System.out.println("Giá trị đã quy đổi thành VND: "+sum);
    }
}
