class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag=false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                flag=true;
                break;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return flag;
    }
}