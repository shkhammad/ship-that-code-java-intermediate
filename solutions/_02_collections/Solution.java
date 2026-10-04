package solutions._02_collections;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String arr[]= line.split(" ");
        Map<String,Integer> mp = new TreeMap<>();

        for(String w: arr)
            mp.put(w,mp.getOrDefault(w,0)+1);

        for(String w: mp.keySet())
            System.out.println(w + ": " + mp.get(w));

    }
}
