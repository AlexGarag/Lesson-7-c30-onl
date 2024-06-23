package searchers.analyzer.array;

import interfaces.SearchableElementArray;

import static auxiliary.methods.GetterQuantityDigitsNumber.getQuantityDigitsNumber;

public class SearcherMinQuantityDigitsElementArray implements SearchableElementArray {
    public int searchElementArray(int[] incomingArray) {
        int minQuantityDigitsNumber = getQuantityDigitsNumber(incomingArray[0]);
        int arrayElementMinQuantityDigits = incomingArray[0];
        for (int i = 1; i < incomingArray.length; i++) {
            int quantityDigitsNumber = getQuantityDigitsNumber(incomingArray[i]);
            if (quantityDigitsNumber < minQuantityDigitsNumber) {
                arrayElementMinQuantityDigits = incomingArray[i];
                minQuantityDigitsNumber = quantityDigitsNumber;
            }
        }
        return arrayElementMinQuantityDigits;
    }
}