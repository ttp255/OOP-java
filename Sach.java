
public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private Tacgia tacGia;
    public Sach(String tenSach, double giaBan,int namXuatBan,Tacgia tacGia){
        this.tenSach=tenSach;
        this.giaBan=giaBan;
        this.namXuatBan=namXuatBan;
        this.tacGia=tacGia;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public Tacgia getTacGia() {
        return tacGia;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public void setTacGia(Tacgia tacGia) {
        this.tacGia = tacGia;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public void inTenSach(){
        System.out.println(this.tenSach);
    }
    public boolean KiemTracungNXB(Sach sachKhac){
        return this.namXuatBan ==sachKhac.namXuatBan;
    }
    public double giaSauKhiGiam(double x){
        return this.giaBan-this.giaBan*(x/100);
    }
}  


