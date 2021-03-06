/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irfan07156;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author User
 */
public class Irfan07156 {
    Irfan07156_JurusanEntity jurusan_entity = new Irfan07156_JurusanEntity();
    ArrayList <Irfan07156_MahasiswaEntity> Irfan07156_dataMahasiswa = new ArrayList();
    Scanner Irfan07156_input = new Scanner(System.in);
    int Irfan07156_pil, Irfan07156_pil_data, Irfan07156_jurusan;
    String Irfan07156_npm, Irfan07156_nama, Irfan07156_notelp, Irfan07156_password;
    Date Irfan07156_tglLahir;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Irfan07156 global = new Irfan07156();
        System.out.println("Selamat Datang di Aplikasi Pendataan Mahasiswa !!");
        do{
            System.out.println("1. Pendaftaran Mahasiswa");
            System.out.println("2. Lihat data Mahasiswa");
            System.out.println("3. Edit data Mahasiswa");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Exit");
            global.Irfan07156_pil = global.Irfan07156_input.nextInt();
            switch(global.Irfan07156_pil) {
                case 1:
                    global.viewPendaftaran();
                    break;
                case 2:
                    global.viewLihatDataMahasiswa();
                    break;
                case 3:
                    global.viewEditDataMahasiswa();
                    break;
                case 4:
                    global.viewHapusDataMahasiswa();
                    break;
            }
        } while( global.Irfan07156_pil != 5 );
    }
    
    public void viewPendaftaran() {
        System.out.println("Input NPM = ");
        Irfan07156_npm = Irfan07156_input.next();
        System.out.println("Input Nama = ");
        Irfan07156_nama = Irfan07156_input.next();
        System.out.println("Input Tanggal Lahir = ");
        Irfan07156_tglLahir = new Date(Irfan07156_input.next());
        System.out.println("Input No. Telp = ");
        Irfan07156_notelp = Irfan07156_input.next();
        System.out.println("Input Password = ");
        Irfan07156_password = Irfan07156_input.next();
        for( int i = 0; i < jurusan_entity.Irfan07156_jurusan.length; i++ ) {
            System.out.println(i+". "+jurusan_entity.Irfan07156_jurusan[i]);
        }
        System.out.println("Pilih Jurusan = ");
        Irfan07156_jurusan = Irfan07156_input.nextInt();
        Irfan07156_dataMahasiswa.add(new Irfan07156_MahasiswaEntity(Irfan07156_nama, Irfan07156_tglLahir, 
                                    Irfan07156_npm, Irfan07156_password, Irfan07156_jurusan, Irfan07156_notelp));
        System.out.println("Data Berhasil DiTambahkan");
    }
    
    public void viewLihatDataMahasiswa() {
        for( int i = 0; i < Irfan07156_dataMahasiswa.size(); i++ ) {
            System.out.println(i+". "+Irfan07156_dataMahasiswa.get(i).getNpm()+" "+
                                    Irfan07156_dataMahasiswa.get(i).getNama()+" "+
                                jurusan_entity.Irfan07156_jurusan[Irfan07156_dataMahasiswa.get(i).getJurusan()]);
        }
    }
    
    public void viewEditDataMahasiswa() {
        for( int i = 0; i < Irfan07156_dataMahasiswa.size(); i++ ) {
            System.out.println(i+". "+Irfan07156_dataMahasiswa.get(i).getNpm()+" "+
                                    Irfan07156_dataMahasiswa.get(i).getNama()+" "+
                                jurusan_entity.Irfan07156_jurusan[Irfan07156_dataMahasiswa.get(i).getJurusan()]);
        }
        System.out.println("Pilih Angka untuk Edit Data : ");
        Irfan07156_pil = Irfan07156_input.nextInt();
        System.out.println("0. NPM : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getNpm());
        System.out.println("1. Nama : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getNama());
        System.out.println("2. Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyy").format(Irfan07156_dataMahasiswa.get(Irfan07156_pil).getTanggalLahir()));
        System.out.println("3. No. Telp : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getNoTelp());
        System.out.println("4. Password : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getPassword());
        System.out.println("5. Jurusan : "+jurusan_entity.Irfan07156_jurusan[Irfan07156_dataMahasiswa.get(Irfan07156_pil).getJurusan()]);
        System.out.println("Pilih Angka untuk Data yang ingin diubah : ");
        Irfan07156_pil_data = Irfan07156_input.nextInt();
        switch(Irfan07156_pil_data) {
            case 0:
                System.out.println("NPM Sekarang : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getNpm());
                System.out.println("Masukkan NPM Baru : ");
                Irfan07156_npm = Irfan07156_input.next();
                Irfan07156_dataMahasiswa.get(Irfan07156_pil).Irfan07156_npm = Irfan07156_npm;
                break;
            case 1:
                System.out.println("Nama Sekarang : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getNama());
                System.out.println("Masukkan Nama Baru : ");
                Irfan07156_nama = Irfan07156_input.next();
                Irfan07156_dataMahasiswa.get(Irfan07156_pil).Irfan07156_nama = Irfan07156_nama;
                break;
            case 2:
                System.out.println("Tanggal Lahir Sekarang : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getTanggalLahir());
                System.out.println("Masukkan NPM Baru : ");
                Irfan07156_tglLahir = new Date(Irfan07156_input.next());
                Irfan07156_dataMahasiswa.get(Irfan07156_pil).Irfan07156_tanggal_lahir = Irfan07156_tglLahir;
                break;
            case 3:
                System.out.println("No. Telp Sekarang : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getNoTelp());
                System.out.println("Masukkan NPM Baru : ");
                Irfan07156_notelp = Irfan07156_input.next();
                Irfan07156_dataMahasiswa.get(Irfan07156_pil).Irfan07156_notelp = Irfan07156_notelp;
                break;
            case 4:
                System.out.println("Password Sekarang : "+Irfan07156_dataMahasiswa.get(Irfan07156_pil).getPassword());
                System.out.println("Masukkan NPM Baru : ");
                Irfan07156_password = Irfan07156_input.next();
                Irfan07156_dataMahasiswa.get(Irfan07156_pil).Irfan07156_password = Irfan07156_password;
                break;
            case 5:
                for( int j = 0; j < jurusan_entity.Irfan07156_jurusan.length; j++ ) {
                    System.out.println(j+". "+jurusan_entity.Irfan07156_jurusan[j]);
                }
                System.out.println("Jurusan Sekarang : "+jurusan_entity.Irfan07156_jurusan[Irfan07156_dataMahasiswa.get(Irfan07156_pil).getJurusan()]);
                System.out.println("Pilih Jurusan = ");
                Irfan07156_jurusan = Irfan07156_input.nextInt();
                Irfan07156_dataMahasiswa.get(Irfan07156_pil).Irfan07156_jurusan = Irfan07156_jurusan;
                break;
        }
        System.out.println("Data Berhasil DiEdit");
    }
    
    public void viewHapusDataMahasiswa() {
        for( int i = 0; i < Irfan07156_dataMahasiswa.size(); i++ ) {
            System.out.println(i+". "+Irfan07156_dataMahasiswa.get(i).getNpm()+" "+Irfan07156_dataMahasiswa.get(i).getNama()+" "+
                                jurusan_entity.Irfan07156_jurusan[Irfan07156_dataMahasiswa.get(i).getJurusan()]);
        }
        System.out.println("Pilih Angka untuk Hapus Data : ");
        Irfan07156_pil = Irfan07156_input.nextInt();
        Irfan07156_dataMahasiswa.remove(Irfan07156_dataMahasiswa.get(Irfan07156_pil));
        System.out.println("Data Berhasil Dihapus");
    }
}
