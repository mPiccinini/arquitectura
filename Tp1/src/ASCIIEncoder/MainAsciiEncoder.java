package ASCIIEncoder;

public class MainAsciiEncoder {
    public static void main(String[] args) {
        System.out.println(AsciiEncoder.encode("01001000 01101111 01101100 01100001")); //ASCII: Hola
        System.out.println(AsciiEncoder.decode("Hola")); //Binary: 01001000 01101111 01101100 01100001
    }
}
