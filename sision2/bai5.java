import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhâp số ");
        int n ;
       int  hunderds,tens,units;
        do {
            n=sc.nextInt();
            if(n<100 || n>1000){
                System.out.println(" n ko hợn lê");
            }
        } while(n<100 || n>999);
        hunderds=n/100;
        tens=(n/10)%10;
        units= (n%100)%10;
        String hangtram = "", hangtruc="", hangdv="";
        switch(hunderds){
            case 1:
                hangtram="một trăm";
                break;
            case 2:
                hangtram="hai trăm";
                break;
            case 3:
                hangtram="ba trăm";
                break;
            case 4:
                hangtram="bốn trăm";
                break;
            case 5:
                hangtram="năm trăm";
                break;
            case 6:
                hangtram="sau trăm";
                break;
            case 7:
                hangtram="bay trăm";
                break;
            case 8:
                hangtram="tám trăm";
                break;
            case 9:
                hangtram="chin trăm";
                break;
        }
        if(tens!=0){
            switch(tens){
                case 1:
                    hangtruc="mười";
                    break;
                case 2:
                    hangtruc="hai mươi";
                    break;
                case 3:
                    hangtruc="ba mươi";
                    break;
                case 4:
                    hangtruc="bốn mươn";
                    break;
                case 5:
                    hangtruc="năm mươi";
                    break;
                case 6:
                    hangtruc="sau mươi";
                    break;
                case 7:
                    hangtruc="bay mươi";
                    break;
                case 8:
                    hangtruc="tám muoi";
                    break;
                case 9:
                    hangtruc="chin mươi";
                    break;
            }
        }
        else{
            hangtruc="lẻ";
        }
        if(units!=0) {
            switch (units) {
                case 1:
                    hangdv = "một ";
                    break;
                case 2:
                    hangdv = "hai ";
                    break;
                case 3:
                    hangdv = "ba ";
                    break;
                case 4:
                    hangdv = "bốn";
                    break;
                case 5:
                    hangdv = "năm";
                    break;
                case 6:
                    hangdv = "sau ";
                    break;
                case 7:
                    hangdv = "bay ";
                    break;
                case 8:
                    hangdv = "tám";
                    break;
                case 9:
                    hangdv = "chin ";
                    break;
            }
        }
        else{
            hangdv="";
        }
        if(tens==0 && units==0 ){
            hangtruc="";
            hangdv="";

        }




        System.out.printf("%s  ",hangtram);
        System.out.printf("%s  ",hangtruc);
        System.out.printf("%s  ",hangdv);

    }
}
