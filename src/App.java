public class App {
    public static void main(String[] args) throws Exception {
        NameGetter nameGetter = new NameGetter();
        String[] nevek = {"Béla", "Géza"};

        nameGetter.getNames(nevek);
    }
}
