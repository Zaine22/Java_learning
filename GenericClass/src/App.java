public class App {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setValue("Mg MG");

        String h = box.getValue();

        System.out.println(h);

        Box<Integer> box1 = new Box<>();

        box1.setValue(123);

        Integer x = box1.getValue();

        System.out.println(x);
    }
}
