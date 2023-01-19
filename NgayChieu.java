public class NgayChieu {
    private int ngay;
    private int thang;
    private int nam;
    public NgayChieu(int ngay,int thang, int nam){
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    public int getNgay() {
        return ngay;
    }
    public int getNam() {
        return nam;
    }
    public int getThang() {
        return thang;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

}
