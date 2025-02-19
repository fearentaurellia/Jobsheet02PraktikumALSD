package Jobsheet02;

public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Ir. Budi Santoso, M.T.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Teknik Informatika";

        Dosen06 dosen2 = new Dosen06("D002", "Dr. Eng. Ani Wulandari, S.T., M.Sc.", false, 2010, "Teknik Kimia");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(2024) + " tahun");
        dosen1.ubahBidangKeahlian("Rekayasa Perangkat Lunak");

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja Dosen 2: " + dosen2.hitungMasaKerja(2024) + " tahun");
        dosen2.ubahBidangKeahlian("Pengolahan Sinyal");
    }

    
}
