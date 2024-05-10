package planatir;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaFormattingChallenge {
    public static void main(String[] args) {
        // Simple lambda expression


        Runnable simpleRunnable = () -> System.out.println("Simple lambda");
        simpleRunnable.run();

        // Lambda with parameters
        Function<String, Integer> lengthFunction = str -> str.length();
        int length = lengthFunction.apply("Hello, Lambda!");
        System.out.println("Length: " + length);

        // Lambda with multiple statements
        Function<Integer, Integer> doubleAndSquare =
                num -> {
            int doubled = num * 2;return doubled * doubled;  //This is an important comment!
        };
        int result = doubleAndSquare.apply(5);  System.out.println("Result: " + result);

        // Lambda with nested lambdas
        Function<String, Function<String, String>> concatFunction = str1 -> str2 -> str1 + " " + str2 + " adding something that is very logn for no reason";
                   String concatenated = concatFunction.apply("Hello").apply("Lambda");
        System.out.println("Concatenated: " + concatenated);

        // Lambda with streams and method references
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);

        // Lambda with nested streams and filters
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredNumbers = numbers.stream().filter(num -> {
                    System.out.println("Filtering: " + num);
                    return num % 2 == 0;
                }).map(num -> {
                    System.out.println("Mapping: " + num);
                    return num * 2;
                })


                .collect(Collectors.toList());System.out.println("Filtered and mapped numbers: " + filteredNumbers);
        // Lambda with IntStream and nested lambdas
IntStream.rangeClosed(1, 5).mapToObj(i -> {
                    return IntStream.rangeClosed(1, i).mapToObj(j -> "(" + i + "," + j + ")").collect(Collectors.joining(", "));
                }).forEach(System.out::println);
    }
}