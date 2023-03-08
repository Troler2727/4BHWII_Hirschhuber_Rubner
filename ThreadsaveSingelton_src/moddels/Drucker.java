package moddels;


public class Drucker {
    private static class LoadSingleton {
        static final Drucker INSTANCE = new Drucker();
    }
    private Drucker() {}

    public static Drucker getInstance() {
        return LoadSingleton.INSTANCE;
    }

    public static String drucken(){
        String s = "Ich bin die Instanz " + Drucker.getInstance().hashCode();
        return s;}

}