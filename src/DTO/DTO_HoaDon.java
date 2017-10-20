/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class DTO_HoaDon {
    int MaHD,MaNV,MaKH,TongTien;
    String SoHD,NgayTao,GhiChu;

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getSoHD() {
        return SoHD;
    }

    public void setSoHD(String SoHD) {
        this.SoHD = SoHD;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public DTO_HoaDon() {
    }

    public DTO_HoaDon(int MaNV, int MaKH, int TongTien, String SoHD, String NgayTao, String GhiChu) {
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.TongTien = TongTien;
        this.SoHD = SoHD;
        this.NgayTao = NgayTao;
        this.GhiChu = GhiChu;
    }

    public DTO_HoaDon(int MaHD, int MaNV, int MaKH, int TongTien, String SoHD, String NgayTao, String GhiChu) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.TongTien = TongTien;
        this.SoHD = SoHD;
        this.NgayTao = NgayTao;
        this.GhiChu = GhiChu;
    }
}
