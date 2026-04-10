class Solution {
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
         int n = arr.length;
         
         for(int i=n/2 - 1;i>=0;i--){
             heapify(arr,n,i);
         }
         
         for(int i=n-1;i>=0;i--){
             int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;
             heapify(arr,i,0);
         }
    }
    
    void heapify(int[] a,int n,int i){
        int largest = i;
        int li = 2*i + 1;
        int ri = 2*i + 2;
        
        if(li<n && a[li]>a[largest]){
            largest = li;
        }
        if(ri<n && a[ri]>a[largest]){
            largest = ri;
        }
        
        if(largest!=i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a,n,largest);
        }
        
    }
    
}





