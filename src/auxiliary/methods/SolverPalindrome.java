package auxiliary.methods;

import static java.lang.Math.abs;
import static auxiliary.methods.GetterQuantityDigitsNumber.getQuantityDigitsNumber;

public class SolverPalindrome {
    public static boolean isNumberPalindrome (int incomingNumber) {
        if (abs(incomingNumber) < 10 ) {
            return true;
        }
        int quantityDigitsNumber = getQuantityDigitsNumber(incomingNumber);
        for (int i = 0; i < quantityDigitsNumber / 2; i++) {
            if ((incomingNumber / (int) Math.pow(10, i)) % 10 !=
                    (incomingNumber / (int) Math.pow(10, quantityDigitsNumber - i - 1)) % 10) {
                return false;
            }
        }
        return true;
    }
}
