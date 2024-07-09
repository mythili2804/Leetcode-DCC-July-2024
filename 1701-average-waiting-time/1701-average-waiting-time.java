class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int t=-1;
        double wait=0;
        for(int a[]:customers){
            t=(t<a[0])?a[0]:t;
            t+=a[1];
            wait+=t-a[0];
        }
        return wait/customers.length;
    }
}
