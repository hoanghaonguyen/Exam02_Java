import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    private List<VatPham> dsVatPham;
    private final Scanner sc;
    private VatPham vp;

    public DanhSachVatPham(){
        dsVatPham = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void nhap(){
        System.out.println("Nhap thong tin 5 loai vat pham Spon can thu hoach (PHAI LA 5): ");
        int n = sc.nextInt();
        if (n < 5 || n > 5){
            System.out.println("Vui long nhap lai. Vui long chi nhap 5");
        } else {
            int choice;
            for (int i = 0; i < n; i++){
                System.out.println("Nhap thong tin vat pham thu " +(i+1)*1);

                System.out.println("1. Chiec bua than");
                System.out.println("2. Bao tay sam set");
                System.out.println("3. Hon da kich no");
                System.out.println("4. Cay riu phep thuat");
                System.out.println("5. Cay gay phep thuat");
                System.out.println("Vui long chon vat pham: ");
                choice = sc.nextInt();

                if (choice == 1){
                    vp = new ChiecBuaThan();
                } else if (choice == 2) {
                    vp = new BaoTaySamSet();
                } else if (choice == 3) {
                    vp = new HonDaKichNo();
                } else if (choice == 4) {
                    vp = new CayRiuPhepThuat();
                } else if (choice == 5) {
                    vp = new CayGayChienThan();
                }

                dsVatPham.add(vp);
            }
        }

    }

    public void xuat(){
        System.out.println("------------------------------");
        for (VatPham v: dsVatPham){
            v.xuat();
            System.out.println("==> So vang de mua vat pham: " +v.tinhSoVangTungVatPham() + " xu");
            System.out.println("--------------------------------------------------------------");
        }
    }


    // Cau 3
    public void cau3(){
        System.out.println("--- VAT PHAM TON NHIEU XU VANG NHAT ---");
        double max = dsVatPham.stream()
                .mapToDouble(VatPham::tinhSoVangTungVatPham)
                .max().orElse(0);

        dsVatPham.stream()
                .filter(vp -> vp.tinhSoVangTungVatPham() == max)
                .forEach(vp -> vp.xuat());
    }

    // Cau 4
    public double tinhTongXuVangCacVatPham(){
        return dsVatPham.stream()
                .mapToDouble(VatPham::tinhSoVangTungVatPham)
                .sum();
    }

    public boolean checkGiaiCuuThanhCong(double soXuVang){
        double tongXuVangCacVatPham = this.tinhTongXuVangCacVatPham();
//        if (soXuVang >= tongXuVangCacVatPham){
//            return true;
//        }
//        return false;
        return soXuVang >= tongXuVangCacVatPham;
    }
}
