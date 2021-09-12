package singleTon;

public class SingleTonRamenCook extends Thread {
    private int leftRamen;
    private final String[] storeBunner = {" _ ", " _ ", " _ "};
    private static SingleTonRamenCook singleTonRamenCook = null;
    private SingleTonRamenCook(){
        System.out.println("라면 객체 생성");
    }
    public static SingleTonRamenCook singleTonRamenCook(int count){
        if(singleTonRamenCook == null){
            singleTonRamenCook = new SingleTonRamenCook();
        }return singleTonRamenCook;
    }
    public void makeRamen(int count) {
        leftRamen = count;
    }

    public void run() {
        while (leftRamen > 0) {
            synchronized (this) {
                leftRamen--;
                System.out.println(currentThread().getName() + ":" + leftRamen + "개 남음");
            }
            for (int i = 0; i < storeBunner.length; i++) {
                if (!storeBunner[i].equals(" _ ")) continue;
                synchronized (this) {
                    storeBunner[i] = currentThread().getName();
                    System.out.println(
                            "            "
                                    + Thread.currentThread().getName()
                                    + ": [" + (i + 1) + "]번 버너 on");
                    //버너의 상태 출력
                    showBurner();

                }
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (this) {
                    storeBunner[i] = " _ ";
                    System.out.println(
                            "                               "
                                    + Thread.currentThread().getName()
                                    + ": [" + (i + 1) + "]번 버너 OFF");
                    showBurner();

                    break;
                }
            }
            try {
                sleep(Math.round(1000 * Math.random()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void showBurner() {
        String stringToPrint = "                                                 ";
        for (int i = 0; i < storeBunner.length; i++) {
            stringToPrint += ("  " + storeBunner[i]);
        }
        System.out.println(stringToPrint);
    }
}

class SingleRamen {
    public static void main(String[] args) {

        try {

            new Thread(SingleTonRamenCook.singleTonRamenCook(5), "A 라면");
            new Thread(SingleTonRamenCook.singleTonRamenCook(5), "B 라면");
            new Thread(SingleTonRamenCook.singleTonRamenCook(5), "C 라면");
            new Thread(SingleTonRamenCook.singleTonRamenCook(5), "D 라면");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}



