public static int findMaximum(int[] numbers) {
    int max = numbers[0]; 

    // Use 'for-each' to get the value of each element (n).
    for (int n : numbers) { 
        // Compare the current value (n) to the current maximum.
        if (n > max) {
            max = n; 
        }
    }
    return max;
}
