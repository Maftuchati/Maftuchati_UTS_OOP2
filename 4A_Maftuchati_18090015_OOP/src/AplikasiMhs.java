
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUCHATI
 */
public class AplikasiMhs {
    public static void main(String args[]) {
        AplikasiMhs app = new AplikasiMhs();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int answer = sc.nextInt();
            switch(answer) { 
                case 1:
                    System.out.println("Tambah Data Mahasiswa");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah Data Mahasiswa");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Hapus Data Mahasiswa");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Tampilkan Data Mahasiswa");
                    app.listData();
                    break;
                case 5:
                    return;
                    //Prosese memilih menu yang akan di pilih dan di lakukan 
            } 
        }
        
    }
    public void printMenu() {
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA ");
        System.out.println("----------------------------------");
        System.out.println("1. Tambah Data Mahsasiswa");
        System.out.println("2. Ubah Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Tampilkan Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }
    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----------------------");
        System.out.println("TAMBAH DATA MAHASISWA");
        System.out.println("----------------------");
        System.out.print("Nim : "); String Nim = sc.nextLine();
        System.out.print("Nama : "); String Nama = sc.nextLine();
        System.out.print("Tanggal lahir: "); String TanggalLahir = sc.nextLine();
        System.out.print("Alamat: "); String Alamat = sc.nextLine();
        Operasi.addData(new Data(Nim, Nama, TanggalLahir, Alamat));
        //  Proses Menambahakan Data Mahasiswa
    }
    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------");
         System.out.println("UBAH DATA MAHASISWA ");
        System.out.println("---------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------");
        System.out.print("Nim           : "); String Nim = sc.nextLine();
        System.out.print("Nama          : "); String Nama = sc.nextLine();
        System.out.print("Tanggal lahir : "); String TanggalLahir = sc.nextLine();
        System.out.print("Alamat        : "); String Alamat = sc.nextLine();
        Operasi.editData(new Data(Nim, Nama, TanggalLahir, Alamat), idx-1);
        //Proses Mngubah Data Mahasiswa yang sudah di input 
    }
    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
         System.out.println("-----------------------");
          System.out.println("HAPUS DATA MAHASISWA");
        System.out.println("------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        Operasi.removeData(idx-1);
        //Proses Hapus Data Mahasiswa di list
    }
    public void listData() {
        Scanner sc = new Scanner(System.in);
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("TAMPILKAN DATA MAHASISWA");
            System.out.println("---------------------------");
            System.out.println("Data ke-" + (i+1));
            System.out.println("---------------------------");
            System.out.println("  Nim            : " + result.get(i).getNim());
            System.out.println("  Nama           : " + result.get(i).getNama());
            System.out.println("  Tanggal lahir  : " + result.get(i).getTanggalLahir());
            System.out.println("  Alamat         : " + result.get(i).getAlamat()); 
             //list data yang sudah di input dan akan di tampilkan di layar 
        }
       
    
    }
}


    

