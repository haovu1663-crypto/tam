import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tongnv=0;
        double tongl=0;
        double luongtd=0;
        double maxl=0;
        double minl=500000000;
        while(true){
            System.out.println("**********menu**********");
            System.out.println("1. nhập lương ");
            System.out.println("2. thống kê");
            System.out.println("3. tính tiên thưởng");
            System.out.println("4 thoat");
            System.out.print("lua chon : ");
            int chon = sc.nextInt();
            switch (chon){
                case 1:{
                    while (true){
                        System.out.println("-----------nhap luong ------------");
                        System.out.print("nhâp luong hoăc nhâp -1 để thoát ");
                        double luong = sc.nextDouble();
                        if(luong == -1){
                            break;
                        }
                        if(luong<0 || luong >500000000 ){
                            System.out.println("không hợp lê ");
                            continue;
                        }
                        System.out.printf("tiên luong : %.02f \n",luong);
                        if(luong <=5000000){
                            System.out.println("mức thu nhập thâp");
                        } else if (luong>5000000 && luong <=1000000) {
                            System.out.println("mức thu nhập tb");
                        }
                        else{
                            System.out.println("mức thu nhâp cao");
                        }

                        //tonh nv
                        tongnv++;
                        //tong luong
                        tongl+=luong;
                        //luong tb
                        luongtd=tongl/tongnv;
                        // luong max
                        if(luong>=maxl){
                            maxl=luong;

                        }
                        if(luong<=minl){
                            minl=luong;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("-----------thống kê  ------------");
                    System.out.printf("tông nhân viên %d : \n ",tongnv);
                    System.out.printf("tông tiên lương %.2f : \n",tongl);
                    System.out.printf("tien lương td %.2f : \n",luongtd);
                    System.out.printf("tien lương max %.2f : \n",maxl);
                    System.out.printf("tien lương min %.2f : \n",minl);
                    break;
                }
                case 3:{
                    System.out.println("------------tính lương thưởng ---------");
                    System.out.print("nhâp tiên lương muốn tính");
                    double luong = sc.nextDouble();
                    double tong;
                    if(luong <=5000000){
                        tong = (luong *5/100)+luong;
                    } else if (luong >5000000 && luong <=15000000) {
                        tong = (luong*1/10)+luong;
                    } else if (luong <15000000 &&luong<=50000000) {
                        tong =  (luong*15/100)+luong;
                    } else if (luong>50000000 && luong<=100000000) {
                        tong=(luong*20/100)+luong;
                    }else {
                        tong=(luong*25/100)+luong;
                    }
                    System.out.printf("tổng tiên băng %.2f \n",tong);
                    break;
                }
                case 4:{return;}
            }
        }
    }
}
