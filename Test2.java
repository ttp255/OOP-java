public class Test2 {
    public static void main(String[] args) {
        NgayChieu ngay1 =new NgayChieu(25, 11,2033);
        NgayChieu ngay2 =new NgayChieu(30, 3, 2015);
        HangSanXuat1 hang1 =new HangSanXuat1("Universal", "USA");
        HangSanXuat1 hang2 =new HangSanXuat1("Marvel", "UK");
        BoPhim phim1 = new BoPhim("Captain America", 2011, hang2, ngay2,50000);
        BoPhim phim2 =new BoPhim("Batman vs Superman", 2017, hang1, ngay1,40000);

        System.out.println("So sanh gia ve cua hang 1 vs hang 2: "+phim1.kiemTraGiaVeReHon(phim2));
        System.out.println("Giam gia phim2:  "+phim2.giamGia(35));
        System.out.println("Ten hang San Xuat 1: "+phim2.laytenHangSanXuat());
    }
}
