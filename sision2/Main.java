import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("nhập số n ");
            n=sc.nextInt();
            if(n<0) {
                System.out.println(" số không lệ vui lòng nhập lại ");
            }
            else {
                break;
            }
        }while(n<0);
        int tong =0;
        for(int i=1;i<=n;i++) {
            tong+=i;
        }
        System.out.println(tong);



    }
}