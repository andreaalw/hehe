package Session5;

import java.util.ArrayList;

public class Service {
    protected String driverName;
    protected String plate;
    protected String alamatTujuan;
    protected String namaCust;
    protected String noHPCust;
    protected String titikJemput;

    public Service(String plate, String noHPCust, String titikJemput,String alamatTujuan) {
        this.plate = plate;
        this.alamatTujuan = alamatTujuan;
        this.noHPCust = noHPCust;
        this.titikJemput = titikJemput;
    }

    public String getPlate() {
        return plate;
    }

    public String getNoHPCust() {
        return noHPCust;
    }

    public String getTitikJemput() {
        return titikJemput;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public int CalculatePrice(){
        return (titikJemput + alamatTujuan).length() *1000;
    }

}

class Food extends Service{
    ArrayList<String> products;
    public Food(String plate, String noHPCust, String titikJemput,String alamatTujuan){
        super(plate, noHPCust, titikJemput, alamatTujuan);
        products = new ArrayList<>();

    }
}

class Delivery extends Service{
    private int berat;

    public Delivery(String plate, String noHPCust, String titikJemput,String alamatTujuan,int berat){
        super(plate, noHPCust, titikJemput, alamatTujuan);
        this.berat =berat;

    }

}