package exception;

public class TryCatchArithmetic {
    public static void main(String args[]) {
        int number = 100;
        int result = 0;

        for(int i=0; i<10; i++){
//            result = number / (int)(Math.random() *10); // line 7
//            System.out.println(result);
            try {
                result = number / (int)(Math.random() *10); // line 7
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println("0");
            }
        }
    }
}
