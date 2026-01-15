import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double diem[] = new double[5];
//        double dmax=0;
//        double dmin=10;
//        double dtb =0;
//        double tong=0;
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("nhap diem sinh vien thu %d", i + 1);
//            diem[i] = sc.nextDouble();
//        }
//
//        for (int i = 0; i < diem.length; i++) {
//            if(diem[i]>dmax){
//                dmax=diem[i];
//            }
//            if(diem[i]<dmin){
//                dmin=diem[i];
//            }
//            tong+=diem[i];
//        }
//        dtb=tong/5;
//        System.out.printf("diem tb la %f \n",dtb);
//        System.out.printf("max = %f \n",dmax);
//        System.out.printf("min = %f \n",dmin);

//
//        int a = 0;
//        int[] arr = new int[20];
//        boolean isPrime = true;
//        while(a<20){
//           for(int i=0;;i++) {
//
//
//               if (i < 2) {
//                   isPrime = false;
//               } else {
//                   for (int j = 2; j <= Math.sqrt(i); j++) {
//                       if (i % j == 0) {
//                           isPrime = false;
//                           break;
//                       }
//                   }
//               }
//
//
//               if (isPrime) {
//                   System.out.println(i + " là số nguyên tố.");
//                   a+=1;
//                   arr[a]=i;
//
//               } else {
//                   System.out.println(i + " không là số nguyên tố.");
//               }
//           }
//        }
        int min=0;
        int max=0;
        int max2=0;
        int tongluythua ;
        int [] arr2=null;

        while (true){
            System.out.println("***********menu*********");
            System.out.println("1 Nhập mảng ");
            System.out.println("2 tìm và in ra giá trị lơn nhất và nhỏ nhất trong mảng");
            System.out.println("3 tìm ra giá trị lón thứ 2 ");
            System.out.println("4 tìm ra số chính phương ");
            System.out.println("5 tông luy thua bâc 3 ");
            System.out.println("6 thoat");
            int choice = sc.nextInt();




            switch (choice){
                case 1:{
                    System.out.println("-------------nhập mảng ------------");
                    System.out.print("dộ dài của mảng bạn muốn nhâp : ");
                    int n = sc.nextInt();
                    int [] arr = new int[n];
                    for(int i=0;i<n;i++){
                        System.out.printf("arr[%d] = ",i);
                        arr[i] = sc.nextInt();
                    }
                    // max
                    max = arr[0];
                    min = arr[0];
                    for(int i=0;i<n;i++){
                        if(arr[i]>max){
                            max=arr[i];
                        }
                        if(arr[i]<min){
                            min=arr[i];
                        }
                    }
                    //số lớn thứ hai
                    for(int i=0;i<arr.length-1;i++){
                        for(int j=0;j<arr.length-i-1;j++){
                            if(arr[j]>arr[j+1]) {
                                int tam = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = tam;
                            }
                        }
                    }
                    max2=arr[arr.length-2];
                    // so chinh phuong
                    for(int i=0;i<arr.length-1;i++){
                        if((int)(Math.sqrt(arr[i])*(int)Math.sqrt(arr[i])) == arr[i]){
                            arr2=new int [arr.length];
                            int index=0;
                            arr2[index++]=arr[i];
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.printf("max = %d \n ",max);
                    System.out.printf("số lơn thư 2 = %d \n ",max2);
                    System.out.printf("min = %d \n ",min);
                    break;
                }
                case 3:{
                    for(int i =0;i<= arr2.length;i++){
                        System.out.println(arr2[i]);

                    }
                }
            }

        }






    }
}