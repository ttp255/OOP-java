import java.util.Set;

public class Lop {
    private String tenLop;
    private String tenKhoa;
    public Lop(String tenLop,String tenKhoa){
        this.tenLop=tenLop;
        this.tenKhoa=tenKhoa;
    }
    public String getTenLop() {
        return tenLop;
    }
    public String getTenKhoa() {
        return tenKhoa;
    }
    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}
