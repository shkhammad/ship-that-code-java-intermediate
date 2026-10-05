package solutions._07_references;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) words.add(br.readLine());

        words.sort(Comparator.comparingInt(String::length));
        words.forEach(System.out::println);
        // sort by length using a method reference
        // print each on its own line
    }
}
