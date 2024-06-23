package searchers.analyzer.array;//package searchers.analyzer.array;

import interfaces.SearchableSetArray;

import static auxiliary.methods.SolverPalindrome.isNumberPalindrome;

public class SearcherPalindromesArray implements SearchableSetArray {
    public void searchSetArray(int[] incomingArray) {
        boolean thereIsPalindromeArray = false;
        for (int i = 0; i < incomingArray.length; i++) {
            if (isNumberPalindrome(incomingArray[i])) {
                if (!thereIsPalindromeArray) {
                    thereIsPalindromeArray = true;
                    System.out.print("The array contains palindromes: ");
                }
                System.out.print(incomingArray[i] + "; ");
            }
        }
        if (!thereIsPalindromeArray) {
            System.out.println("There are no palindromes in the array");
        }
    }
}
