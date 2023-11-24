import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float toan,hoa,van,tiengAnh;
        do {
            System.out.println("Nhập điểm toán: ");
            toan=sc.nextFloat();
        }while (toan >= 10);

        do {
            System.out.println("Nhập điểm Hóa: ");
            hoa=sc.nextFloat();
        }while (hoa >= 10);

        do {
            System.out.println("Nhập điểm văn  : ");
            van=sc.nextFloat();
        }while (van >= 10);

        do {
            System.out.println("Nhập điểm Tiếng Anh  : ");
            tiengAnh=sc.nextFloat();
        }while (tiengAnh >= 10);

        double mediumScore=(toan+van+hoa+tiengAnh)/4;
        System.out.println("Điểm trung bình : "+mediumScore);
        if(mediumScore>=9)
        {
            System.out.println("Xếp loại xuất sắc");
        } else if (mediumScore>=8 && mediumScore<9) {
            System.out.println("Xếp loại giỏi");
        } else if (mediumScore <8 && mediumScore >=6.5) {
            System.out.println("Xếp loại khá");
        } else if (mediumScore>=5 && mediumScore <6.5) {
            System.out.println("Xếp loại trung bình");
        }
        else
        {
            System.out.println("Xếp lại yếu");
        }
    }
}
