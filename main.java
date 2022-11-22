package btvn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static Qlnv qlnv = new Qlnv();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Them nhan vien");
            System.out.println("2.Xoa nhan vien");
            System.out.println("3.Sua Nhan vien");
            System.out.println("4.hien thi theo ten");
            System.out.println("5.Hien thi luong");
            System.out.println("6.Sap xep theo ten nhan vien");
            System.out.println("7.Hien thi danh sach");
            System.out.println("8.Thoat");
            int so;
            try {
                System.out.println("moi nhap lua chon");
                so=Integer.parseInt(scanner.nextLine());
                break;
            }catch (InputMismatchException|NumberFormatException e){
                System.out.println("sai moi nhap lai");
            }
            so=Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    qlnv.add();
                    break;
                case 2:
                    qlnv.delete();
                    break;
                case 3:
                    qlnv.edit1();
                    break;
                case 4:
                    qlnv.timkiem();
                    break;
                case 5:
                    qlnv.hienthiluong();
                    break;
                case 6:
                    qlnv.sapxepten();
                    break;
                case 7:
                    qlnv.show();
                    break;
                default:
                    return;

            }

        }
    }
}
