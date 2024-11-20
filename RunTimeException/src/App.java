public class App {

    public static String name;
    public static void main(String[] args) {

//        try{
//            int x = 4/0; //AritheticException
//            System.out.println("Hello World");
//        }catch (ArithmeticException e){
//        System.out.println("Error");
//        }


//        int[] numbers = {12,23,34};
//        try{
//           System.out.println(numbers[4]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Index out of bounds");
//        }
    name = "hello";
        if (name != null){
            System.out.println("Name Length"+ name.length());
        }

    }
}