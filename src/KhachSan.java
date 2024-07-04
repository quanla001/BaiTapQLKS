import java.util.ArrayList;
import java.util.List;
class KhachSan {
    private List<Phong> danhSachPhong;

    public KhachSan() {
        this.danhSachPhong = new ArrayList<>();
    }

    public void themKhach(Phong phong) {
        danhSachPhong.add(phong);
    }

    public void xoaKhach(String soCMND) {
        danhSachPhong.removeIf(phong -> phong.getNguoiThue().getSoCMND().equals(soCMND));
    }

    public double tinhTienThue(String soCMND) {
        for (Phong phong : danhSachPhong) {
            if (phong.getNguoiThue().getSoCMND().equals(soCMND)) {
                return phong.getSoNgayThue() * phong.getGia();
            }
        }
        return 0;
    }
}