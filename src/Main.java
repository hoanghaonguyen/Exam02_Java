import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DanhSachVatPham list = new DanhSachVatPham();
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Nhap thong tin 5 loai vat pham");
            System.out.println("2. Xuat cac thong tin vat pham kem suc manh cong pha");
            System.out.println("3. Hien thi vat pham ton nhieu xu vang nhat");
            System.out.println("4. Spon co giai cuu thanh cong dong doi hay khong???");
            System.out.println("5. Thoat");
            System.out.println("Lua chon cua ban la: ");
            choice = sc.nextInt();

            if (choice == 5){
                System.out.println("Cam on da su dung chuong trinh. Have a nice day!!!");
                sc.close();
                break;
            } else if (choice == 1){
                list.nhap();
            } else if (choice == 2) {
                list.xuat();
            } else if (choice == 3){
                list.cau3();
            } else if (choice == 4) {
                System.out.println("De giai cuu dong doi thanh cong, Spon can: " +list.tinhTongXuVangCacVatPham() +" xu");
                System.out.println("Nhap so vang ma Spon thu duoc: ");
                double soVang = sc.nextDouble();
                boolean check = list.checkGiaiCuuThanhCong(soVang);
                if (check) {
                    System.out.println("Spon Giai cuu thanh cong!!!");
                } else {
                    System.out.println("Chua giai cuu duoc. Thu lai lan nua!!!");
                }
            } else {
                System.out.println("Xin nhap so tu 1 -> 5");
            }
        }

//        list.nhap();
//        list.xuat();
//        list.cau3();

    }
}
