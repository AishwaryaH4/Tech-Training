
// Max Heap

public class maxHeap {
    static void heapify(int arr[],int n,int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]>arr[largest])
            largest = l;
        if(r<n && arr[r]>arr[largest])
            largest = r;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,4,7,9,2};
        int n=arr.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(arr,n,i);
        }
        System.out.print("Max heap: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
