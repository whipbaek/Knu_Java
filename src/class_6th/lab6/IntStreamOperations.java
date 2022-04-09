package class_6th.lab6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int []values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.println("Original values :");
        System.out.println(
                IntStream.of(values)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        System.out.println();

        System.out.println("Count : " + IntStream.of(values).count());
        System.out.println("Min : " + IntStream.of(values).min().getAsInt());
        System.out.println("Max : " + IntStream.of(values).max().getAsInt());
        System.out.println("Average : " + IntStream.of(values).average().getAsDouble());

        System.out.printf("%nSum via reduce method : %d%n", IntStream.of(values).reduce(0,Integer::sum));
        System.out.printf("Product via reduce method : %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));
        System.out.printf("Sum of squares via map and sum : %d%n%n", IntStream.of(values).map(v -> v*v).sum());

        StringBuffer sortsum = new StringBuffer();
        IntStream.of(values).sorted().forEach(s -> { sortsum.append(" "+s); });
        System.out.printf("Values displayed in sorted order :%s%n", new String(sortsum));

    }
}
