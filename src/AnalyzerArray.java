import interfaces.*;
import searchers.analyzer.array.*;

public class AnalyzerArray {

    private final int[] analyzingArray;

    AnalyzerArray(int[] incomingArray) {
        analyzingArray = new int[incomingArray.length];
        System.arraycopy(incomingArray, 0, analyzingArray, 0, incomingArray.length);
    }

    void analyzeArray () {
        SearchableElementArray searcherMinElementArray = new SearcherMinElementArray();
        System.out.println("The minimum element in the array: " + searcherMinElementArray.searchElementArray(analyzingArray));

        SearchableElementArray searcherMaxElementArray = new SearcherMaxElementArray();
        System.out.println("The maximum element in the array: " + searcherMaxElementArray.searchElementArray(analyzingArray));

        SearchableSetArray searcherOddNumbersArray = new SearcherOddNumbersArray();
        searcherOddNumbersArray.searchSetArray(analyzingArray);

        SearchableSetArray searcherEvenNumbersArray = new SearcherEvenNumbersArray();
        searcherEvenNumbersArray.searchSetArray(analyzingArray);

        SearchableElementArray searcherMinQuantityElementArray = new SearcherMinQuantityDigitsElementArray();
        System.out.println("The shortest element of the array: " + searcherMinQuantityElementArray.searchElementArray(analyzingArray));

        SearchableElementArray searcherMaxQuantityElementArray = new SearcherMaxQuantityDigitsElementArray();
        System.out.println("The longest element of the array: " + searcherMaxQuantityElementArray.searchElementArray(analyzingArray));

        SearchableSetArray searcherIncreasingArraySequences = new SearcherIncreasingArraySequences();
        searcherIncreasingArraySequences.searchSetArray(analyzingArray);

        SearchableSetArray searcherPalindromesArray = new SearcherPalindromesArray();
        searcherPalindromesArray.searchSetArray(analyzingArray);
    }
}