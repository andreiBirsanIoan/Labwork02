import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNumbers();
        //numbers.stream().forEach(System.out::println);
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
        numbers.stream().filter(n->n%2==1).forEach(System.out::println);
    }

    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 101; i++)
            numbers.add(i);
        return numbers;
    }

    public static void print(ArrayList<Integer> arr) {
        for (int x : arr)
            System.out.println(x);
    }
}