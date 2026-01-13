import java.util.Scanner;

public class bai3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n ");
        int n = sc.nextInt();
        int tong =0;
        if(n<0){
            n=n*-1;
        }
        for(int i=1;i<=n;){
            int nhap = n%10;
            tong = tong +nhap;
            n/=10;

        }
        System.out.println(tong);
    }
}
