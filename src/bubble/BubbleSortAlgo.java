package bubble;
import java.util.Scanner;
public class BubbleSortAlgo {
    public static int[] bubbleSort(int arr[]){
        /* no. of times the array will be sorted
            last element will be the biggest
            in every round
         */
        for(int i =0; i<arr.length-1; i++){
            for(int j= 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int  i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        arr = bubbleSort(arr);
        for(int  i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
