import java.util.*;
public class rock{
    public static void largest(int arr[]){
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            if(curr>fmax){
                tmax=smax;
                smax=fmax;
                fmax=arr[i];
            }
            else if(curr>smax && curr!=fmax){
                smax=arr[i];code -v

            }
        }
        System.out.print(smax);
    }
    public static void main(String args[]){
        int arr[]={5,3,8,6,4,10};
        largest(arr);
    }
}