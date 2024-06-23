package searchers.analyzer.array;

import interfaces.SearchableElementArray;

public class SearcherMaxElementArray implements SearchableElementArray {
    public int searchElementArray(int[] incomingArray) {
        int maxValue = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            if (incomingArray[i] > maxValue) {
                maxValue = incomingArray[i];
            }
        }
        return maxValue;
    }
}

