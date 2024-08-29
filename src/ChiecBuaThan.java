public class ChiecBuaThan extends VatPham{
    public ChiecBuaThan(){
        this.tenVatPham = _CHIECBUATHAN;
        this.chiSoSucManh = 25;
        this.heSoSucManh = 2;
        this.soVangQuyDoi = 10;
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
