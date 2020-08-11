// Algorithm
// Declare and initialize an array.
// Declare another array with the same size of array. It is used to store the frequencies of elements present in the array.
// Variable visited will be initialized with the value -1. It is required to mark an element visited that is, it helps us to avoid counting the same element again.
// The frequency of an element can be counted using two loops. One loop will be used to select an element from an array, and another loop will be used to compare the selected element with the rest of the array.
// Initialize count to 1 in the first loop to maintain a count of each element. Increment its value by 1 if a duplicate element is found in the second loop. Since we have counted this element and didn't want to count it again. Mark this element as visited by setting frequency[j] = found. Store count of each element to frequency.
// Finally, print out the element along with its frequency.

import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ask user for number of length
		System.out.println("Enter length of number to find the Frequency: ");
		int numberLength = sc.nextInt();

		// initialize an array
		int arr[] = new int[numberLength];

		System.out.println("Enter " + numberLength + " numbers to find the Frequency: ");
		
		// add number into the arr
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		// store frequency of the number
		int[] frequency = new int[arr.length];

		int found = -1;
		for (int i=0; i<arr.length; i++) {
			int count = 1;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					frequency[j] = found;
				}
			}
			if(frequency[i] != found)
                frequency[i] = count;
		}

		// print and displayy the frequency of each element present in arr list
        System.out.println("_____________________");
        System.out.println(" Number | Frequency");  
        System.out.println("_____________________");
        for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != found)  
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);  
        }  
        System.out.println("_____________________");
    }
}