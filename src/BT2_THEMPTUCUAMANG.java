import java.util.Scanner;

public class BT2_THEMPTUCUAMANG {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int soPhanTu;
        do {
            System.out.println("nhập độ dài của mảng:");
            soPhanTu=scanner.nextInt();
        }while (soPhanTu<=0);
        int[] a =new int[soPhanTu];
        System.out.println("nhập các giá trị cho mảng:");
      for (int i=0;i<soPhanTu;i++){
          System.out.println("Nhập phần tử thứ "+i+" là:");
          a[i]=scanner.nextInt();
      }
        System.out.println("mảng trước khi thêm: ");
        for (int i=0;i<soPhanTu;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("\n");
        System.out.println("Nhập chỉ số cần thêm : ");
        int indexAdd = scanner.nextInt();
        System.out.println("Nhập giá trị cần thêm : ");
        int valueAdd = scanner.nextInt();
        int[] newA=new int[soPhanTu+1];
        for (int i = 0; i < newA.length; i++) {
            if (i<indexAdd){
                newA[i]=a[i];
            } else if (i==indexAdd) {
                newA[i]=valueAdd;
            }else {
                newA[i]=a[i-1];
            }
        }
        System.out.println("mảng sau khi thêm: ");
        for (int i=0;i<newA.length;i++){
            System.out.printf("%d\t",newA[i]);
        }
    }
}
