public class BinarySearch {

    // Recursive method to perform binary search
    public static int binarySearch(int[] array, int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is smaller, search left subarray
            if (array[mid] > target) {
                return binarySearch(array, start, mid - 1, target);
            }

            // Else, search right subarray
            return binarySearch(array, mid + 1, end, target);
        }

        // Target is not present
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
