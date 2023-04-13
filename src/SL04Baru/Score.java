package SL04Baru;

import java.util.ArrayList;
import java.util.Scanner;

public class Score extends Course {
   protected int Ujian;
   public int U;
   public int E;

//    String mapel,
//    public int setUjian(){
//        this.Ujian();
//    }

    Score(String mapel, String tipe, int Ujian) {
        super(mapel, tipe);
        this.Ujian = Ujian;
    }
    ArrayList<Score> scores = new ArrayList<Score>();

    public int getUjian() {
        return Ujian;
    }


    void addCourse() {
        scores.add(new Score("Matematika", tipe, Ujian));
        scores.add(new Score("Indonesia", tipe, Ujian));
        scores.add(new Score("IPA", tipe, Ujian));
    }



    @Override
    void input(Scanner sc) {
//        scores.get(mapel,tipe,Ujian);
//        String  choose;
        int tugas=0;
        String mmapel = null;
        boolean ambil = true;
        String choose = null;

        Course course = new Course(mapel, tipe);
        course.view();
        while (ambil){
            System.out.println("!!!Enter all the grades of both exams and assignments!!!");
            System.out.printf("Please select one of the subjects below: ");
            mmapel = sc.next();
            if (mmapel.equalsIgnoreCase("Matematika")||mmapel.equalsIgnoreCase("Indonesia")||mmapel.equalsIgnoreCase("IPA")){
                ambil = false;
            }
        }

//        System.out.println("\n");

        boolean exam = true;
        while (exam) {
            System.out.print("[Exam/Task]: ");
            choose = sc.next(); // ujian //tugas
            if(choose.equalsIgnoreCase("Exam")||choose.equalsIgnoreCase("Task")){
                exam = false;
            }
        }

        if (choose.equalsIgnoreCase("Exam")) {
            do {
                System.out.printf("Input Exam score :");
                tugas = sc.nextInt();
            } while (tugas > 100 || tugas < 1);
        } else if (choose.equalsIgnoreCase("Task")) {
            do {
                System.out.printf("Input Task Score: ");
                tugas = sc.nextInt();
            }while (tugas >100 || tugas <1);
        }

        System.out.printf("would you like to rate again?[Y/N]: ");
        String pilih = sc.next();
        if (pilih.equalsIgnoreCase("Y")) {
            input(sc);
        } else if (pilih.equalsIgnoreCase("N")) {
//            scores.add(new Score(mapel, choose, tugas));
//            System.out.println("Dah selesai");
        }

        scores.add(new Score(mmapel, choose, tugas));
    }

    void viewBener() {

//        scores.get(new Score(mapel,choose,tugas);
//        scores.add(
//        Score score = new Score(null,null,0);

        System.out.println("==================================================================");
        System.out.println("===========================ALL VALUE==============================");
        System.out.println("==================================================================");
        int i = 1;
        for (Score score : scores) {
//            System.out.println("halo");
                System.out.println(i + ". Your Course is " + score.mapel + " Type " + score.tipe + " Your Score is " +score.Ujian);
                i++;
        }
    }


    void viewBener1() {
        System.out.println("==================================================================");
        System.out.println("==========================YOUR SCORE==============================");
        System.out.println("==================================================================");
        int i = 0;
        for (Score score : scores) {
//            System.out.println("halo");
            System.out.println(i+1 + ". Your Course is " + scores.get(i).mapel + " Type " + scores.get(i).tipe + " Your Score is " + scores.get(i).Ujian+"\n\n");
            i++;
        }
    }

    void Calculate(){
        Scanner scanner = new Scanner(System.in);
        int calcTu= 0;
        int calcEx = 0;
        System.out.printf("Input Exam-Task: ");

        int andrea = 1;

            do {
                String code = scanner.next();

                if (code.equals("Exam")) {
                    int j = 0;
                    for (Score sc : scores) {
                        if (scores.get(j).getTipe().equals("Exam")) {
                            j++;
                            calcEx += sc.getUjian();
                        } else {
                            j++;
                        }
                    }

                } else if (code.equals("Task")) {
                    int k = 0;
                    for (Score ac : scores) {
                        if (scores.get(k).getTipe().equals("Task")) {
                            k++;
                            calcTu += ac.getUjian();
                        } else {
                            k++;
                        }
                    }
                    andrea = -1;
                }

            } while (andrea == 1);


//        System.out.println("Tugasss:"+calcTu);
        hitungU(calcTu);
//        System.out.println("Exammmm:"+calcEx);
        hitungE(calcEx);
        hitungsemua(calcTu,calcEx);

    }

    public void hitungU(int U){
//        System.out.println("masuk tugas");
        int result = U;
        System.out.println("Total Task: "+result);
    }
    public void hitungE(int E){
//        System.out.println("masuk ujian");
        int result = E;
        System.out.println("Total Exam: "+result);
    }

    public double hitungsemua(int U, int E){
        double total = ((U*0.4)+(E*0.6))/3;
        System.out.println("UR Total Value: "+total);
        return total;
    }



}

