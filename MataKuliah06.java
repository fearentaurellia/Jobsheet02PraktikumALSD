package Jobsheet02;

public class MataKuliah06 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah06() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama             : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
        System.out.println("----------------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    public void tambahJam(int tambahanJam) {
        this.jumlahJam += tambahanJam;
        System.out.println("Jumlah jam berhasil ditambahkan, sekarang menjadi: " + jumlahJam);
    }

    public void kurangiJam(int penguranganJam) {
        if (this.jumlahJam >= penguranganJam) {
            this.jumlahJam -= penguranganJam;
            System.out.println("Jumlah jam berhasil dikurangi, sekarang menjadi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi.");
        }
    }

}
    

