import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        double diem;
        int tonghv =0;
        double tongdiem=0;
        double diemtrungbinh=0;
        double dmax=0;
        double dmin=10;

        while(true){
            System.out.println("**********Menu Nhập Điểm**********");
            System.out.println("1 .nhập điểm hoc sinh ");
            System.out.println("2 . Thống kê ");
            System.out.println("3. Thoat ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:{
                    // nhap điêm
                    while(true){
                        System.out.println("*****************************");
                        System.out.println("nhâp điểm từ 1 ->10 nhập hoặc -1 để thoát");
                        System.out.print("Nhập Diểm : ");
                        diem = Double.parseDouble(sc.nextLine());

                        if (diem==-1){
                            break;
                        }
                        if(diem<0 || diem>10){
                            System.out.println("điểm không hợp lệ nhập lai :");
                            continue;
                        }

                        System.out.printf("điêm = %.2f \n",diem);
                        if(diem>0 && diem<=5){
                            System.out.println("học lực yếu");

                        } else if (diem>5 && diem<=7) {
                            System.out.println("học tb");
                        } else if (diem>7 && diem<=8) {
                            System.out.println("học lực kha");
                        } else if (diem>8 && diem<=9) {
                            System.out.println("học lực tôt");
                        }else {
                            System.out.println("học lực suất sắc");
                        }

                        //tông học viên
                        tonghv++;
                        // tổng điểm
                        tongdiem+=diem;
                        // diem tb
                        diemtrungbinh=tongdiem/tonghv;
                        //diem max
                        if(dmax<=diem){
                            dmax=diem;
                        }
                        if(dmin>=diem){
                            dmin=diem;
                        }
                    }
                  break;
                }
                case 2:{
                    System.out.println("-----------thống kê ------------");
                    System.out.printf("tong số hoc sinh : %d \n",tonghv);
                    System.out.printf("điểm trung binh hoc sinh : %f \n",diemtrungbinh);
                    System.out.printf("điêm lớn nhât : %f \n",dmax);
                    System.out.printf("điểm nhỏ nhất : %f \n",dmin);
                    break;
                }
                case 3:{ return;}
            }

        }
    }
}
