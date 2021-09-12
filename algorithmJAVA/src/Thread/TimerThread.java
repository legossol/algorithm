package Thread;

import java.util.Date;
import java.util.Timer;

public class TimerThread extends Thread{
    public void run(){
        TimerThread timerThread = new TimerThread();

        timerThread.printCurrnetTime();
    }

    public void printCurrnetTime(){
        int MAX = 10;
        Date currentTime = new Date();
        int ZERO = 0;

        try{
            while(true){
                for(int i =0; i < MAX; i++) {
                    Thread.sleep(1000);
                    System.out.println(currentTime.toString() + System.currentTimeMillis());
                }
                break;
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
//        for(int i=0; i < MAX; i++) {
//            System.out.print(currentTime.toString());
//            System.out.println(System.currentTimeMillis());
//
//        }
    }
}
class TimerMain{
    public static void main(String[] args) {
        TimerMain timerMain =new TimerMain();
        timerMain.letsRun();
//        TimerThread timerThread =new TimerThread();
//        timerThread.start();
    }
    public void letsRun(){
        TimerThread timerThread =new TimerThread();
        timerThread.start();

    }
}
//class RunnerThread{
//    public static void main(String[] args) {
//        RunnerThread runnerThread = new RunnerThread();
//        runnerThread.letsStart();
//    }
//    public void letsStart(){
//        TimerThread timerThread =new TimerThread();
//        timerThread.start();
//
//
//    }
//}
