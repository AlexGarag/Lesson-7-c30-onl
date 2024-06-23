package searchers.analyzer.array;

import interfaces.SearchableSetArray;

public class SearcherEvenNumbersArray implements SearchableSetArray {
    public void searchSetArray (int[] incomingArray) {
        boolean thereAreEvenNumbersArray = false;
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] % 2 == 0) {
                if (!thereAreEvenNumbersArray) {
                    thereAreEvenNumbersArray = true;
                    System.out.print("Even numbers in the array: ");
                }
                System.out.print(incomingArray[i] + "; ");
            }
        }
        if (!thereAreEvenNumbersArray) {
            System.out.println("No even numbers were found in the array");
        } else {
            System.out.println();
        }
    }
}
