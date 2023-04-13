package SL04Baru;

import java.util.ArrayList;

public class Student extends User{
    Student(String name, String pass) {
        super(name, pass);
    }

    ArrayList<Student> student = new ArrayList<Student>();

//    public Void andreCantik(){
//        student.add();
//    }

    @Override
    public void setPass(String pass) {
        super.setPass(pass);
    }

    public static boolean checkPass(String pass){
        if(pass.equalsIgnoreCase("akumurid")){
//            System.out.println("Hello welcome to Wakanda");
            return true;
        }else{
            System.out.println("Please try again");
            System.out.println("Wrong Password!!");
            return false;
        }
//        return false;

    }

    @Override
    public void display() {
        super.display();
    }
}
