package Thread;

public class ThreadSample extends Thread{
    public void run(){
        System.out.println("knklwenkflnkw");
    }
}
class RunThread{
    public static void main(String[] args) {
        RunThread threads = new RunThread();
        threads.runBasic();
    }
    public void runBasic(){
        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("쓰레드 런");
    }

}