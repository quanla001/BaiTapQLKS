class Phong {
    private LoaiPhong loaiPhong;
    private int soNgayThue;
    private Nguoi nguoiThue;

    public Phong(LoaiPhong loaiPhong, int soNgayThue, Nguoi nguoiThue) {
        this.loaiPhong = loaiPhong;
        this.soNgayThue = soNgayThue;
        this.nguoiThue = nguoiThue;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public Nguoi getNguoiThue() {
        return nguoiThue;
    }

    public void setNguoiThue(Nguoi nguoiThue) {
        this.nguoiThue = nguoiThue;
    }

    public double getGia() {
        return loaiPhong.getGia();
    }

    @Override
    public String toString() {
        return "Phong{" +
                "loaiPhong=" + loaiPhong +
                ", soNgayThue=" + soNgayThue +
                ", nguoiThue=" + nguoiThue +
                '}';
    }
}