
/*Problem Statement:
Given an integer array of length n, write a program to find the length of the longest contiguous subarray such that the elements in the subarray alternate between even and odd numbers.
The subarray must be contiguous.
Alternation can be even–odd–even–odd or odd–even–odd–even.
If no such alternating pair exists, the answer should be 1, since a single element is considered a valid subarray.*/


class Arr3 {
    public static void main(String[] args) {

        int a[]={10,12,14,7,8};
        int n=a.length;
        int count=1;
        
        for(int i=0;i<n-1;i++){

            if((a[i]%2==0  && a[i+1]%2!=0 )|| (a[i+1]%2==0 && a[i]%2!=0)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
} 