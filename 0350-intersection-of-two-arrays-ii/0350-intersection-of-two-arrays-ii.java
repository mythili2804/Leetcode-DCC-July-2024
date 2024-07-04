class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Count occurrences of each element in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // For each element in nums2, check if it exists in the map
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
               map.put(num, map.get(num) - 1); 
            }
        }
        
        // Convert the result list to an array
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        
        return res;
    }
}

