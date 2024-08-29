public class CayRiuPhepThuat extends VatPham{
    public CayRiuPhepThuat(){
        this.tenVatPham = _CAYRIUPHEPTHUAT;
        this.chiSoSucManh = 30;
        this.heSoSucManh = 1.5;
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
