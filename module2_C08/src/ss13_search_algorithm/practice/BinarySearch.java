package ss13_search_algorithm.practice;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key, int left, int right) {
        int mid = (left + right) / 2;
        if (key == list[mid]) {
            return mid;
        }
        if (key > mid) {
           return binarySearch(list, key, mid + 1, right);
        }
        return binarySearch(list, key, left, mid - 1);
//        int low = 0;
//        int high = list.length - 1;
//        while (high >= low) {
//            int mid = (low + high) / 2;
//            if (key < list[mid])
//                high = mid - 1;
//            else if (key == list[mid])
//                return mid;
//            else
//                low = mid + 1;
//        }
//        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 59, 0, list.length));
    }
}
