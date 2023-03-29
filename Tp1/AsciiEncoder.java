public class AsciiEncoder implements IAsciiEncoder{

    public String encode(String binary){
        return null;
    }

    public static String decode(String ascii){
        StringBuilder binary = new StringBuilder();

        for(int i = 0; i < ascii.length(); i++) {
            char character = ascii.charAt(i);

            for (int j = 7; j >= 0; j--) {
                int bit = (character >> j) & 1; // obtiene el valor del bit en la posición i
                binary.append(bit); // agrega el valor del bit al StringBuilder
            }
            binary.append(" ");
        }

        return binary.toString();
    }

}
