/**
 * HoaDonCaPhe
 */
public class HoaDonCaPhe {

    private String tenCaPhe;
    private double gia1kg;
    private double khoiLuong;
    public HoaDonCaPhe(String ten, double gia,double kl){
      this.tenCaPhe=ten;
      this.gia1kg=gia;
      this.khoiLuong=kl;  
    }
    public double tinhTongtien(){
        return this.gia1kg*this.khoiLuong;
    }
    public boolean KiemTraLonHon(double kl){
        return this.khoiLuong>kl;
    }
    public boolean KiemtraTongtienLonhon500k(){
        return this.tinhTongtien()>500000;

    }
    public double KiemtraGiamGia(double x){
        if(this.tinhTongtien()>500000){
            return (x/100)*this.tinhTongtien();
        }else{
            return 0;
        }
        
    }
    public double GiaSauKhiGiam(double x){
        return this.tinhTongtien()-this.tinhTongtien()*(x/100);
    }
    
    
    

}