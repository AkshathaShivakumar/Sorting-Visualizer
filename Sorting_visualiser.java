import java.util.Arrays;
import java.util.Scanner;

public class Sorting_visualiser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n= in.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i]= in.nextInt();
        }
        System.out.print("Unsorted array :");

    }
    static void BubbleSort(int [] arr){
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                     arr[j-1]=temp;
                     swapped=true;
                    System.out.print(Arrays.toString(arr));
                }
            }
            if(!swapped)
                break;
        }
    }
}
