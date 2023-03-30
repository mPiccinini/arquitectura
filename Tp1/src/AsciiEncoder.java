import java.util.ArrayList;

public class AsciiEncoder implements IAsciiEncoder{
    public static String encode(String binary){
        String ascii = "";
        String[] binaryArray = binary.split(" ");

        for (String characterByte : binaryArray) {
            int decimal = Calculator.binaryToDecimal(characterByte);
            char character = (char) decimal;
            ascii += character;
        }

        return ascii;
    }

    public static String decode(String ascii){
        StringBuilder binary = new StringBuilder();

        for(int i = 0; i < ascii.length(); i++) {
            char character = ascii.charAt(i);

            for (int j = 7; j >= 0; j--) {
                int bit = (character >> j) & 1; // obtiene el valor del bit en la posición i
                binary.append(bit);
            }
            binary.append(" ");
        }

        return binary.toString();
    }

}
