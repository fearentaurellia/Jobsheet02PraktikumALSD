package Jobsheet02;

public class Dosen06 {
        String idDosen;
        String nama;
        boolean statusAktif;
        int tahunBergabung;
        String bidangKeahlian;
    
        public Dosen06() {
        }
    
        public Dosen06(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
            this.idDosen = idDosen;
            this.nama = nama;
            this.statusAktif = statusAktif;
            this.tahunBergabung = tahunBergabung;
            this.bidangKeahlian = bidangKeahlian;
        }
    
        public void tampilInformasi() {
            System.out.println("ID Dosen: " + idDosen);
            System.out.println("Nama: " + nama);
            System.out.println("Status Aktif: " + statusAktif);
            System.out.println("Tahun Bergabung: " + tahunBergabung);
            System.out.println("Bidang Keahlian: " + bidangKeahlian);
        }
    
        public void setStatusAktif(boolean status) {
            this.statusAktif = status;
        }
    
        public int hitungMasaKerja(int tahunSekarang) {
            return tahunSekarang - tahunBergabung;
        }
    
        public void ubahBidangKeahlian(String bidang) {
            this.bidangKeahlian = bidang;
        }
    }

