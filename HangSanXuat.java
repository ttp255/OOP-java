public class HangSanXuat {
    private String tenHangSanXuat;
    private Quocgia quocGia;
    public HangSanXuat(String tenHangSanXuat,Quocgia quocGia){
        this.tenHangSanXuat=tenHangSanXuat;
        this.quocGia=quocGia;
    }
    public Quocgia getQuocGia() {
        return quocGia;
    }
    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }
    public void setQuocGia(Quocgia quocGia) {
        this.quocGia = quocGia;
    }
    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }
    public String laytenQuocGia() {
        return this.quocGia.getTenQuocGia();
    }
    
    }
    
    
   

