package auxiliary.methods;

public class GetterQuantityDigitsNumber {
    public static int getQuantityDigitsNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return 0;
        }
        int remainderDivision;
        int digitsNumber = 1;
        do {
            remainderDivision = (int) (incomingNumber % (Math.pow(10, digitsNumber)));
            if (remainderDivision == incomingNumber) {
                return digitsNumber;
            }
            digitsNumber = digitsNumber + 1;
        } while (true);
    }
}
