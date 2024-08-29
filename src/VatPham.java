public abstract class VatPham {
    protected String tenVatPham;
    protected int chiSoSucManh;
    protected double heSoSucManh;
    protected int soVangQuyDoi;
    protected double sucCongPha;

    public final static String _CHIECBUATHAN = "Chiec bua than";
    public final static String _BAOTAYSAMSET = "Bao tay sam set";
    public final static String _HONDAKICHNO = "Hon da kich no";
    public final static String _CAYRIUPHEPTHUAT= "Cay riu phep thuat";
    public final static String _CAYGAYCHIENTHAN= "Cay gay chien than";
    public VatPham() {
    }

    public VatPham(String tenVatPham, int chiSoSucManh, double heSoSucManh, int soVangQuyDoi, double sucCongPha) {
        this.tenVatPham = tenVatPham;
        this.chiSoSucManh = chiSoSucManh;
        this.heSoSucManh = heSoSucManh;
        this.soVangQuyDoi = soVangQuyDoi;
        this.sucCongPha = sucCongPha;
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    public int getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(int chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public double getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(double heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public int getSoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setSoVangQuyDoi(int soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }

    public double getSucCongPha() {
        return sucCongPha;
    }

    public void setSucCongPha(double sucCongPha) {
        this.sucCongPha = sucCongPha;
    }

    public double tinhSucCongPha(){
        return this.chiSoSucManh * this.heSoSucManh;
    }

    public void xuat(){
        System.out.println("--- THONG TIN VAT PHAM ---");
        System.out.println("- Ten vat pham: " +this.getTenVatPham());
        System.out.println("- Chi so suc manh: " +this.getChiSoSucManh());
        System.out.println("- He so suc manh: " +this.getHeSoSucManh());
        System.out.println("- So vang quy doi tren 1 suc cong pha: " +this.getSoVangQuyDoi());
        System.out.println("- Suc cong pha cua " +this.getTenVatPham() + " la: " +this.tinhSucCongPha());
    }

    public abstract double tinhSoVangTungVatPham();
}
