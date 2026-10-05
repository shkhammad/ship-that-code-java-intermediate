package solutions._06_optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

class Main {
    static Optional<Integer> safeParse(String s) {
        // Integer.parseInt throws NumberFormatException on bad input.
        // Return a present Optional on success and an empty one on failure.
        try{
            return Optional.of(Integer.parseInt(s));
        }
        catch (Exception e){
            return Optional.empty();
        }
    }

    public static void main(String[] a) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int res = safeParse(line).map(x -> x*2).orElse(-1);
        System.out.println(res);
        // Double the parsed value with .map(...), fall back to -1 with
        // .orElse(...), and print the result.
    }
}
