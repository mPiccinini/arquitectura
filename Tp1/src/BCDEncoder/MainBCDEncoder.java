package BCDEncoder;

public class MainBCDEncoder {
    public static void main(String[] args) {
        System.out.println(BCDEncoder.decode("010101101000")); //Numero 568
        System.out.println(BCDEncoder.encode(568)); //Binary: 0101 0110 1000
    }
}
