import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình vuông: ");
        double lengthh= Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chiều rộng hình vuông: ");
        double width= Double.parseDouble(sc.nextLine());
        double perimeter,acreage;
        perimeter = (lengthh+ width)*2;
        acreage=lengthh* width;
        System.out.println("Chu vi hình chứ nhât: "+perimeter);
        System.out.println("diện tích hình chữ nhật: "+acreage);

    }
}

