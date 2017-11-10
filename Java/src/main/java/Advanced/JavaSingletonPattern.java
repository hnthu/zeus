package Advanced;

public class JavaSingletonPattern {
    static private JavaSingletonPattern singetone;
    static String str;
    private JavaSingletonPattern() {

    }
    public static JavaSingletonPattern getInstance() {
        if (singetone == null) {
            singetone = new JavaSingletonPattern();
        }
        return singetone;
    }
}
