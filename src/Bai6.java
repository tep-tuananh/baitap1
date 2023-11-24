import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số : ");
        double number=Double.parseDouble(sc.nextLine());
        if(number%3==0 && number %5==0)
        {
            System.out.println(" "+number+"  Chia hết cho 3 và 5");
        } else if (number%3==0 && number %5 !=0) {
            System.out.println(" "+number+"  Chia hết cho 3 và không chia hết cho 5");

        } else if (number%3 != 0 && number %5 == 0) {
            System.out.println(" "+number+" Chia hết cho 5 và không chia hết cho 3");
        }
        else
        {
            System.out.println("Không chia hết cho cả 3 và 5");
        }
    }


}
