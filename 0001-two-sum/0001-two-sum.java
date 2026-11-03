class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        // [2,7,11,15]
        for (int i = 0; i < nums.length; i++) {
            // 取得另一值得方式，是用目標值去減遍歷出來的那個值i
            // [7,2,-2,-6]
            int anotherNumber = target - nums[i];
            // [2,7][7,2][11,-2][15,-6]
            if (map.containsKey(anotherNumber)) {
                return new int[]{map.get(anotherNumber), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}