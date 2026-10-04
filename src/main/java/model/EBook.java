/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author loq
 */
public class EBook extends Buku implements DapatDiunduh{
        // Atribut khusus EBook
    private double ukuranFileMB;
    private String formatFile;
    
    private final int dendaPerHari = 1000;

    // Constructor Subclass
    public EBook(String idBuku, String judul, String penulis, int tahunTerbit, double ukuranFileMB, String formatFile) {
        super(idBuku, judul, penulis, tahunTerbit);

        setUkuranFileMB(ukuranFileMB);
        setFormatFile(formatFile);
    }

    // ----- Getter & Setter khusus EBook -----

    public double getUkuranFileMB() {
        return ukuranFileMB;
    }

    public void setUkuranFileMB(double ukuranFileMB) {
        if (ukuranFileMB > 0) {
            this.ukuranFileMB = ukuranFileMB;
        } else {
            System.out.println(">> ERROR: Ukuran file harus lebih dari 0!");
            this.ukuranFileMB = 0.1;
        }
    }

    public String getFormatFile() {
        return formatFile;
    }

    public void setFormatFile(String formatFile) {
        if (formatFile != null && !formatFile.trim().isEmpty()) {
            this.formatFile = formatFile;
        } else {
            System.out.println(">> ERROR: Format file tidak boleh kosong!");
        }
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * dendaPerHari;
    }
    
    @Override
    public void unduh() {
        System.out.println("mengunduh e-book '" + getJudul() + "' (" + ukuranFileMB + "MB)...selesai");
    }
}
