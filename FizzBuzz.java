import java.util.stream.IntStream;

public class FizzBuzz {

    private static void fizzBuzz(int num){
        IntStream.rangeClosed(1, num)
            .mapToObj(i -> {
                if (i % 7 == 0 && i % 5 == 0) return "FizzBuzz";
                else if (i % 5 == 0) return "Fizz";
                else if (i % 7 == 0) return "Buzz";
                else return i;
            })
            .forEach(System.out::println);
    }

    public static void main(String[] args){
        fizzBuzz(50);
    }
}
