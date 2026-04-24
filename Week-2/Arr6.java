import java.util.Arrays;

public class Arr6 {
    public static void main(String[] args) {
        int[] a = {1,2,0,0,3};

        int count = 0;

        // count  non  zeros
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                count++;
        }
        for(int i=0;i<count;i++){
            if(a[i]==0){
                for(int j=i;j<a.length;j++){        
                    if(a[j]!=0){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(a));      // [0, 0, 0, 1, 1, 1]
    }
    
}
