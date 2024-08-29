public class CayGayChienThan extends VatPham{
    public CayGayChienThan(){
        this.tenVatPham = _CAYGAYCHIENTHAN;
        this.chiSoSucManh = 20;
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
