import java.util.Scanner;

public class baitapvandung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=100;
        int n =0;
        int index=0;
        String[] sv= new String[max];

        while(true){
            System.out.println("""
                    --------------------MENU--------------------
                    -1 Hiển thị danh sách tên sinh viên
                    -2 Thêm mới tên sinh viên
                    -3 Cập nhật thông tin tên
                    -4 Xóa sinh viên theo vị trí
                    
                    """);
            System.out.print("mơi chon :");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:{
                    for(int i=0;i<sv.length;i++){
                        if(sv[i]==null){ break;}
                        System.out.printf("Sinh vien thu %d la : %s \n",i,sv[i]);

                    }


                }
                case 2:{
                    System.out.print("sô sv bạn cân nhâp : ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        System.out.printf("sinh vien thu %d :",index+1);
                        sv[index]=sc.nextLine();
                        index++;
                    }

                break;
                }
                case 3:{
                    System.out.print("vi tri muon sửa :");
                    int address =Integer.parseInt(sc.nextLine());
                        if(address>sv.length){
                            System.out.println("không tôn tại vi trí nay");
                            break;}
                    System.out.printf("BAN muốn chuyên %s thanh : ",sv[address]);
                    for(int i=0;i<sv.length;i++){
                        if(address==i){
                           sv[address]=sc.nextLine();
                            break;}
                    }


                }
                case 4:{
                    System.out.print("vi tri muon xoa:");
                    int address =Integer.parseInt(sc.nextLine());
                    for(int i=0;i<sv.length;i++){
                        if(address==i){
                            for(int j=i;j<sv.length-i;j++){
                                sv[j]=sv[j+1];
                            }
                        }
                    }
                }
            }
        }
    }
}
