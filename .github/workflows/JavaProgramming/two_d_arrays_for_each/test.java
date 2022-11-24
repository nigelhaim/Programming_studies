package two_d_arrays_for_each;

class test implements Runnable{
    void run(){
        System.out.print("go ");
    }
    public static void main(String[] args) {
        test t2 = new test();
        Thread t = new Thread(t2);
        t.start();
        System.out.println();
    }
}
