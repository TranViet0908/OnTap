package baithi;

import java.util.Scanner;

public class GiaoDich {
    private String maGiaoDich;
    private String ngayGiaoDich;
    private double donGia;
    private double dienTich;
    public static Scanner sc = new Scanner(System.in);
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    public GiaoDich(){

    }
    public void inPut(){
        System.out.println("Nhap ma giao dich");
        maGiaoDich = sc.nextLine();
        System.out.println("Nhap ngay giao dich");
        ngayGiaoDich = sc.nextLine();
        try {
            while(true){
                System.out.println("Nhap don gia");
                donGia = Double.parseDouble(sc.nextLine());
                try {
                    setDonGia(donGia);
                    break;
                } catch (LoiNhapGia e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhap so tien cua don gia");
        }
        System.out.println("Nhap dien tich");
        dienTich = Double.parseDouble(sc.nextLine());
    }
    
    public void outPut(){
        System.out.println("Ma giao dich: " + this.maGiaoDich);
        System.out.println("Ngay giao dich: " + this.ngayGiaoDich);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Dien tich: " + this.dienTich);
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) throws LoiNhapGia {
        if(donGia <= 0){
            throw new LoiNhapGia("Nhap gia lon hon 0");
        } else this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
}