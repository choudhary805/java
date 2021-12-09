import java.util.Scanner;
public class prastise {
    public static void main(String[] args) {
        System.out.println("abhi");
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        int n=6;
        System.out.println("Enter number of Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("input is complete sorted array is");
        for(int i=0;i<n;i++)
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
