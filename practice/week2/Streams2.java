import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7);

        // 1. sorted: put the numbers in order
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);

        // 2. filter: keep only even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Evens: " + evens);
         


        // 3. sum: add all the numbers
        int total = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println("Total: " + total);

        // 4. anyMatch: is at least one number bigger than 15?
        boolean anyBig = numbers.stream()
                .anyMatch(n -> n > 15);
        System.out.println("Any bigger than 15: " + anyBig);

        // 5. joining: sort test names and join them into one string
        List<String> names = Arrays.asList("loginTest", "cartTest", "checkoutTest");
        String joined = names.stream()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("Sorted names: " + joined);

        List<Integer> nos= numbers.stream()
                      .filter(n -> n>6)
                      .map(n -> n*2)
                      .collect(Collectors.toList());
        System.out.println( "Doubled big:" + nos);

         //List<String> names2= Arrays.asList("loginTest", "cartTest", "checkoutTest");
        List<String> up = names.stream()
         .filter(name -> name.length() < 10)
          .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println( "Short names:" + up);
    }
}