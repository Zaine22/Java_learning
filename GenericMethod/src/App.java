class Util{
    public static <T>void printAll(T[] array){

        for(T e:array){
            System.out.println(e);
        }

    }
        }
public class App {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,32};
        String [] names =  {"kyaw kyaw", "ko ko", "zaw zaw"};

        Util.<Integer>printAll(numbers);
        Util.<String>printAll(names);


    }
}
