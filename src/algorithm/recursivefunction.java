package algorithm;
class sum{
    public static int getSum(int n){
        if(n == 1 ){
            return 1;
        }
        return n + getSum(n -1);
    }
}
public class recursivefunction{
    public static void main(String[] args) {
        int i = sum.getSum(10);
        System.out.println(i);
    }
}
