import java.util.*;
public class All_Unique_triplet {
    public static void main(String[] args) {
     int[] arr={0,-1,2,-3,1};
     Arrays.sort(arr);
     int n=arr.length;
     findTriplet(arr,n);
    }


    public static void findTriplet(int[]arr,int n){
        boolean find=false;
        for (int i = 0; i < n-2; i++) {
            for(int j=0;j<n-1;j++){
                for(int k=0;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        find=true;
                    }
                }

            }
        }
        if(find==false){
            System.out.println("not exist");
        }
    }
}
