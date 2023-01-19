public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat1 hangSanXuat;
    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat1 hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }
    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }
    public HangSanXuat1 getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat1 hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void BatDau(){
        System.out.println("Bat dau .....");
    }
    public void TangToc(){
        System.out.println("Tang Toc ....");
    }
    public void Dunglai(){
        System.out.println("Dung lai ...");
    }
    public abstract double layVanToc();

}
