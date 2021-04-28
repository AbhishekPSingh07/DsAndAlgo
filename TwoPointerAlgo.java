package algortithms;

import java.util.Arrays;

public class TwoPointerAlgo {
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        
        Arrays.sort(arr);
        for(int i = 0;i <n-2;i++){
            if(twoSum(arr,-arr[i],i+1)){
                return true;
            }
            
        }return false;
        
            }
	
	// finding sum of two numbers which is equal to a third no. x by using two pointer algorithm
	public boolean twoSum(int a[],int x,int i){
	    int j = a.length -1;
	    while(i < j){
	        if(a[i]  +a[j]  < x){
	            i++;
	        }else if(a[i]+ a[j] > x){
	            j--;
	        }else{
	            return true;
	        }
	    }
	    return false;
	}

	public static void main(String[]args) {
		
		int arr[] = {2,4,-1,3,-4,0,3};
		// for a two pointer algorithm the array should be sorted
		Arrays.sort(arr);
		
	}

}
