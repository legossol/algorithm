package Thread;

class RamenThreadCook extends Thread{
    private int leftRamen;
    private String[] storeBunner = {" _ "," _ "," _ "};

    public RamenThreadCook(int count){
        leftRamen = count;
    }
    public void run(){
        while(leftRamen > 0){
            synchronized (this){
                leftRamen--;
                System.out.println(currentThread().getName() + ":" + leftRamen + "개 남음");
            }
            for(int i =0; i <storeBunner.length; i++) {
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
            try{
                sleep(Math.round(1000*Math.random()));
            }catch(Exception e){
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

    public class RamenThread{
    public static void main(String[] args) {
        try{
            RamenThreadCook ramenThreadCook = new RamenThreadCook(10);
            new Thread(ramenThreadCook, "A").start();
            new Thread(ramenThreadCook, "B").start();
            new Thread(ramenThreadCook, "C").start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}


