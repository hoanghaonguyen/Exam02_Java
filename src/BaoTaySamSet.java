public class BaoTaySamSet extends VatPham{
    public BaoTaySamSet(){
        this.tenVatPham = _BAOTAYSAMSET;
        this.chiSoSucManh = 30;
        this.heSoSucManh = 1;
        this.soVangQuyDoi = 7;
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    @Override
    public double tinhSoVangTungVatPham() {
        return this.chiSoSucManh * this.heSoSucManh *this.soVangQuyDoi;
    }
}
