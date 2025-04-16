class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(check.contains(nums[i])){
                return true;
            }
            if(!check.contains(nums[i])){
                check.add(nums[i]);
            }
            
        }
        return false;
    }
}