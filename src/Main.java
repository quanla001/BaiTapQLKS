import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();

        while (true) {
            System.out.println("1. Thêm khách thuê phòng");
            System.out.println("2. Xóa khách theo số CMND");
            System.out.println("3. Tính tiền thuê phòng");
            System.out.println("4. Exit");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhập số CMND: ");
                    String soCMND = scanner.nextLine();
                    System.out.print("Nhập loại phòng (A/B/C): ");
                    String loai = scanner.nextLine().toUpperCase();
                    System.out.print("Nhập số ngày thuê: ");
                    int soNgayThue = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    LoaiPhong loaiPhong;
                    switch (loai) {
                        case "A":
                            loaiPhong = LoaiPhong.A;
                            break;
                        case "B":
                            loaiPhong = LoaiPhong.B;
                            break;
                        case "C":
                            loaiPhong = LoaiPhong.C;
                            break;
                        default:
                            System.out.println("Loại phòng không hợp lệ!");
                            continue;
                    }

                    Nguoi nguoiThue = new Nguoi(hoTen, tuoi, soCMND);
                    Phong phong = new Phong(loaiPhong, soNgayThue, nguoiThue);
                    khachSan.themKhach(phong);
                    System.out.println("Thêm khách thành công!");
                    break;

                case 2:
                    System.out.print("Nhập số CMND: ");
                    String cmndXoa = scanner.nextLine();
                    khachSan.xoaKhach(cmndXoa);
                    System.out.println("Xóa khách thành công!");
                    break;

                case 3:
                    System.out.print("Nhập số CMND: ");
                    String cmndTinhTien = scanner.nextLine();
                    double tienThue = khachSan.tinhTienThue(cmndTinhTien);
                    if (tienThue == 0) {
                        System.out.println("Không tìm thấy khách hàng với số CMND này!");
                    } else {
                        System.out.println("Tiền thuê phòng: " + tienThue);
                    }
                    break;

                case 4:
                    System.out.println("Exit...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}