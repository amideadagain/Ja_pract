package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String path = "C://Users//USER//Documents//ja_practice//Stream//countries.txt";
        WithScanner countries = new WithScanner(path);

        countries.scanByLines();

        ArrayList<String> countriesList = new ArrayList<String>();
        countries.fillArrayListByLines(countriesList);
        System.out.println(countriesList);

        WithFIS countries2 = new WithFIS(path);
        countries2.readFile();
    }
}
