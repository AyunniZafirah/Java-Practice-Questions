/* 6 December 2025
Question: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
.
*/





class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap
        //key = element, values = index

        //in the hashmap,loop and find the complement
        //if complement found in the map, return the index of current element and its complement
        //otherwise, put the current element inside map
        HashMap<Integer, Integer> pair = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (pair.containsKey(complement)){
                return new int [] {i,pair.get(complement)};
            }
            pair.put(nums[i], i);
        }
        
        return new int[] {};
    }
}