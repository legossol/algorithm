package Thread;

public class MyThread extends Thread{
    public MyThread(String threadName){
        super(threadName);
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(this.getName()+":"+i);
        }
        System.out.println();
    }
}
class SecondThread implements Runnable{
    private String threadName;
    public SecondThread(String threadName){
        this.threadName=threadName;
    }
    public void run(){
        for(int i=0; i<100;i++){
            System.out.println(threadName+":"+i);
        }
    }
}
class oneByoneThread implements Runnable{
    private String threadName;
    public oneByoneThread(String threadName){
        this.threadName=threadName;
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(threadName+":"+i);
        }
    }
}
class ThreadRun{
    public static void main(String[] args) {
        System.out.println("쓰레드 테스트 시작");
        for(int i=1;i<=3;i++){
            new MyThread("Thread"+i).start();
        }
        System.out.println("테스트 종료");
   }
}

class ThreadRun2{
    public static void main(String[] args) {
        System.out.println("쓰레드2 테스트 시작");
        for(int i=1;i<=3;i++){
            Thread thread = new Thread(new SecondThread("Thread"+i));
            thread.start();

        }
        System.out.println("테스트 종료");
    }
}
class ThreadRun3{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("쓰레드3 테스트 시작");
        Thread[] thread=new Thread[4];
        for(int i =1;i<=3;i++){
            thread[i]=new Thread(new oneByoneThread("Thread"+i));
            thread[i].start();
            thread[i].join();
        }
        System.out.println("순차 쓰레드 종료");
    }
}
class ThreadRun4{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("쓰레드4 테스트 시작");
        Thread[] thread=new Thread[4];
        for(int i =1;i<=3;i++){
            thread[i]=new Thread(new oneByoneThread("Thread"+i));
            thread[i].start();
        }
        for(int i=1;i<=3;i++) {
            thread[i].join();
            System.out.println("쓰레드 종료");
        }
    }
}