package solutions._04_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

class Main {
    public static void main(String[] args) throws IOException {
        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int sum = Arrays.stream(input).mapToInt(Integer::parseInt).filter(x -> (x&1) == 0).map(x -> x*x).sum();
        System.out.println(sum);
    }
}

