package searchers.analyzer.array;

import interfaces.SearchableSetArray;

public class SearcherOddNumbersArray implements SearchableSetArray {
    public void searchSetArray (int[] incomingArray) {
        boolean thereAreOddNumbersArray = false;
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] % 2 != 0) {
                if (!thereAreOddNumbersArray) {
                    thereAreOddNumbersArray = true;
                    System.out.print("Odd numbers in the array: ");
                }
                System.out.print(incomingArray[i] + "; ");
            }
        }
        if (!thereAreOddNumbersArray) {
            System.out.println("No odd numbers were found in the array");
        } else {
            System.out.println();
        }
    }
}
