package org.example;
import java.util.regex.*;
import java.util.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    // Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    // Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    // Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }

    // Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    // Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    // Question 7
    public static int getAverage(int[] ints) {
        int average = 0;
        for (int i = 0; i < ints.length; i++) {
            average += ints[i];
        }
        average = average / ints.length;
        return average;
    }

    //  Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumber = "All odd numbers";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumber += ", " + numbers[i];
            }
        }
        return oddNumber;
    }

    // Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumber = "All even numbers";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumber += ", " + numbers[i];
            }
        }
        return evenNumber;
    }

    // Question 10
    public static boolean contains(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == element)
                return true;
        }
        return false;
    }

    //  Question 11
    public static int getIndexByElement(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Question 12
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //  Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String testString = "";
        for (int i = 0; i < n; i++) {
            testString += str + " \n";
        }
        return testString;
    }

    //   Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String index = str.substring(0, 3);
        String testString = "";
        for (int i = 0; i < n; i++) {
            testString += index + " \n";
        }
        return testString;
    }

    //   Question 15
    //Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        String wordCount = str;
        if (wordCount.isEmpty())
            return 0;
        return wordCount.split("\\s+").length;
    }
    //  Question 16

    //  A, E, I, O, U, and sometimes Y


    public static int VowelsCounter(String str) {
        int counter = 0;
        String regex = "[aeiouy]";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            counter++;
        }
        return counter;

    }


    // Question 17

    // Swap the first element in an array with the last element in an array and return


    public static String[] swap(String[] stringArray) {
        System.out.println("Original array: " + Arrays.toString(stringArray));
        String x = stringArray[stringArray.length-1];
        stringArray[stringArray.length-1] = stringArray[0];
        stringArray[0] = x;
        return stringArray;

    }


    //  Question 18

    /**
     * Given the following legend
     * <p>
     * <p>
     * <p>
     * f >> 7
     * <p>
     * s >> $
     * <p>
     * 1 >> !
     * <p>
     * a >> @
     * <p>
     * <p>
     * <p>
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * <p>
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * <p>
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     * <p>
     * <p>
     * <p>
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */


    public static String replaceCharacters(String str) {
        String legend = "fs1aFS1A";
        String replacement = "7$!@7$!@";
        StringBuilder output = new StringBuilder();
        for(char i : str.toCharArray()){
            int index = legend.indexOf(i);
            if(index != -1){
                output.append(replacement.charAt(index));
            }
            else {
                output.append(i);
            }
        }
        return output.toString();

    }


    // Question 19

          //  " The small brown dog hopped the fence "becomes " The Wu Tang Wu Hopped Wu Fence "


    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] initial = stringInput.split(" ");
        for(int i = 0; i < initial.length; i++){
            if((i+1)%2 == 0){
                initial[i] = "Wu";
            } else if ((i+1)%3 == 0) {
                initial[i] = "Tang";
            }
        }

        return Arrays.toString(initial);

    }


    // Question 20

    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while(counter < maxnumber){
            System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return String.valueOf(maxnumber);

    }


    public static void main(String[] args) {
        String[] names = {"John", "Joe", "Jimmy", "Joe 2"};
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        System.out.println(extractAllOddNumbers(ints));
        System.out.println(extractAllEvenNumbers(ints));
        System.out.println(contains(names, "These are names"));
        System.out.println(getIndexByElement(names, "Jimmy"));
        printOddNumbersInRange(1, 10);
        System.out.println(printGivenStringTimesNumberGiven("Hello World", 4));
        System.out.println(repeatFirstThreeLetters("Apples", 3));
        System.out.println(WordsInAStringCounter("Hello world world world"));
        System.out.println(VowelsCounter("This is a sentence"));
        System.out.println(Arrays.toString(swap(new String[]{"A", "B", "C"})));
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println(createStringOfFibonnaciUpToMax(5));
    }
}
