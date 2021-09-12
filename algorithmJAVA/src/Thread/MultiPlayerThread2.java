package Thread;
class EachPlayer extends Thread{
    public void run(){
        movieRunning();
        musicRunning();
    }
    public void movieRunning(){
        for(int i=0; i<3; i++){
            System.out.println("동영상 재생");
        }
        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void musicRunning(){
        for(int i=0; i<3; i++){
            System.out.println("음악 재생");
        }
        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class MultiPlayerThread2 {
    public static void main(String[] args) {
        EachPlayer eachPlayer = new EachPlayer();
        try{
            new Thread(eachPlayer, "A 쓰레드").start();
            new Thread(eachPlayer, "B 쓰레드").start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
