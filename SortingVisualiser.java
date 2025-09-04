import java.util.Arrays;
import java.util.Scanner;

public class SortingVisualiser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        while(true){
            System.out.println("\nMenu :");
            System.out.println("1.Bubble sort");
            System.out.println("2.Selection sort");
            System.out.println("3.Insertion sort");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            int choice=in.nextInt();

            if(choice==0){
                System.out.println("Exiting....");
                break;
            }

            System.out.println("Enter the length of array: ");
            int n= in.nextInt();
            int [] array=new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i]= in.nextInt();
            }
            switch (choice){
                case 1:
                    bubbleSort(array);
                break;
                case 2:
                    selectionSort(array);
                break;
                case 3:
                    insertionSort(array);
                break;
                case 0:
                    return ;
                
            }
        }
    }



    static void bubbleSort(int [] arr){
        boolean swapped=false;
        int swap_count=0;
        int comparison_count=0;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                comparison_count++;
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                     swap_count++;
                     swapped=true;
                    System.out.print("Swap Count: "+swap_count+"    "+Arrays.toString(arr));
                }
                System.out.println();
            }
            if(!swapped)
                break;
        }
        System.out.println("\nTotal swaps done :"+swap_count);
        System.out.println("\nTotal comparisons made: "+comparison_count);
    }

    public static void selectionSort(int[] array) {
        int swap_count = 0;
        int comparison_count = 0;

        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int[] result = Max(array, 0, last); // result[0] = maxIndex, result[1] = comparisons
            int maxIndex = result[0];
            comparison_count += result[1];

            if (maxIndex != last) {
                swap(array, maxIndex, last);
                swap_count++;
                System.out.print("Swap Count: " + swap_count + "    " + Arrays.toString(array));
                System.out.println();
            }
        }

        System.out.println("\nTotal swaps done: " + swap_count);
        System.out.println("\nTotal comparisons made: " + comparison_count);
    }
    public static int[] Max(int []arr,int start,int end){
        int max=start;
        int comparisons = 0;
        for (int i = start+1; i <=end ; i++) {
            comparisons++;

            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return new int[]{max,comparisons};
    }
    public static void insertionSort(int[] array) {
        int swap_count = 0;
        int comparison_count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                comparison_count+=1;
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                    swap_count+=1;
                    System.out.print("Swap Count: " + swap_count + "    " + Arrays.toString(array));
                    System.out.println();
                }
                else{
                    break;
                }
            }
        }
        System.out.println("\nTotal swaps done: " + swap_count);
        System.out.println("\nTotal comparisons made: " + comparison_count);
    }

    public static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
