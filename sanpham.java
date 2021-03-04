import java.util.Scanner;

public class sanpham {
    private String tenSp;
    private double donGia, giamGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Nhập vào thông tin sản phẩm:----");
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
        sc.nextLine();
    }

    private double getThueNhapKhau() {
        double thuenhapkhau;
        thuenhapkhau = donGia / 10;
        return thuenhapkhau;
    }

    public void xuat() {
        System.out.println("-------------------------------");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);

    }

    public sanpham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public sanpham() {
    }
    
    public sanpham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenSp() {
        return this.tenSp;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    public static void main(String[] args) {
        // bai 1 2 :
        // sanpham sp1 = new sanpham();
        // sp1.nhap();
        // sp1.xuat();
        // System.out.println("Thuế nhập khẩu: " + sp1.getThueNhapKhau());
        // System.out.println("------------------------------###");
        // sanpham sp2 = new sanpham();
        // sp2.nhap();
        // sp2.xuat();
        // System.out.println("Thuế nhập khẩu: " + sp2.getThueNhapKhau());

        // bai 3 : 
        // sanpham sp1 = new sanpham("Chanh", 5000, 100);
        // sanpham sp2 = new sanpham("Xả", 3000);
        // System.out.println("--------------------------####");
        // sp1.xuat();
        // sp2.xuat();

        // bai 4 : mặc định chạy bài 4
        sanpham sp = new sanpham("Chanh", 5000, 100);
        System.out.println("Tên sản phẩm: " + sp.getTenSp());
        System.out.println("Đơn giá: " + sp.getDonGia());
        System.out.println("Giảm giá: " + sp.getGiamGia());
        System.out.println("---------------------------####");
        sp.setTenSp("Xả");
        sp.setDonGia(3000);
        sp.setGiamGia(50);
        System.out.println("Tên sản phẩm: " + sp.getTenSp());
        System.out.println("Đơn giá: " + sp.getDonGia());
        System.out.println("Giảm giá: " + sp.getGiamGia());

    }
}
