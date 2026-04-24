
// Find Maximum Element in every sub array of size k

import java.util.*;

public class MaxSlidingWindow1 {
    public static void main(String[] args){
        int[] nums={1,3,-1,3,5,-3,6,7};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(i>=k){
                pq.remove(nums[i-k]);
            }
        }
        if(k>=k-1){
            System.out.println(pq.peek()+"");
        }
    }
    
}
