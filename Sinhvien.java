public class Sinhvien {
    private int maSoSinhVien;
    private String hoTen;
    private day ngay;
    private double diemTb;
    private Lop lop;
    public Sinhvien(int maSoSinhVien,String hoTen,day ngay,double diemTb,Lop lop){
        this.maSoSinhVien=maSoSinhVien;
        this.hoTen=hoTen;
        this.ngay=ngay;
        this.diemTb=diemTb;
        this.lop=lop;
    }
    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setMaSoSinhVien(int maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }
    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public void setNgay(day ngay) {
        this.ngay = ngay;
    }
    public double getDiemTb() {
        return diemTb;
    }
    public String getHoTen() {
        return hoTen;
    }
    public Lop getLop() {
        return lop;
    }
    public int getMaSoSinhVien() {
        return maSoSinhVien;
    }
    public day getNgay() {
        return ngay;
    }
    public String layTenKhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean xepLoai(){
       return this.diemTb>=5;
    }
    public boolean soSanhNgaySinh(Sinhvien sinhvienkhac){
        return this.ngay.equals(sinhvienkhac.ngay);
    }

    }


    

