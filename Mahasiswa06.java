package Jobsheet02;

public class Mahasiswa06 {

    public static void main(String[] args) {
        Mahasiswa06 mhs = new Mahasiswa06("Fearent Aurellia", "244107060014", 3.75, "SIB 1A");

        mhs.tampilkanInformasi();
    }

    String nama;
    String nim;
    String kelas;
    double ipk;


    public Mahasiswa06 (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    void tampilkanInformasi () {
        System.out.println("Nama: " + nama) ;
        System.out.println("NIM: " + nim) ;
        System.out.println("IPK: " + ipk) ;
        System.out.println("Kelas: " + kelas) ;
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja () {
        if (ipk >=3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
