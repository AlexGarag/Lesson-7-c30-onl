package searchers.analyzer.array;

import interfaces.SearchableElementArray;

public class SearcherMinElementArray implements SearchableElementArray {
    public int searchElementArray(int[] incomingArray) {
        int minValue = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] < minValue) {
                minValue = incomingArray[i];
            }
        }
        return minValue;
    }
}