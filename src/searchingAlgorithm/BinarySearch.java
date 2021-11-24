package searchingAlgorithm;

public class BinarySearch {
    static int[] intergers = {1, 2, 4, 6, 7, 55, 57};

    static int binarySearch(int[] intergers, int key) {
        int first = 0;
        int last = intergers.length - 1;
            while (last >= first) {
                int mid = (last + first) / 2;
                if (key < intergers[mid]) {
                    last = mid - 1;
                } else if (key == intergers[mid]) {
                    return mid;
                } else first = mid + 1;
            }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(intergers,2));
        System.out.println(binarySearch(intergers,3));
        System.out.println(binarySearch(intergers,7));
        System.out.println(binarySearch(intergers,1));
        System.out.println(binarySearch(intergers,9));
    }
}
