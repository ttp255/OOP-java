public class Quocgia {
    private int maQuocGia;
    private String tenQuocGia;
    public Quocgia(int maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }
    public int getMaQuocGia() {
        return maQuocGia;
    }
    public void setMaQuocGia(int maQuocGia) {
        this.maQuocGia = maQuocGia;
    }
    public String getTenQuocGia() {
        return tenQuocGia;
    }
    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
    public String laytenQuocGia(){
        return this.tenQuocGia;
    }
    
}
