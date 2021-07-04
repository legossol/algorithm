package hashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtablePractice {
    public static void main(String[] args) throws InterruptedException{
        Map<String,Integer> ht1 = new Hashtable<>();
        ht1.put("key1",1);
        ht1.put("key2",2);
        ht1.put("key3",3);
        System.out.println(ht1);
        System.out.println(ht1.get("key1"));

        ht1.put("key1",20);
        System.out.println(ht1.get("key1"));

        for(String key: ht1.keySet()){
            System.out.println("{키순회 :+" +key+","+ht1.get(key)+"}");
        }

        Map<String, Integer> ht2 = new Hashtable<>();
        ht2.put("plusKey1",100);
        ht2.put("plusKey2",200);
        ht1.putAll(ht2);
        System.out.println(ht1);

        System.out.println("===thread Test Start===");
        Runnable runnable = new Thread(){
            @Override
            public void run(){
                ht1.forEach((key,value)->{
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("{" +key +","+ value + "}");
                });
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        ht1.put("threadPlus",7777);
        System.out.println("thread End");

        System.out.println("====If i was used Hashmap====");
        //해쉬맵을 사용해서 쓰레드를 구성하면 아래와같이 쓰레드가 forEach를 수행하던 중 put으로 데이터를 집어넣으면서
        //ConcurrentModificationException에러를 뱉게된다.
        //이처럼 hashmap은 단일 쓰레드에서만 사용하는게 좋으면 멀티 쓰레드를 사용하려면 hashTable을 지향해야 한다.
        Map<String,Integer> hm = new HashMap<>();
        Runnable runnable1 = new Thread() {
            @Override
            public void run() {
                hm.put("hmT1", 99);
                hm.put("hmT2", 00);
                hm.forEach((key, value) -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("{" + key + "," + value + "}");
                });

            }
        };
        Thread thread2 = new Thread(runnable1);
        thread2.start();
        thread2.sleep(1000);
        hm.put("endKey",1010);
        System.out.println("hashmapThread End");

    }
}
