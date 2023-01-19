import java.util.Set;

/**
 * BoPhim
 */
public class BoPhim {

    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat1 hangSanXuat;
    private double giaVe;
    private NgayChieu ngayChieu;
   
    public BoPhim(String tenPhim, int namSanXuat,HangSanXuat1 hangSanXuat,NgayChieu ngayChieu,double giaVe){
        this.tenPhim=tenPhim;
        this.namSanXuat=namSanXuat;
        this.hangSanXuat=hangSanXuat;
        this.giaVe=giaVe;
        this.ngayChieu=ngayChieu;

    }
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }
    public void setHangSanXuat(HangSanXuat1 hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }
    public HangSanXuat1 getHangSanXuat() {
        return hangSanXuat;
    }
    public int getNamSanXuat() {
        return namSanXuat;
    }
    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }
    public String getTenPhim() {
        return tenPhim;
    }
    public boolean kiemTraGiaVeReHon(BoPhim phimKhac){
        return this.giaVe < phimKhac.giaVe;
    
    }
   
    public double giamGia(double x){
        return this.giaVe - this.giaVe*(x/100);
    }
    public String laytenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    

} 