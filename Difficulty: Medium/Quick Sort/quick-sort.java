class Solution {
    public void quickSort(int[] arr, int low, int high) {

        int loc = partition(arr,low,high);
        
        if(low<loc-1){
            quickSort(arr,low,loc-1);
        }
        
        if(high>loc){
            quickSort(arr,loc,high);
        }

    }

    private int partition(int[] arr, int low, int high) {
        
        int pivot = arr[(low+high)>>>1];
        
        while(low<=high){
            
            while(pivot>arr[low]){
                low++;
            }
            
            while(pivot<arr[high]){
                high--;
            }
            
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
        
    }
}