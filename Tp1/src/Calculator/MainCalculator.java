package Calculator;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println(Calculator.sum("100101", "0010111")); // Should return 0111100
        System.out.println(Calculator.fromHex("1A")); // Should return 11010
        System.out.println(Calculator.toHex("1010")); // Should return A
        System.out.println(Calculator.sub("11111", "01000")); // Should return 10111
    }
}