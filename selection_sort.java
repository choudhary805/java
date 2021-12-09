import java.util.Scanner;
public class selection_sort {
    void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    void print(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("Enter array elements :");
        for(int i=0;i<6;i++) {
            arr[i]=sc.nextInt();
        }
        selection_sort ob = new selection_sort();
        ob.print(arr);
        ob.sort(arr);
        ob.print(arr);
}}

