package Session5;

public class Ride extends Service {
    private int jumlahPenumpang;

    public Ride(String plate, String noHPCust, String titikJemput, String alamatTujuan) {
//        this.plate =  plate; //ga btuh
        super(plate, noHPCust, titikJemput, alamatTujuan);
        jumlahPenumpang = 1;
    }

    public Ride(String plate, String noHPCust, String titikJemput, String alamatTujuan, int jumlahPenumpang) {
//        this.plate =  plate; //ga btuh
        super(plate, noHPCust, titikJemput, alamatTujuan);
        this.jumlahPenumpang = jumlahPenumpang;
    }

}
