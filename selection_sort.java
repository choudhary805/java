import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("abhi");
        int n=6,a=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    while(a<n){
        int min=arr[a],min_index=a;
    for(int i=a+1;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
            min_index=i;
        }
        int temp=arr[0];
        arr[0]=min;
        arr[min_index]=temp;
    }}a++;
    System.out.println("Sorted array is : ");
    for(int i=0;i<n;i++)
        System.out.println(arr[i]);
}}

