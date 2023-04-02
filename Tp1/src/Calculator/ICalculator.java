package Calculator;

public interface ICalculator { // Los metodos son static para poder testearlos con el main
    // Operations:
    public static String sum(String a, String b){
        return null;
    };
    public static String sub(String a, String b) {
        return null;
    };
    public String mult(String a, String b);
    public String div(String a, String b);

    // Transform to & from hex
    public static String toHex(String binary){return null;};
    public static String fromHex(String hex){return null;};
}