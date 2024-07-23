
class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        
        Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);

       
        Arrays.sort(numsArray, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqA - freqB; 
            } else {
                return b - a; 
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsArray[i];
        }

        return nums;
    }
}
