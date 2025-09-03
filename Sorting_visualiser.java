import java.util.Arrays;
import java.util.Scanner;

public class Sorting_visualiser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1.Bubble sort");
        System.out.println("2.Selection sort");
        System.out.println("3.Insertion sort");
        System.out.println("0.Exit");
        System.out.println("Enter your choice:");
        int choice=in.nextInt();
        while(choice!=0){
            System.out.println("Enter the length of array: ");
            int n= in.nextInt();
            int [] array=new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i]= in.nextInt();
            }
            switch (choice){
                case 1:BubbleSort(array);
                break;
                case 2:SelectionSort(array);
                break;
                case 3:InsertionSort(array);
                break;
                case 0:
                    return ;
                
            }
            System.out.println("Do you want to perform more sorting ,if enter your choice ,or enter 0");
            choice=in.nextInt();
        }

        

    }

    private static void InsertionSort(int[] array) {
    }

    static void BubbleSort(int [] arr){
        boolean swapped=false;
        int swap_count=0;
        int comparison_count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    comparison_count++;
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
        System.out.println("Total swaps done :"+swap_count);
        System.out.println("Total comparisons made: "+comparison_count);
    }

    public static void SelectionSort(int[] array) {
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

        System.out.println("Total swaps done: " + swap_count);
        System.out.println("Total comparisons made: " + comparison_count);
    }
    public static int[] Max(int []arr,int start,int end){
        int max=start;
        int comparisons = 0;
        for (int i = start; i <=end ; i++) {
            comparisons++;

            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return new int[]{max,comparisons};
    }

    public static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
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
