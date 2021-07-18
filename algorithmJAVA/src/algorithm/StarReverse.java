package algorithm;

public class StarReverse {
    public static void main(String[] args) {

        for(int i=0; i <= 3; i++){
            for(int j=6; j>0;j--){
                if(j>i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
