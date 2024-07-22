class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<n-1;i++){
                if(heights[i]<heights[i+1]){
                int temp=heights[i];
                heights[i]=heights[i+1];
                heights[i+1]=temp;

                String s=names[i];
                names[i]=names[i+1];
                names[i+1]=s;
                }
            }
        }
    

        return names;
    }
}
