import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhâp canh a ");
        double a  = sc.nextDouble();
        System.out.print("nhâp canh b ");
        double b  = sc.nextDouble();
        System.out.print("nhâp canh c ");
        double c  = sc.nextDouble();
        if((a+b)>c && (b+c)>a&& (a+c)>b){
            System.out.println("banh cạnh tạo thành 1 tam giác ");
            if(a==b &&a==c){
                System.out.println("và là tam giác đều");
            }
             else if (a==b || b==c || c==a) {
                System.out.println("và là tâm giác cân ");
            }
             else if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
                System.out.println("là tâm giác vuông");
            }
             else{
                System.out.println("và là TAM GIÁC THƯỜNG");
            }
        }
        else{
            System.out.println("các cạnh không hợp lê");
        }

    }
}
