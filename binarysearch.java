public class binarysearch{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.print("target is at ");
        System.out.print(bs(arr,target));
    }
    public static int bs(int arr[],int target){
        int start = 0; 
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end)/2;
            if(arr[mid]==target){
                return mid;
            }

            else if(target>arr[mid]){
                start = mid +1;
            }

            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}