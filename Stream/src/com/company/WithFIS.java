package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithFIS {
    FileInputStream fis = null;
    InputStreamReader isr = null;
    private String path;

    public WithFIS(String path) {
        this.path = path;
    }

    public void readFile() {
        try {
            fis = new FileInputStream(path);
            isr = new InputStreamReader(fis, "UTF-8");
            int element = 0;

            while ((element = isr.read()) != -1) {
                System.out.print((char) element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
