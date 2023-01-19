public class Test5 {
    public static void main(String[] args) {
        ngay ngay1=new ngay(26, 9, 2016);
        ngay ngay2=new ngay(24,7,2036);
        Quocgia qg1 =new Quocgia(211111, "US");
        Quocgia qg2=new Quocgia(25555, "Korea");
        HangSanXuat hang1=new HangSanXuat("Marvel", qg1);
        HangSanXuat hang2= new HangSanXuat("DC", qg2);
        Maytinh mt1=new Maytinh(hang1, ngay2, 15000, 36);
        Maytinh mt2 =new Maytinh(hang2, ngay1, 50000, 24);
        System.out.println("mt1 gia thap hon mt2 "+mt1.kiemTra(mt2));
        System.out.println("Ten quoc gia mt1: "+mt1.laytenQuocGia());
        System.out.println("Ten quoc gia mt2: "+mt2.laytenQuocGia());

    }
}
