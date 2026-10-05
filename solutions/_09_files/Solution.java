package solutions._09_files;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws Exception {
        //use (Cmd + D) to signal EOF for System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try(Stream<String> line = br.lines()){
            System.out.println(line.map(String::trim).filter(x -> !x.isEmpty()).count());
        }
    }
}