package Jobsheet02;

public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk1 = new MataKuliah06("IF123", "Algoritma dan Struktur Data", 3, 6);
        MataKuliah06 mk2 = new MataKuliah06("IF456", "Pemrograman Berorientasi Objek", 4, 8);

        System.out.println("=== Informasi Mata Kuliah Awal ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();

        mk1.ubahSKS(4);
        mk2.ubahSKS(3);

        mk1.tambahJam(2);
        mk2.kurangiJam(3);

        System.out.println("=== Informasi Mata Kuliah Setelah Perubahan ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }

}

