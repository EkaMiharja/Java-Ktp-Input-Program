import java.util.Scanner; // import class Scanner

public class ProgramKTP_Multi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

        // batas maksimal data
        int max = 100;

        // array untuk menyimpan data
        String[] nik = new String[max];
        String[] nama = new String[max];
        String[] tempatLahir = new String[max];
        String[] tanggalLahir = new String[max];
        String[] jk = new String[max];
        String[] alamat = new String[max];
        String[] agama = new String[max];
        String[] status = new String[max];
        String[] pekerjaan = new String[max];
        String[] kewarganegaraan = new String[max];

        int jumlahData = 0; // counter banyak data
        int pilihan;

        do { // loop menu
            System.out.println("\n=== MENU PROGRAM KTP ===");
            System.out.println("1. Input Data KTP");
            System.out.println("2. Tampilkan Semua Data KTP");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); // input pilihan
            input.nextLine(); // buang newline

            switch (pilihan) { // pilihan menu
                case 1:
                    if (jumlahData < max) { // jika data belum penuh
                        System.out.println("\n=== INPUT DATA KTP ===");
                        System.out.print("NIK           : ");
                        nik[jumlahData] = input.nextLine(); // input NIK
                        System.out.print("Nama          : ");
                        nama[jumlahData] = input.nextLine();// input Nama
                        System.out.print("Tempat Lahir  : ");
                        tempatLahir[jumlahData] = input.nextLine(); // input Tempat Lahir
                        System.out.print("Tanggal Lahir : ");
                        tanggalLahir[jumlahData] = input.nextLine(); // input Tanggal Lahir
                        System.out.print("Jenis Kelamin : ");
                        jk[jumlahData] = input.nextLine(); // input Jenis Kelamin
                        System.out.print("Alamat        : ");
                        alamat[jumlahData] = input.nextLine(); // input Alamat
                        System.out.print("Agama         : ");
                        agama[jumlahData] = input.nextLine(); // input Agama
                        System.out.print("Status        : ");
                        status[jumlahData] = input.nextLine(); // input Status
                        System.out.print("Pekerjaan     : ");
                        pekerjaan[jumlahData] = input.nextLine(); // input Pekerjaan
                        System.out.print("Kewarganegaraan : ");
                        kewarganegaraan[jumlahData] = input.nextLine(); // input Kewarganegaraan

                        jumlahData++; // tambah jumlah data
                        System.out.println("\nData berhasil disimpan!");
                    } else {
                        System.out.println("\nData sudah penuh (max " + max + ")"); // jika data sudah penuh
                    }
                    break;

                case 2:
                    if (jumlahData > 0) { // jika ada data
                        System.out.println("\n=== SEMUA DATA KTP ===");
                        for (int i = 0; i < jumlahData; i++) { // tampilkan semua data
                            System.out.println("\n--- Data ke-" + (i + 1) + " ---"); // nomor data
                            System.out.println("NIK            : " + nik[i]); // tampilkan nik
                            System.out.println("Nama           : " + nama[i]); // tampilkan nama
                            System.out.println("Tempat/Tgl Lhr : " + tempatLahir[i] + ", " + tanggalLahir[i]); // tampilkan
                                                                                                               // tempat/tanggal
                                                                                                               // lahir
                            System.out.println("Jenis Kelamin  : " + jk[i]); // tampilkan jenis kelamin
                            System.out.println("Alamat         : " + alamat[i]); // tampilkan alamat
                            System.out.println("Agama          : " + agama[i]); // tampilkan agama
                            System.out.println("Status         : " + status[i]); // tampilkan status
                            System.out.println("Pekerjaan      : " + pekerjaan[i]); // tampilkan pekerjaan
                            System.out.println("Kewarganegaraan: " + kewarganegaraan[i]); // tampilkan kewarganegaraan
                        }
                    } else {
                        System.out.println("\nBelum ada data KTP."); // jika tidak ada data
                    }
                    break;

                case 3:
                    System.out.println("Terimakasih telah menggunakan program ini"); // keluar dari program
                    break;

                default:
                    System.out.println("Pilihan tidak valid!"); // jika pilihan tidak valid
            }

        } while (pilihan != 3); // loop menu
    }
}
