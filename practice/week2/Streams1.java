import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {
    public static void main(String[] args) {
        List<String> tests = new ArrayList<>();
        tests.add("loginTest");
        tests.add("cartTest");
        tests.add("checkoutTest");
        tests.add("loginInvalidTest");

        // 1. filter: keep only names that contain "login"
        List<String> loginTests = tests.stream()
                .filter(name -> name.contains("login"))
                .collect(Collectors.toList());
        System.out.println("Login tests: " + loginTests);

        // 2. map: convert every name to upper case
        List<String> upper = tests.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Upper case: " + upper);

        // 3. count: how many names are longer than 9 characters
        long longNames = tests.stream()
                .filter(name -> name.length() > 9)
                .count();
        System.out.println("Long names: " + longNames);
    }
}
