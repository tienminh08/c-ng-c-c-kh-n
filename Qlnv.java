package btvn;

import sort.SortNane;
import sort.Sortluong;

import java.util.*;

public class Qlnv {
    Scanner scanner = new Scanner(System.in);
    List<nv> mang1 = new ArrayList<>();

    public void add() {
        System.out.println("Nhap name");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        String age = scanner.nextLine();
        System.out.println("Luong co ban");
        String salary = scanner.nextLine();

        System.out.println("ngay sinh");
        String brithday = scanner.nextLine();

        System.out.println("gioi tinh");
        String gender = scanner.nextLine();
        nv nhanvien1 = new nv(name, age, salary, brithday, gender);
        mang1.add(nhanvien1);

    }

    public void delete() {
        System.out.println(" nhap ID nhan vien muon xoa");
        int id = Integer.parseInt(scanner.nextLine());
        mang1.remove((id - 1));
        System.out.println("da xoa thanh cong");
    }


    public void edit1() {
        System.out.println(" 1.nhap Id Muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("1.sua ten");
            System.out.println("2.sua tuoi");
            System.out.println("3.sua Brithday");
            System.out.println("4.sua gender");
            System.out.println("5.exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {

                case 1:
                    System.out.println("nhap ten muon sua");
                    String name = scanner.nextLine();
                    mang1.get(id - 1).setName(name);
                    System.out.println("sua thanh cong");
                    break;
                case 2:
                    System.out.println("nhap tuoi muon thay doi");
                    String age = scanner.nextLine();
                    mang1.get(id - 1).setAge(age);
                    break;
                case 3:
                    System.out.println("nhap briday muon thay doi");
                    String brithday = scanner.nextLine();
                    mang1.get(id - 1).setBrithday(brithday);

                    break;
                case 4:
                    System.out.println("nhap gioi tinh muon thay doi");
                    String gender = scanner.nextLine();
                    mang1.get(id - 1).setGender(gender);
                    break;
                case 5:
                    return;


            }
        }
    }

    public void show() {
        for (int i = 0; i < mang1.size(); i++) {
            System.out.println(mang1.get(i).toString());

        }
    }

    public int timi(String name) {

        for (int i = 0; i < mang1.size(); i++) {
            if (name.equals(mang1.get(i).getName())) {
                return i;
            }


        }
        return -1;
    }

    public void timkiem() {
        System.out.println("nhap ten muon tim");
        String name = scanner.nextLine();
        int index = timi(name);
        if (index != -1) {
            System.out.println(mang1.get(index));
        }


    }

    public void hienthiluong() {
        Collections.sort(mang1, new Sortluong());

        System.out.println(mang1.get(0).getSalary());
        System.out.println(mang1.get(1).getSalary());
        System.out.println(mang1.get(2).getSalary());
    }

    public void sapxepten() {
        Collections.sort(mang1, new SortNane());
        show();

    }

}
