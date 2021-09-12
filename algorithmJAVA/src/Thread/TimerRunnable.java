package Thread;


import java.util.Date;

public class TimerRunnable implements Runnable{
    @Override
    public void run() {
        printCurrntTime();
    }
    public void printCurrntTime(){
        int count = 0;
        while(count <10){
            count++;
            try{
                Thread.sleep(1000);
                Date currentTime = new Date();
                System.out.println(currentTime.toString()+ " "+ System.currentTimeMillis());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class stThread{
    public static void main(String[] args) {
//        TimerRunnable tR = new TimerRunnable();
//        tR.printCurrntTime();
        new TimerRunnable().run();
    }
}
