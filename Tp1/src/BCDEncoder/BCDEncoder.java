package BCDEncoder;

public class BCDEncoder {
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

    public static String encode(int a){
        String number = Integer.toString(a);
        StringBuilder binary = new StringBuilder();

        for(int i=0; i<number.length(); i++){
            for (int j = 3; j >= 0; j--) { //Recorre los primeros 4 bits
                int bit = (number.charAt(i) >> j) & 1; // obtiene el valor del bit en la posición i
                binary.append(bit);
            }
            binary.append(" ");
        }
        return binary.toString();
    }

    public static int decode(String a){
        int j=4;
        String decimal = "";
        String number = "";

        while(j != a.length()+4) {
            number = "";
            for (int i = j-4; i < j; i++) {
                number = number + a.charAt(i);
            }
            decimal = decimal + binaryToDecimal(number);
            j+=4;
        }

        return Integer.parseInt(decimal);
    }
}
