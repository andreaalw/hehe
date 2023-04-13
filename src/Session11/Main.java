package Session11;

import java.util.Scanner;

public class Main implements Runnable{

    public static void main(String[] args) {

//        BST<String>bst = new BST<>();
//        bst.push("Alenjlk");
//        bst.push("Worororo");
//        bst.push("antoo");
//        bst.push("hahaahah");
//        bst.push("vivi");
//        bst.push("Tinatun");
//        bst.viewTree();
//        BST<Integer> numbers = new BST<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.push((int)(Math.random()*1000));
//        }
//        numbers.viewTree();
        new Main();
    }
    public Main(){
        Thread th = new Thread(this); //minta nya runable jadi pake nya this.
        Thread th1 = new Thread(this);
        //thread gaakan jalan kalo ga dijalanin.
        th.start();
        th1.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        th.interrupt();
        sc.nextLine();
        th1.interrupt();
    }

    @Override
    public void run() {
        int id = (int)(Math.random()*1000);
        int a = 0;
        while (true){
            System.out.println(id+ " Loop "+a++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //kalo dia error ga ngethrow apapun
            }
            if(Thread.currentThread().isInterrupted()){
                return; //kalo misal dia di interupsi
                //langsung break
            }
        }
    }
}

//T adalah tipe data yang mau kita pake, jadi semacam variabel
//Diganti jadi E boleh ga, boleh boleh aja.
class BST<T>{
    class Node{
//        T disini ngerefrence ke atas yang BST<T>
        int key;
        T data; //sebaiknya jangan default, tapi dalam kasusu ini supaya mempermudah kita pake default
        Node left, right;
        public Node(int key, T data){
            this.key = key;
            this.data = data;
            this.left = this.right = null;
            //ini dihapus this nya jg gapapa tapi cm yang buat left dan right
            //yang data jangan
        }
    }

    private Node root = null;
//    public BST(){
//        root = null;
//    }

    private Node push(Node curr,int key,T data){
        //ini cm bisa dipake di internal nya ida, di class itu
        //sendiri
        if( curr == null){
            return new Node(key,data);
        }else{
            if(key < curr.key){//yang kita cek adalah key nya
                curr.left = push(curr.left, key, data);
            }else{
                curr.right = push(curr.right, key, data);
            }
            return curr;
        }
    }

    public void push(T data){
        //key nya kita random
        root = push(root,(int)(Math.random()*1000),data); //push yang ini mengarah ke private
    }

    private void viewTree(Node curr, int level){
        if(curr !=null){
            viewTree(curr.right, level+1);
            for (int i = 0; i < level; i++) System.out.print("    ");
            System.out.println(curr.key + " " + curr.data);
            viewTree(curr.left, level+1);
        }
    }
    //mau dipanggil diluar gapake parameter
    public void viewTree(){
        viewTree(root, 0);
    }

}
