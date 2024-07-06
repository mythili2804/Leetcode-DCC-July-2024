class Solution {
    public int passThePillow(int n, int time) {
        if (n == 1) {
            return 1;
        }

        int position = 1;  // Starting position
        boolean forward = true;  // Direction of passing

        for (int i = 0; i < time; i++) {
            if (forward) {
                position++;
                if (position == n) {
                    forward = false;  // Change direction to reverse
                }
            } else {
                position--;
                if (position == 1) {
                    forward = true;  // Change direction to forward
                }
            }
        }

        return position;
    }
}
