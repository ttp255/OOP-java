public class Test {
    public static void main(String[] args) {
        HoaDonCaPhe hd =new HoaDonCaPhe("Trung Nguyen", 100000, 6);
        HoaDonCaPhe hd2 =new HoaDonCaPhe("Trung Nguyen", 150000, 3);
        System.out.println("Tong tien Hoa Don 1: "+hd.tinhTongtien());
        System.out.println("Tong tien Hoa Don 2: "+hd2.tinhTongtien());
        System.out.println("Kiem tra Lon hon hd: "+hd.KiemTraLonHon(5));
        System.out.println("Kiem tra Lon hon hd2: "+hd2.KiemTraLonHon(5));
        System.out.println("Kiem tra Giam Gia hd: "+hd.KiemtraGiamGia(20));
        System.out.println("Kiem tra Giam Gia hd2: "+hd2.KiemtraGiamGia(20));
        System.out.println("Giam gia cua hd: "+hd.GiaSauKhiGiam(20));
        System.out.println("Giam gia cua hd2: "+hd2.GiaSauKhiGiam(20));
    }
 }
