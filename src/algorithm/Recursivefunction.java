package algorithm;
class sum {
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }
}
class gugu{
    public static void rcGugudan(int n){
        if(n==0){
            System.out.println("Done");
        }else{
            System.out.printf("2 x %d = %d",n,2*n);
            System.out.println();
            gugu.rcGugudan(n-1);
        }

    }
}

public class Recursivefunction{
    public static void main(String[] args) {
        int i = sum.getSum(10);
        System.out.println(i);
        gugu.rcGugudan(9);
    }
}
