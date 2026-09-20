/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author loq
 */
public class BukuCetak extends Buku {
    private int jumlahHalaman;
    private String lokasiRak;
    
    public BukuCetak(String idBuku, String judul, String penulis, int tahunTerbit, int jumlahHalaman, String lokasiRak) {
        super(idBuku, judul, penulis, tahunTerbit);
        
        setJumlahHalaman(jumlahHalaman);
        setLokasiRak(lokasiRak);
    }
    
    // ----- Getter & Setter khusus BukuCetak -----

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        if (jumlahHalaman > 0) {
            this.jumlahHalaman = jumlahHalaman;
        } else {
            System.out.println(">> ERROR: Jumlah halaman harus lebih dari 0!");
            this.jumlahHalaman = 1;
        }
    }

    public String getLokasiRak() {
        return lokasiRak;
    }

    public void setLokasiRak(String lokasiRak) {
        if (lokasiRak != null && !lokasiRak.trim().isEmpty()) {
            this.lokasiRak = lokasiRak;
        } else {
            System.out.println(">> ERROR: Lokasi rak tidak boleh kosong!");
        }
    }
    public void tampilkanInfoBukuCetak() {
        System.out.println("------------------------------------------");
        System.out.println("[KATEGORI: BUKU CETAK]");
        super.tampilkanInfo();
        System.out.println("Jml Halaman  : " + jumlahHalaman + " hlm");
        System.out.println("Lokasi Rak   : " + lokasiRak);
        cetakStatusAset();
        System.out.println("------------------------------------------");
    }
}
