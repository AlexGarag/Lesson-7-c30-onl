package searchers.analyzer.array;

import interfaces.SearchableSetArray;

public class SearcherIncreasingArraySequences implements SearchableSetArray {

    public void searchSetArray(int[] incomingArray) {
        boolean thereAreIncreasingSequencesArray = false;
        boolean thereIsNewIncreasingSequence = false;
        int referenceElementArray = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            if (referenceElementArray < incomingArray[i]) {
                if (!thereAreIncreasingSequencesArray) {
                    thereAreIncreasingSequencesArray = true;
                    System.out.print("Sequences of increasing array elements: ");
                }
                if (thereIsNewIncreasingSequence) {
                    System.out.println();
                    System.out.print(referenceElementArray + "; ");
                    thereIsNewIncreasingSequence = false;
                }
                System.out.print(incomingArray[i] + "; ");
            } else {
                thereIsNewIncreasingSequence = true;
            }
            referenceElementArray = incomingArray[i];
        }
        if (!thereAreIncreasingSequencesArray) {
            System.out.print("No increasing sequences were found in the array");
        }
        System.out.println();
    }
}
