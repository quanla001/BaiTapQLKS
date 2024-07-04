public enum LoaiPhong {
    A(500), B(300), C(100);

    private final int gia;

    LoaiPhong(int gia) {
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }
}
