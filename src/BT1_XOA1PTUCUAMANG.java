import java.util.Scanner;

public class BT1_XOA1PTUCUAMANG {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("mảng trước khi xoá: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", A[i]);
        }
        System.out.println("\n");
        System.out.println("Nhập số cần xoá: ");
        int k = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                count++;
            }
        }
        int[] b = new int[n-count];
      int index=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]==k){
                continue;
            }else {
                b[index]=A[i];
                index++;
            }
        }

        System.out.println("mảng sau khi xoá: ");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d\t", b[i]);
        }

    }

}





