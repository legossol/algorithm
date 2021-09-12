package singleTon;

public class Printer extends Thread{
    private static Printer printer = null;

    private Printer(){
        System.out.println("싱글톤 하나가 만들어졌습니다.");
    }//기본 생성자를 private로 하여 생성이 불가능하게 만듬

    public static Printer getInstance() {//오직 getInstance를 통해서만 가능
        if(printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public void print(String input) {
        System.out.println(input);
    }
    public void run(){
        for(int i = 0; i < 10; i++) {

            System.out.println(currentThread().getName());
            print("hihi");
        }
    }
}
class StartPrinter{
    public static void main(String[] args) {
        try {
            new Thread(Printer.getInstance(), "Athread").start();
            new Thread(Printer.getInstance(), "Bthread").start();
            new Thread(Printer.getInstance(), "Cthread").start();
            new Thread(Printer.getInstance(), "Dthread").start();
            new Thread(Printer.getInstance(), "Ethread").start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}