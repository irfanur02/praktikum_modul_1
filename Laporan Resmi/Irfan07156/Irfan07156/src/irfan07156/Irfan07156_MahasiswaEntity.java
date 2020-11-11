/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irfan07156;

import java.util.Date;

/**
 *
 * @author User
 */
public class Irfan07156_MahasiswaEntity {
    String Irfan07156_nama, Irfan07156_password, Irfan07156_npm, Irfan07156_notelp;
    int Irfan07156_jurusan;
    Date Irfan07156_tanggal_lahir;
    
    public Irfan07156_MahasiswaEntity(String Irfan07156_nama, Date Irfan07156_tgl_lahir, String Irfan07156_npm, String Irfan07156_password, 
                                    int Irfan07156_jurusan, String Irfan07156_notelp) {
        this.Irfan07156_nama = Irfan07156_nama;
        this.Irfan07156_npm = Irfan07156_npm;
        this.Irfan07156_tanggal_lahir = Irfan07156_tgl_lahir;
        this.Irfan07156_password = Irfan07156_password;
        this.Irfan07156_jurusan = Irfan07156_jurusan;
        this.Irfan07156_notelp = Irfan07156_notelp;
    }
    
    String getNama() {
        return this.Irfan07156_nama;
    }
    
    String getNpm() {
        return this.Irfan07156_npm;
    }
    
    Date getTanggalLahir() {
        return this.Irfan07156_tanggal_lahir;
    }
    
    String getPassword() {
        return this.Irfan07156_password;
    }
    
    String getNoTelp() {
        return this.Irfan07156_notelp;
    }
    
    int getJurusan() {
        return this.Irfan07156_jurusan;
    }
}
