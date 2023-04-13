package TutorWithIbRendi;
//Enkapsulasi

/*
kalo protected tu hanya bissa di 1 package yang sama
tapi kalo private itu local
kalo public bisa semua
subclass tu ga mewariskan apapun
tapi kalo inheritance ada hubungan

kalo mau ngimport dari public class lain ada lebih dari 1 file itu ada *(semua)

jangan sering sering pake public

kalo method sama, ada yang double ada yang int
overloading => ngeribetin

static itu berbagi object yang sama walauun bedaa, jadi object object lain bakal ngikutin pa yang kita inputin
terakhir.

pake static saat pengen bagi bagi data.

kalo function sama, tapi hindari static selain static.
*/

import java.util.ArrayList;

class Gudang{
    String alamat;
    String nama;

    ArrayList<Kotak> ayam;
    //kalo new array list kan berati bikin gdang lagi yang beda, kan kita mau nya gudang nya udah ad isi
    //

    Gudang(String alamat, String nama, ArrayList<Kotak>ayam){
        this.alamat = alamat;
        this.nama = nama;
        this.ayam = ayam;
        //object reference
    }
}

class Kotak{
    int panjang;

    int lebar;
    private int luas; //khusus didalem class kotak doang
    private int kel;

    static int hitung = 0; // inii jadi sama, jadi kek ad 1 yang berkurang yang lian juga berkurang


    Kotak(int panjang, int lebar){//construct
        this.panjang =panjang;
        this.lebar = lebar;
        this.luas = panjang*lebar;
        this.kel = (2*panjang)+ (2*lebar);
    }

    //return nillai sesuatu ya ngikutin tipe datanya, misal int luas ya int

    int getLuas(){ //getter
        return this.luas; //otomatis ngembaliin nilai
    }
    int getKel(){
        return this.kel;
    }
}

public class tutorIB {
    public static void main(String[] args) {
        ArrayList<Kotak> ayam = new ArrayList<Kotak>(); // sama kaya arraylist kotak ayam.
        Gudang sidoarjo = new Gudang("rumah Celo","Bahari",ayam);
        // ini kalo si felixon diganti sama ayam boleh, karena si kotak arrayList itu samaaaaa gaada bedaa

        sidoarjo.ayam.add(new Kotak(10,20));
        sidoarjo.ayam.add(new Kotak(23,3));


//        Kotak kotak = new Kotak(20,10);
//        Kotak kotak1 = new Kotak(10,90);


//        kotak = sidoarjo.ayam
        for (Kotak kotak2:sidoarjo.ayam) {
            System.out.println(kotak2.getLuas());
        }

//         gudang.add(new Kotak(10,20));
//         gudang.add(new Kotak(89,10));
//         gudang.add(new Kotak(11,2));

//        System.out.println(gudang.get(1).getLuas());
//        System.out.println(gudang.get(2).getLuas());



//        for (int i = 0; i < sidoarjo.ayam.size(); i++) {
//
//        }


//         kotak.hitung = 10;
//            System.out.println(kotak.hitung);
//
//         kotak1.hitung = 20;
//            System.out.println(kotak1.hitung);

//        System.out.println(kotak.getLuas());
//        System.out.println(kotak.getKel());

//        Kotak.hitung;


    }
}
