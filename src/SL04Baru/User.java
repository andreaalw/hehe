package SL04Baru;

public class User {
    static String name;
//    String Noinduk;
    static String pass;

    User(String name, String pass){
        this.name = name;
//        this.Noinduk = Noinduk;
        this.pass = pass;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getNoinduk() {
//        return Noinduk;
//    }
//
//    public void setNoinduk(String noinduk) {
//        Noinduk = noinduk;
//    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void display(){

    }



}
