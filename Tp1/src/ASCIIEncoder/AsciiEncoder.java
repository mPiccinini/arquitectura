package ASCIIEncoder;

public class AsciiEncoder implements IAsciiEncoder {
    public static int binaryToDecimal(String binary){
        int sum = 0;
        int a = binary.length()-1;
        for(int i = 0; i < binary.length(); i++){
            int number = Integer.parseInt(String.valueOf(binary.charAt(a)));
            sum += (number*(Math.pow(2,i)));
            a--;
        }
        return sum;
    }

    public static String encode(String binary){
        String ascii = "";
        String[] binaryArray = binary.split(" ");

        for (String characterByte : binaryArray) {
            int decimal = binaryToDecimal(characterByte);
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
