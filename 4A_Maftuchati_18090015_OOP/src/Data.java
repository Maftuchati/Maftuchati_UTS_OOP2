/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAFTUCHATI
 */
public class Data {
    private String Nim;
    private String Nama;
    private String TanggalLahir;
    private String Alamat;

    public Data() {
        Nim = "";
        Nama = "";
        TanggalLahir = "";
        Alamat= "";
    }

    public Data(String Nim, String Nama, String TanggalLahir, String Alamat) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Alamat = Alamat;
    }

    public void setNim(String noNim) {
        this.Nim = Nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setTanggal_lahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNim() { return Nim; }

    public String getNama() { return Nama; }

    public String getTanggalLahir() { return TanggalLahir; }

    public String getAlamat() { return Alamat; }

    
    }





