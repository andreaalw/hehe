package TutorWithIbRendi;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String NIM;
    String JenisKelamin;

    public Mahasiswa(String nama, String NIM, String jenisKelamin) {
        this.nama = nama;
        this.NIM = NIM;
        this.JenisKelamin = jenisKelamin;
        //kalo namanya NIM : nIM gausa pake this.
    }

    void showData(){
        System.out.println("Nama: "+nama+"\nNIM: "+NIM+ "\nJenisKelamin: "+JenisKelamin);
    }

    void setNama(String nama){
        this.nama = nama; // ini set nama, manggil dan ganti
    }

    String getNIM(){
        return this.NIM; //ngambil dari classnya, cm ngambil aja ya gabisa diganti ganti
    }

//    TutorWithIbRendi.Mahasiswa(String nama, String NIM, String JenisKelamin){//constructor
//        this.nama = nama; // fungsi this mengirim isi dari parameter diisi ke atribut nama di class, buat method method dibawah nya
    //kalo gaad this masi lokal
//        this.NIM = NIM;

}
//constructor bakal dipanggil pertama kali pas bikin object
//kalo method harus panggil methodnya

public class tutorPertama {
    public static void main(String[] args) {
        String nama;
        String NIM;
        String JenisKelamin;



        Scanner sc = new Scanner(System.in);//kalo ada kata new berati bikin object

        System.out.printf("Masukan nama");
        nama = sc.nextLine();
        System.out.printf("Masukan NIM");
        NIM = sc.nextLine();
        System.out.printf("Masukan Jenis Kelamin");
        JenisKelamin = sc.nextLine();

        Mahasiswa mhs1 = new Mahasiswa(nama,NIM,JenisKelamin);
        mhs1.showData();

        System.out.printf("Edit nama: ");
        nama = sc.nextLine();
        mhs1.setNama(nama); //set name mengganti
        mhs1.showData();
        System.out.println("NIMM nya berapa"+mhs1.getNIM()); //ini buat manggil




//        mhs1.nama = "andrea";
//        mhs1.NIM = "2789832";
//        mhs1.JenisKelamin= "Perempuan";
//
//        System.out.println("Nama: "+mhs1.nama);
//        System.out.println("NIM: "+mhs1.NIM);
//        System.out.println("Jenis Kelamin: "+mhs1.JenisKelamin);
//
//
//        TutorWithIbRendi.Mahasiswa mhs2 = new TutorWithIbRendi.Mahasiswa();
//        mhs2.nama = "Alengcius ";
//        mhs2.NIM = "2789832";
//        mhs2.JenisKelamin= "tidak tahu";
//
//        System.out.println("Nama: "+mhs2.nama);
//        System.out.println("NIM: "+mhs2.NIM);
//        System.out.println("Jenis Kelamin: "+mhs2.JenisKelamin);
    }
}
