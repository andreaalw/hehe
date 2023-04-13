package SL04;

import java.util.Scanner;

public abstract class Person {
        protected String name;
        protected String Matkul;
        protected String nomorInduk;


        //        private Double nilai;
        protected String pass;

        public Person(String name, String Matkul, String pass) {
                this.name = name;
                this.Matkul = Matkul;
                this.pass = pass;
        }


        public void setMatkul(String matkul) {
                this.Matkul = matkul;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPass() {
                return pass;
        }


//        public abstract void login();

        public String getName() {
                return name;
        }

        public String getMatkul() {
                return Matkul;
        }

        public void setPass(String pass) {
                this.pass = pass;
        }

//        public void login(Scanner scan){
//                System.out.println("Input name");
//                name = scan.nextLine();
//
//
//                System.out.println("input Your password:");
//                pass = scan.nextLine();
//
//        }

        public void display(){
                System.out.println("Hello "+this.name);
                System.out.println("Welcome to Wakanda!!\n\n");
        }

//        public abstract void login(Person name, Person Matkul, Person pass);
        public boolean masuk(String name, String password, String nomorinduk){
//                Scanner sc = new Scanner(System.in);
//                System.out.print("Masukkan nama: ");
                this.name = name;
//                System.out.print("Masukkan Password: ");
                this.pass = password;
//                System.out.print("Masukkan Nomor induk: ");
                this.nomorInduk=nomorinduk;

                if(pass.equals(password)&& name.equalsIgnoreCase(name)){
                        return true;
                }
                return false;

        }
//        public abstract void login();
}

