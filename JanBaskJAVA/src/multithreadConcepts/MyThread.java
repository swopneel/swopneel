package multithreadConcepts;

public class MyThread implements Runnable{

    public void run(){

        //task for threads

        for (int i = 1; i <= 10; i ++){
            System.out.println("value of I: " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        //create object of MyThread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);

        thr.start();
        
    }
    
}
