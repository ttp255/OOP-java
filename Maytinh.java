public class Maytinh {
    private HangSanXuat hangSanxuat;
    private ngay ngay;
    private double giaBan;
    private int timeBh;
    public Maytinh(HangSanXuat hangSanxuat, ngay ngay, double giaBan, int timeBh) {
        this.hangSanxuat = hangSanxuat;
        this.ngay = ngay;
        this.giaBan = giaBan;
        this.timeBh = timeBh;
    }
    public HangSanXuat getHangSanxuat() {
        return hangSanxuat;
    }
    public void setHangSanxuat(HangSanXuat hangSanxuat) {
        this.hangSanxuat = hangSanxuat;
    }
    public ngay getNgay() {
        return ngay;
    }
    public void setNgay(ngay ngay) {
        this.ngay = ngay;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public int getTimeBh() {
        return timeBh;
    }
    public void setTimeBh(int timeBh) {
        this.timeBh = timeBh;
    }
    public boolean kiemTra(Maytinh maykhac){
        return this.giaBan < maykhac.giaBan;

    }
    public String laytenQuocGia(){
        return this.hangSanxuat.laytenQuocGia();
    }
    } 

        

 

