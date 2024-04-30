package baithi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoDichDat> danhSachGiaoDich = new ArrayList<>();
        try {
            while (true) {
                System.out.println("1: Nhap n giao dich");
                System.out.println("2: Hien thi thong tin da nhap");
                System.out.println("3: Xuat ra giao dich hon 2 ty");
                System.out.println("4: Sap xep danh sach cac giao dich giam dan theo thanh tien");
                System.out.println("5: Dua ra giao dich co so tien lon nhat");
                System.out.println("0: Thoat");
                System.out.println("Nhap chuc nang ban chon: ");
                int func = Integer.parseInt(sc.nextLine());
                switch (func) {
                    case 1:
                        System.out.print("Nhap so luong giao dich: ");
                        int soLuong = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < soLuong; i++) {
                            System.out.println("Nhap thong tin cho giao dich thu " + (i + 1) + ":");
                            GiaoDichDat gd = new GiaoDichDat();
                            gd.inPut();
                            danhSachGiaoDich.add(gd);
                            System.out.println("Da them giao dich");
                        }
                        break;
                    case 2:
                        System.out.println("Danh sach giao dich:");
                        for (GiaoDichDat gd : danhSachGiaoDich) {
                            gd.outPut();
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("Cac giao dich co gia tri hon 2 ty:");
                        for (GiaoDichDat gd : danhSachGiaoDich) {
                            if (gd.tinhThanhTien() > 2000000000) {
                                gd.outPut();
                            }
                        }
                        break;
                    case 4:
                        Collections.sort(danhSachGiaoDich, new Comparator<GiaoDichDat>() {
                            @Override
                            public int compare(GiaoDichDat gd1, GiaoDichDat gd2) {
                                double thanhTien1 = gd1.tinhThanhTien();
                                double thanhTien2 = gd2.tinhThanhTien();
                                if (thanhTien1 > thanhTien2) {
                                    return -1;
                                } else if (thanhTien1 < thanhTien2) {
                                    return 1;
                                } else {
                                    return 0;
                                }
                            }
                        });
                        for (GiaoDichDat gd : danhSachGiaoDich) {
                            gd.outPut();
                            System.out.println();
                        }
                        break;
                    case 5:
                        double tg = 0;
                        int pos = 0;
                        for (int i = 0; i < danhSachGiaoDich.size(); i++) {
                            if (danhSachGiaoDich.get(i).tinhThanhTien() > tg) {
                                tg = danhSachGiaoDich.get(i).tinhThanhTien();
                                pos = i;
                            }
                        }
                        System.out.println("Giao dich co so tien cao nhat: ");
                        danhSachGiaoDich.get(pos).outPut();
                        break;
                    case 0:
                        System.out.println("Da thoat chuong trinh");
                        return;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
