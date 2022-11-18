import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
//Print the decimal value of each fraction on a new line with  places after the decimal.

class Result {

    public static void plusMinus(List<Integer> arr) {
        int posCounter = 0;
        int negCounter = 0;
        int zeroCounter = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                posCounter++;
            } else if (integer == 0) {
                zeroCounter++;
            } else {
                negCounter++;
            }
        }

        System.out.printf("%f%n", ((double) posCounter / (double) arr.size()));
        System.out.printf("%f%n", ((double) negCounter / (double) arr.size()));
        System.out.printf("%f%n", ((double) zeroCounter / (double) arr.size()));
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result.plusMinus(arr);
        bufferedReader.close();

    }

}