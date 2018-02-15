package firstproject;

/*
Recursive Binary Search
 */
/**
 *
 * @author krithika
 */
public class BinarySearch {

    /* Recursive Method implementing Binary Search algorithm 
       * Returns -1 if element not found
       * Returns index of element in inputArray if element is found
     */
    public int binarysearch(int[] inputArray, int start, int end, int element) {

        if (end >= start) {
            int mid = (start + end) / 2;
            //If element is found in the middle
            if (inputArray[mid] == element) {
                return mid;
            } else if (element > inputArray[mid]) {
                //If element is greater than the integer in the middle then restrict search to right subarray
                return binarysearch(inputArray, mid + 1, end, element);
            }
            //If element is less than the integer in the middle then restrict search to left subarray
            return binarysearch(inputArray, start, mid - 1, element);
        }

        return -1;
    }

    public static void main(String[] args) {

        // Input Array
        int[] inputArray = {2, 4, 8, 10, 17, 20, 41, 65, 81};

        // Element to be found
        int element = 41;

        //Creating object to access non-static method binary search
        BinarySearch binsearch = new BinarySearch();

        //Calling binary search method
        int output = binsearch.binarysearch(inputArray, 0, inputArray.length - 1, element);

        //Printing output
        if (output == -1) {
            System.out.println("Element not found");
        } else {
            output++;
            System.out.println("Element " + element + " has been found at the " + output + "th position");
        }

    }

}
