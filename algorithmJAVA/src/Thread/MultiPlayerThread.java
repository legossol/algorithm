package Thread;
class MovieThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("동영상 재생");
        }
        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MusicThread extends  Thread{
    public void run(){
        for(int i =0; i<3; i++){
            System.out.println("음악 재생");
        }
        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class MultiPlayerThread {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new MusicThread();
        thread2.start();
    }
}
