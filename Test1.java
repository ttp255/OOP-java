public class Test1 {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(25, 5, 2003);
        ngay ngay2 =new ngay(13,5,2006);
        ngay ngay3 =new ngay(26,5,2004);
        Tacgia tacGia1 = new Tacgia("TTP", ngay1);
        Tacgia tacGia2 = new Tacgia("PTT",ngay2);
        Tacgia tacGia3 =new Tacgia("TPT", ngay3);
        Sach sach1 =new Sach("Lap trinh ", 50000, 2022, tacGia1);
        Sach sach2 =new Sach("LAp trinh Python", 60000, 2023, tacGia2);
        Sach sach3 =new Sach("Lap trinh huong doi tuong", 700000, 2021, tacGia3);
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        System.out.println("So sanh nam xb sach3 vs sach2: "+ sach3.KiemTracungNXB(sach2));
        System.out.println("Gia sau khi giam cua sach 1: "+sach1.giaSauKhiGiam(20));
        System.out.println("Gia sau khi giam sach 3: "+sach3.giaSauKhiGiam(30));
        
}
}