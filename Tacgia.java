
public class Tacgia {
        private String tenTacGia;
        private ngay ngaysinh;
        public Tacgia(String tenTacGia,ngay ngaysinh){
            this.tenTacGia=tenTacGia;
            this.ngaysinh=ngaysinh;

        }
        public ngay getNgaysinh() {
            return ngaysinh;
        }
        public String getTenTacGia() {
            return tenTacGia;
        }
        public void setNgaysinh(ngay ngaysinh) {
            this.ngaysinh = ngaysinh;
        }
        public void setTenTacGia(String tenTacGia) {
            this.tenTacGia = tenTacGia;
        }
}
