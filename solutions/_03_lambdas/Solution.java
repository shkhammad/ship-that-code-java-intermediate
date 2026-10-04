package solutions._03_lambdas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

class Main {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Function<Integer,Integer> func = x-> (x*x) + 1;
        System.out.println(func.apply(n));
    }
}
