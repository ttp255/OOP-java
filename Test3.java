/**
 * Test3
 */
public class Test3 {

    public static void main(String[] args) {
        day ngay1=new day(12, 6, 2016);
        day ngay2=new day(13, 7, 2016);
        Lop lop1=new Lop("12P", "Tin");
        Lop lop2=new Lop("12K", "CNTT");
        Sinhvien sv1= new Sinhvien(123465, "TTP", ngay1, 6, lop2);
        Sinhvien sv2= new Sinhvien(2110388, "PTT", ngay2, 8, lop1);
        System.out.println("Ten khoa sinh vien 1: "+sv1.layTenKhoa());
        System.out.println("Ket qua sinh vien 2: "+sv2.xepLoai());
        System.out.println("So sanh ngay sinh: "+sv2.soSanhNgaySinh(sv1));
    }
}
