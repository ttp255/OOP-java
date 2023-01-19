public class Maybay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public Maybay( HangSanXuat1 hangSanXuat, String loaiNhienLieu) {
        super("Maybay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
       
        return 150;
    }

}
