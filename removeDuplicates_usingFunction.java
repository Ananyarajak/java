public class removeDuplicates_usingFunction {
    public static int remove(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
       return j+1;
    }
    public static void main(String[]args){
        int nums[]={1,1,2,2,3,3,4,5,6,6};
        int k = remove(nums);
        System.out.println("count of unique element " + k);
        for(int i=0;i<k;i++){
            System.out.println(nums[i] + " ");
        }
    }
}
