

public class Test6 {
    public static void main(String[] args) {
      HangSanXuat1 hang1 =new HangSanXuat1("TOYOTA", "jAPAN");
        HangSanXuat1 hang2 =new HangSanXuat1("Huynhdai", "Korea");
        HangSanXuat1 hang3 =new HangSanXuat1("Boeing", "USA");
        PhuongTienDiChuyen p1=new Maybay(hang3, "Dau");
        PhuongTienDiChuyen p2 =new Xedap(hang2);
        PhuongTienDiChuyen p3=new Oto(hang1, "Xang");
        p1.BatDau();
        p2.Dunglai();
        System.out.println("Ten Hang San Xuat May bay: "+p1.layTenHangSanXuat());
        System.out.println("Lay van toc xe oto: "+p3.layVanToc());
        System.out.println("Ten Hang San Xuat May bay: "+p2.layTenHangSanXuat());


    }
}
