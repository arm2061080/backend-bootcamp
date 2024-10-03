import java.util.Arrays;

public class Week4_CodingProject {

    public static void main(String[] args) {

        // a. Create an array called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a. Subtract the first element from the last element (programmatically)
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtracting first from last: " + result); // 93 - 3 = 90

        // b. Create a new array ages2 with 9 elements
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};

        // b.i. Subtract the first element from the last element of ages2
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result for ages2 array: " + result2); // 15 - 3 = 12

        // c. Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Average age: " + average);

        // String Operations

        // 2. Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double avgLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + avgLetters);

        // b. Concatenate all the names together separated by spaces
        String concatenatedNames = String.join(" ", names);
        System.out.println("Concatenated names: " + concatenatedNames);

        // Creating an Array of Name Lengths
        int[] nameLengths = new int[names.length];

        // Populate nameLengths array
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Print nameLengths
        System.out.println(Arrays.toString(nameLengths));

        // 6. Calculate the sum of the nameLengths array
        int sum1 = 0;
        for (int length : nameLengths) {
            sum1 += length;
        }
        System.out.println("Sum of name lengths: " + sum1);

        // Call the WordConcatenation method
        System.out.println(WordConcatenation.repeatWord("Hello", 3)); // "HelloHelloHello"

        // Call the FullName method
        System.out.println(FullName.getFullName("John", "Doe")); // "John Doe"

        // Call the ArraySumCheck method
        int[] nums = {10, 20, 30, 40};
        System.out.println(ArraySumCheck.isSumGreaterThan100(nums)); // true

        // Call the DoubleArrayAverage method
        double[] numsDouble = {2.5, 3.5, 4.0, 5.0};
        System.out.println(DoubleArrayAverage.calculateAverage(numsDouble)); // 3.75

        // Compare averages of two arrays
        double[] array1 = {3.0, 4.0, 5.0};
        double[] array2 = {2.0, 3.0, 4.0};
        System.out.println(CompareAverages.isFirstAverageGreater(array1, array2)); // true

        // Call the willBuyDrink method
        System.out.println(BuyDrink.willBuyDrink(true, 11.00)); // true

        // Call the isSorted method
        int[] sortedArray = {1, 2, 3, 4, 5};
        System.out.println(ArraySortedCheck.isSorted(sortedArray)); // true
    }
}

// Method to Concatenate Word N Times
class WordConcatenation {
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
}

// Method to Return Full Name
class FullName {
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}

// Method to Check if Sum of Array > 100
class ArraySumCheck {
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum > 100;
    }
}

// Method to calculate Average of Double Array
class DoubleArrayAverage {
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}

// Compare Averages of Two Arrays
class CompareAverages {
    public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
        double avg1 = DoubleArrayAverage.calculateAverage(array1);
        double avg2 = DoubleArrayAverage.calculateAverage(array2);
        return avg1 > avg2;
    }
}

// Method willBuyDrink
class BuyDrink {
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
}

// Custom Method: Check if Array is Sorted
class ArraySortedCheck {
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}


