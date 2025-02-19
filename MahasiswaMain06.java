package Jobsheet02;
public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhsl = new Mahasiswa06();
        
        public Mahasiswa06() {  
        }
        
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa06 mhs2 = new Mahasiswa06 ("Annisa Nabilla", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}