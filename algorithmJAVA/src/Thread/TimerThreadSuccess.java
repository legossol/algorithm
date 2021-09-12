package Thread;

import java.util.Date;

public class TimerThreadSuccess extends Thread{
    public void run(){
        int ZERO = 0;
        while(ZERO <10){
            ZERO++;
            try{
                sleep(1000);
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime)+" "+currentTime);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
//        printCurrnetTime();
    }
//    public void printCurrnetTime(){
//        int ZERO = 0;
//        while(ZERO <10){
//            ZERO++;
//            try{
//                sleep(1000);
//                long currentTime = System.currentTimeMillis();
//                System.out.println(new Date(currentTime)+" "+currentTime);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }

}
class TimersMain {
    public static void main(String[] args) {
        TimerThreadSuccess timerThreadSuccess = new TimerThreadSuccess();
        timerThreadSuccess.start();

    }
}
