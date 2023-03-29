public interface IAsciiEncoder {
    String encode(String binary);
    static String decode(String ascii){return null;};
}
