
package Test;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer c = new Computer();
        System.out.println("Nhap thong tin may tinh:");
        System.out.print("Nhap Number: ");
        c.setNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap Manufacturer: ");
        c.setManufacturer(sc.nextLine());
        System.out.print("Nhap Year: ");
        c.setYear(sc.nextInt());
        System.out.print("Nhap Price: ");
        c.setPrice(sc.nextDouble());
        System.out.println("\nThong tin may tinh:");
        c.displayInfo();
        System.out.print("\nNhap so luong may tinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        Computer[] list = new Computer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nMay tinh thu " + (i + 1));
            list[i] = new Computer();
            System.out.print("Nhap Number: ");
            list[i].setNumber(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhap Manufacturer: ");
            list[i].setManufacturer(sc.nextLine());
            System.out.print("Nhap Year: ");
            list[i].setYear(sc.nextInt());
            System.out.print("Nhap Price: ");
            list[i].setPrice(sc.nextDouble());
            sc.nextLine();
        }
        System.out.println("\n===== DANH SACH MAY TINH =====");
        for (int i = 0; i < n; i++) {
            System.out.println("\nMay tinh thu " + (i + 1));
            list[i].displayInfo();
        }
        sc.close();
    }
}
