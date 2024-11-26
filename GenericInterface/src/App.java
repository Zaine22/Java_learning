public class App {
    public static void main(String[] args) {

        Pair<String, String> pair = new CustomPair<>("mm", "Myanmar");
        System.out.println(pair.getKey() +" : "+ pair.getValue());

    }
}
