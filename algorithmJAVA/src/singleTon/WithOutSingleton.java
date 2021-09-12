package singleTon;

public class WithOutSingleton extends Thread{
    public WithOutSingleton(){
        System.out.println("::::::::::1객체생성?!?!");
    }


    public void print(String input) {
        System.out.println(input);
    }
    public void run(){
        for(int i = 0; i < 30; i++) {
            System.out.println(currentThread().getName());
            print("hihi");
        }
    }
}
class single {
    public static void main(String[] args) {
        try {
            new Thread(new WithOutSingleton(), "AThread").start();
            new Thread(new WithOutSingleton(),  "Bthread").start();
            new Thread(new WithOutSingleton(),  "Cthread").start();
            new Thread(new WithOutSingleton(),  "Dthread").start();
            new Thread(new WithOutSingleton(), "Ethread").start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
