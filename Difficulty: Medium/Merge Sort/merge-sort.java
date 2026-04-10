class Solution {
    
    int[] a;
    int[] tempa;
    int length;

    void mergeSort(int arr[], int l, int r) {
        this.a = arr;
        this.length = arr.length;
        this.tempa = new int[arr.length];
        divide(l,r);
    }
    
     void divide(int start,int end){
        if(start<end){
            int mid = (start+end)>>>1;
            
            divide(start,mid);
            divide(mid+1,end);
            
            merge(start,mid,end);
            
        }
    }
        
         void merge(int start,int mid,int end){
            for(int i=start;i<=end;i++){
                tempa[i] = a[i];
            }
            
            int i = start;
            int j = mid+1;
            int k =start;
            
            while(i<=mid && j<=end){
                if(tempa[i]<tempa[j]){
                    a[k] = tempa[i];
                    i++;
                }else{
                    a[k] = tempa[j];
                    j++;
                }
                k++;
            }
            while(i<=mid){
                    a[k] = tempa[i];
                    i++;
                    k++;
                }
            
        }
}













