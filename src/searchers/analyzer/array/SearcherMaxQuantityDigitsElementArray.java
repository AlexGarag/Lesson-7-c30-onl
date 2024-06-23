package searchers.analyzer.array;

import interfaces.SearchableElementArray;
import static auxiliary.methods.GetterQuantityDigitsNumber.getQuantityDigitsNumber;

public class SearcherMaxQuantityDigitsElementArray implements SearchableElementArray {
    public int searchElementArray(int[] incomingArray) {
        int maxQuantityDigitsNumber = getQuantityDigitsNumber(incomingArray[0]);
        int arrayElementMaxQuantityDigits = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            int quantityDigitsNumber = getQuantityDigitsNumber(incomingArray[i]);
            if (quantityDigitsNumber > maxQuantityDigitsNumber) {
                arrayElementMaxQuantityDigits = incomingArray[i];
                maxQuantityDigitsNumber = quantityDigitsNumber;
            }
        }
        return arrayElementMaxQuantityDigits;
    }
}