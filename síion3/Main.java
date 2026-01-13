import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------nhập thông tin hóa đơn ----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên khách hàng :");
        String name = sc.nextLine();
        System.out.print("nhập tên sản phâmr");
        String product = sc.nextLine();
        System.out.print("nhập Đơn giá : ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("số lượng : ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.print("thẻ giảm giá ");
        String the = sc.nextLine();


        double thanhtien = quantity*price;
        double giamgia = thanhtien*1/10 ;
        double vat=0;
        if(the.equalsIgnoreCase("co")){
         vat = thanhtien*8/100;
        }

        double tongtien=thanhtien-giamgia+vat;
        System.out.println("----------thông tin hóa đơn ----------");
        System.out.printf("tên khách hàng : %s \n",name);
        System.out.printf("Tên sản phâm : %s \n",product);
        System.out.printf("Số lượng : %d \n",quantity);
        System.out.printf("đơn giá : %f \n",price);
        System.out.printf("thành tiền : %f \n",thanhtien);
        System.out.printf("Tiền VTA : %f \n",vat);
        System.out.printf("tổng tiền : %f \n",tongtien);




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}