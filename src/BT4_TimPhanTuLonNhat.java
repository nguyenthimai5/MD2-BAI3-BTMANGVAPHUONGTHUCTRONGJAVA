import java.util.Scanner;

public class BT4_TimPhanTuLonNhat {
    public static void main(String[] args) {
        System.out.println("Tìm phần tử lớn nhất");
        Scanner scanner=new Scanner(System.in);
       int soDong;
       int soCot;
        do {
            System.out.println("số dòng của mảng:");
            soDong=scanner.nextInt();
        }while (soDong<=0);
        do {
            System.out.println("nhập số cột");
            soCot=scanner.nextInt();
        }while (soCot<=0);
        System.out.println("nhập các giá trị của một dòng :");
        int [][] mang2Chieu = new int[soDong][soCot];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("Giá trị phần tử tại hàng %d và cột %d là: ",i+1,j+1);
                mang2Chieu[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều là: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("%d\t",mang2Chieu[i][j]);
            }
            System.out.print("\n");
        }
        int max=mang2Chieu[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (mang2Chieu[i][j]>max){
                    max=mang2Chieu[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất của mảng là: "+max);


    }
}
