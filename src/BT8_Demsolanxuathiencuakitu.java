import java.util.Scanner;

public class BT8_Demsolanxuathiencuakitu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap chuoi vao");
        String string = scanner.nextLine();
        System.out.println("nhap ky tu can check vao");
        char a = scanner.nextLine().charAt(0);
        int index = string.length();
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (a==string.charAt(i)){
                count++;
            }
        }
        System.out.printf("so lan xuat hien cua %s la %d",a,count);
    }
        }



