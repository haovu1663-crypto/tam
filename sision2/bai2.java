import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang ;
        System.out.print(" vui long nhập tháng :");
        thang  = sc.nextInt();
        switch(thang) {
            case 1:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            case 2:
                System.out.printf("tháng %d là 28 ngày", thang);
                break;
            case 3:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            case 4:
                System.out.printf("tháng %d là 30 ngày", thang);
                break;
            case 5:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            case 6:
                System.out.printf("tháng %d là 30 ngày", thang);
                break;
            case 7:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            case 8:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            case 9:
                System.out.printf("tháng %d là 30 ngày", thang);
                break;
            case 10:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            case 11:
                System.out.printf("tháng %d là 30 ngày", thang);
                break;
            case 12:
                System.out.printf("tháng %d là 31 ngày", thang);
                break;
            default:
                System.out.println("tháng ko hợp lệ ");
        }
    }
}
