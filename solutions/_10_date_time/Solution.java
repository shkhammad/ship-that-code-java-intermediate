package solutions._10_date_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalDate a = LocalDate.parse(br.readLine());
        LocalDate b = LocalDate.parse(br.readLine());

        System.out.println(Math.abs(ChronoUnit.DAYS.between(a,b)));
        // ChronoUnit.DAYS.between(...) gives a SIGNED count of days.
        // Nothing promises which date comes first, so print the magnitude.
    }
}