package SL04Baru;

public class Teacher extends User{
    Teacher(String name, String pass) {
        super(name, pass);
    }
    public static boolean checkPass(String pass){
        if(pass.equalsIgnoreCase("akuguru")){
//            System.out.println("Hello welcome to Wakanda");
            return true;
        }else {
            System.out.println("Wrong Password!!");
            System.out.println("Please try again");
            return false;
        }

    }

    @Override
    public void display() {
        super.display();
    }
}
