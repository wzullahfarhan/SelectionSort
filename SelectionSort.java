import java.util.Scanner;
public class SelectionSort {
    public static void ShowArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        //array input
        System.out.print("Enput "+a+" Elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        ShowArray(arr);
        //Selection Sort
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){ 
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        //Sorted Array Called
        ShowArray(arr);
    }
}
