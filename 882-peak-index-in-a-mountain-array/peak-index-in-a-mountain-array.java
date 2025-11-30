class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Peak is in the right half
                left = mid + 1;
            } else {
                // Peak is in the left half or at mid
                right = mid;
            }
        }

        // left == right pointing to peak index
        return left;
    }
}
