package algorithm.ARRAY;

public class SelectionSort {
    static void swap(int array[], int index1, int index2){
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }
    static void printValue(int arr[]){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]).append(" ");
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        int arr[] = {5,3,7,2,1,6,9,10};
            for (int i = 0; i < arr.length; i++) {
                int MIN = i;
                int MinValue = arr[MIN];
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < MinValue) {
                        MinValue = arr[j];
                        MIN = j;
                    }
                }
                swap(arr, i, MIN);
            }
            printValue(arr);
        }
    }
