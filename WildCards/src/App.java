public class App {
    public static void main(String[] args) {

        Box<Integer> box1 = new Box();
        box1.setV(124);

        Box<String> box2 = new Box();
        box2.setV("Hello");

        Box<Person> box3 = new Box();
        box3.setV(new Person());

        Box<Student> box4 = new Box();
        box4.setV(new Student());

//        showBoxInfo(box1);
//        showBoxInfo(box2);
        showBoxInfo(box3);
        showBoxInfo(box4);


    }

//    public static void showBoxInfo(Box<?> box){
//        System.out.println("Box Info :"+ box.getV());
//    }

    public static void showBoxInfo(Box<? extends Person> box){
        System.out.println("Box Info :"+ box.getV());
    }

}
