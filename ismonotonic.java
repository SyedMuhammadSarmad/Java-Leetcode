public class ismonotonic {
        public static void main(String args[]){
            int nums[] = {2,3,4,1};
            System.out.print(isMonotonic(nums));
        }
        public static boolean isMonotonic(int[] nums) {
            if(isdec(nums) || isinc(nums)){
                return true;
            }
            return false;
        }
    
        public static boolean isdec(int nums[]){
            for(int i =0 ; i<=nums.length-2 ;i++){
                if(nums[i+1]-nums[i]>0){ //4,3,2,5
                    return false; //array is increasing
                }
            }
            return true;
        }
        public static boolean isinc(int nums[]){
            for(int i=0;i<=nums.length-2;i++){
                if(nums[i]-nums[i+1]>0){ //2,3,4,2
                    return false;//arry is decreasing
                }
            }
            return true;
        }
    
    }

