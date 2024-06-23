public class Main {
    public static void main(String[] args) {
        int[] workingArray  = new int[] {23, 18, 45, 89, 12321, 14, -12, -2, -1, 0, 1, 2, 3, -121};
        AnalyzerArray analyzerArray = new AnalyzerArray(workingArray);
        analyzerArray.analyzeArray();
    }
}