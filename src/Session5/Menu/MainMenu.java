package Session5.Menu;

import Session5.Ride;

public class MainMenu {
    public static void main(String[] args) {
        Ride ride = new Ride("D 333 A", "081578878878", "Jalan KH Dalhar No 8 Muntilan", "Rumah Dora");
        System.out.println("Price: " + ride.CalculatePrice());

    }
}
