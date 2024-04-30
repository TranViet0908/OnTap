package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    public static Scanner sc = new Scanner(System.in);
    ArrayList <GiaoDich> DSGD = new ArrayList<GiaoDich>();
    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat,
            double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat, double thanhTien) {
        this.loaiDat = loaiDat;
    }
    public GiaoDichDat(){

    }

    @Override
    public void inPut(){
        super.inPut();
        System.out.println("Nhap loai dat");
        this.loaiDat = sc.nextLine();
    }
    @Override
    public void outPut(){
        super.outPut();
        System.out.println("Loai dat: " + this.loaiDat);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }

    public double tinhThanhTien() {
        double thanhTien;
        if (loaiDat.equalsIgnoreCase("A")) {
            thanhTien = getDienTich() * getDonGia() * 1.5;
        } else if (loaiDat.equalsIgnoreCase("B")) {
            thanhTien = getDienTich() * getDonGia();
        } else if (loaiDat.equalsIgnoreCase("C")) {
            thanhTien = getDienTich() * getDonGia();
        } else {
            thanhTien = 0;
            System.out.println("Loai dat khong hop le!");
        }
        return thanhTien;
    }
    
    public String getLoaiDat() {
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
}
