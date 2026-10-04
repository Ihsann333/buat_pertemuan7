/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author loq
 */
public abstract class Buku {
    private final String idBuku;
    protected String judul;
    protected String penulis;
    protected int tahunTerbit;
    protected int halaman;
    

    // Constructor
    public Buku(String idBuku, String judul, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        setJudul(judul);
        setPenulis(penulis);
        setTahunTerbit(tahunTerbit);
    }

    // Getter untuk ID Buku
    public String getIdBuku() {
        return idBuku;
    }

    // Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // Setter untuk judul
    public void setJudul(String judul) {
        if (judul != null && !judul.trim().isEmpty()) {
            this.judul = judul;
        } else {
            System.out.println("Judul tidak boleh kosong!");
        }
    }

    // Getter untuk penulis
    public String getPenulis() {
        return penulis;
    }

    // Setter untuk penulis
    public void setPenulis(String penulis) {
        if (penulis != null && !penulis.trim().isEmpty()) {
            this.penulis = penulis;
        } else {
            System.out.println("Penulis tidak boleh kosong!");
        }
    }

    // Getter untuk tahun terbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter untuk tahun terbit
    public void setTahunTerbit(int tahunTerbit) {
        if (tahunTerbit >= 1900 && tahunTerbit <= 2026) {
            this.tahunTerbit = tahunTerbit;
        } else {
            System.out.println(
                "Tahun terbit harus berada di antara 1900 dan 2026!"
            );
        }
    }

    public void tampilkanInfoHalaman() {
        System.out.println("sedang membaca pada halaman:" + halaman);
    }
    
    // Method untuk menampilkan informasi buku (Override)
    public void tampilkanInfo() {
        System.out.println("-------------------------------");
        System.out.println("ID Buku      : " + this.idBuku);
        System.out.println("Judul        : " + this.judul);
        System.out.println("Penulis      : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("-------------------------------");
    }
    
    public abstract double hitungDenda(int hariTerlambat);
    
    public final void cetakStatusAset() {
        System.out.println("status aset: terdaftar sebagai koleksi perpustakaan");
    }
}