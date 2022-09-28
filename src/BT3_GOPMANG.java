import java.util.Scanner;

public class BT3_GOPMANG {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int doDaiMang1;
        int doDaiMang2;
        do {
            System.out.println("nhập độ dài của mảng một:");
            doDaiMang1=scanner.nextInt();
        }while (doDaiMang1<=0);
        int[] mang1 =new int[doDaiMang1];
        System.out.println("nhập các giá trị cho mảng một:");
        for (int i=0;i<doDaiMang1;i++){
            int a=i+1;
            System.out.println("Nhập phần tử thứ "+a+" là:");
            mang1[i]=scanner.nextInt();
        }
        do {
            System.out.println("nhập độ dài của mảng 2:");
            doDaiMang2=scanner.nextInt();
        }while (doDaiMang2<=0);
        int[] mang2 =new int[doDaiMang2];
        System.out.println("nhập các giá trị cho mảng:");
        for (int i=0;i<doDaiMang2;i++){
            int a=i+1;
            System.out.println("Nhập phần tử thứ "+a+" là:");
            mang2[i]=scanner.nextInt();
        }
        System.out.println("mảng 1 trước khi gộp: ");
        for (int i=0;i<doDaiMang1;i++){
            System.out.printf("%d\t",mang1[i]);
        }
        System.out.println("\n");
        System.out.println("mảng 2 trước khi gộp: ");
        for (int i=0;i<doDaiMang2;i++){
            System.out.printf("%d\t",mang2[i]);
        }
        int[] mangSauKhiGop= new int[doDaiMang1+doDaiMang2];
        for (int i = 0; i < mangSauKhiGop.length; i++) {
       if (i<doDaiMang1){
           mangSauKhiGop[i]=mang1[i];
       }else {
           mangSauKhiGop[i]=mang2[i-doDaiMang1];
       }
        }
        System.out.println("\n");
        System.out.println("mảng sau khi gộp:");
        for (int i = 0; i < mangSauKhiGop.length; i++) {
            System.out.printf("%d\t",mangSauKhiGop[i]);
        }
    }
}
