public class HonDaKichNo extends VatPham{
    public HonDaKichNo(){
        this.tenVatPham = _HONDAKICHNO;
        this.chiSoSucManh = 40;
        this.heSoSucManh = 2;
        this.soVangQuyDoi = 12;
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
