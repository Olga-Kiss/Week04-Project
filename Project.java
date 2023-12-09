package week04;

public class Project {
    public static void main(String[] args) {
    	
    	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        int resultA = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtraction first: " + resultA);

        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 42};
        int resultB = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result of subtraction second: " + resultB);
// average age
        double totalAge = 0;
        for (int age : ages2) {
            totalAge += age;
        }
        System.out.println("Average age: " + totalAge / ages2.length);
 
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
// average number of letters
double totalLetters = 0;
for (String name : names) {
    totalLetters += name.length();
}
System.out.println("Average number of letters per name: " + totalLetters / names.length);

// concatenation with spaces
String concatenatedNames = new String();
for (String name : names) {
    concatenatedNames += name + " ";
}
System.out.println("Concatenated names: " + concatenatedNames.trim());

// 5. array of name lengths
int[] nameLengths = new int[names.length];
for (int i = 0; i < names.length; i++) {
    nameLengths[i] = names[i].length();
}
// 6. sum of the nameLengths array
int sumOfNameLengths = 0;
for (int length : nameLengths) {
    sumOfNameLengths += length;
}
System.out.println("Sum of name lengths: " + sumOfNameLengths);
    

// 7. Method, a word concatenated n times
    System.out.println(concatenateWord("Hello", 3));
// 8. First & last name
    System.out.println(createFullName("Jack", "Sparrow"));
 // 9. Sum of an array elements > 100
    System.out.println(isSumGreaterThan100(nameLengths));
 // 10. Average in array of double
    double[] arrayOfDoubles = {3.14, 9.10, 23.24, 64.65, 2.19, 8.76};
    System.out.println(calculateAverage(arrayOfDoubles));
 // 11. Comparing averages of two arrays
    double[] arrayOfDoubles2 = {7.14, 5.10, 29.24, 90.65, 1.19, 0.76};
    System.out.println(isFirstArrayAverageGreater(arrayOfDoubles, arrayOfDoubles2));
 // 12. Will Buy Drink 
    System.out.println(willBuyDrink(true, 20));
 // 13. My own
    System.out.println(isPalindrome("арозаупаланалапуазора"));
    
}
//METHODS
 // 13. Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
     String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
 }
 // 12. Will Buy Drink   
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

 // 11. Comparing averages of two arrays
    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
    double average1 = calculateAverage(array1);
    double average2 = calculateAverage(array2);
    return average1 > average2;
}

 // 10. Average in array of double
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
 // 9. Sum of an array elements > 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }
 // 8. First & last name
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    
 // 7. Method, a word concatenated n times
    public static String concatenateWord(String word, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
        result.append(word);
    	}
    return result.toString();
    }

}
