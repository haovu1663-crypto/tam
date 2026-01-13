import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhâp chiêu cao m ");
//        double chieucao = sc.nextDouble();
//        System.out.println("nhập cân nang kg ");
//        double kg = sc.nextDouble();
//        double dmi=kg/(chieucao*chieucao);
//       if(dmi<16){
//           System.out.println("bạn gày cấp đôh III");
//       }
//       else  if(dmi>16 && dmi<16.9){
//           System.out.println("bạn gày cấp độ II");
//       }
//       else if(dmi>17 && dmi<18.4){
//           System.out.println("bạn gày cấp độ I");
//       }
//       else if(dmi>18.5 && dmi<24.9){
//           System.out.println("bạn bình thường");
//       }
//       else if(dmi>25 && dmi<29.9){
//           System.out.println("tiền báo phì ");
//       }
//       else if(dmi>29.9 && dmi<34.9){
//           System.out.println("báo phì cấp độ I");
//       }
//       else if(dmi>35 && dmi<35.9){
//           System.out.println("bạn béo phì cấp độ II");
//       }
//       else {
//           System.out.println("bạn béo phì cấp độ III");
//       }
//
//    }




//        while(true){
//            System.out.println("1 . tính tổng n số đầu tiên ");
//            System.out.println("2 thương 2 số");
//            int n = sc.nextInt();
//            switch(n){
//                case 1:{
//                    System.out.println("nhâp sô bạn muôn tính ");
//                    int so = sc.nextInt();
//                    double tong =(so*so+1)/2;
//                    System.out.println(+tong);
//                    break;
//                }
//                case 2 :{
//                    System.out.println("nhâp a ");
//                    double a = sc.nextDouble();
//                    System.out.println("nhập B ");
//                    double b = sc.nextDouble();
//                    double kq=0;
//                    if(b!=0){
//                        kq=a/b;
//                    }
//                    else{
//                        System.out.println("lỗi");
//                    }
//                    System.out.println(+kq);
//                    break;
//                }
//            }

//        System.out.println("nhập số ");
//        double n = sc.nextDouble();
//
//        do {
//            System.err.println("nhập sai vui long nhâp lại");
//            n = sc.nextDouble();
//        }while(n<0);
        while(true){
            System.out.println(" 1 tính giai thừa ");
            System.out.println("2 tính tổng n số");
            System.out.println("3 tính ước ");
            System.out.println("4 thoát");
            int chon = sc.nextByte();
            switch(chon){
                case 1:{
                    System.out.println("nhất so : ");
                    int so =sc.nextInt();
                    int tong=1;
                    for(int i=1;i<=so;i++){
                        tong*=i;
                    }
                    System.out.println(+tong);
                    break;
                }
                case 2:{
                    System.out.println("nhất so : ");
                    int so =sc.nextInt();
                    int tong=0;
                    for(int i=1;i<=so;i++){
                        tong+=i;
                    }
                    System.out.println(+tong);
                    break;
                }
                case 3:{
                    System.out.println("nhất so : ");
                    int so =sc.nextInt();
                    for(int i=1;i<=so;i++){
                        if(so%i==0){
                            System.out.printf("%d /n",i);
                        }
                    }
                    break;
                }
                case 4 :{
                    return;
                }
            }
        }
  }
}
