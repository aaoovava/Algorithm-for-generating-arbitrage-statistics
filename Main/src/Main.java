import other.IndeZyy;
import other.Kolyvann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Start(argument) : ");
        String start = reader.readLine();
    switch (start){
        case "-s":
            IndeZyy.MainSearch();
        break;
        case "-t":
            Kolyvann.SellOrBuy();
            break;
        case "-st":

            break;
    }
    }
}