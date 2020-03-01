package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class readCSV {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chumi Goldwag\\IdeaProjects\\week4_hw\\species.csv"));
        Path path = Paths.get("C:\\Users\\Chumi Goldwag\\IdeaProjects\\week4_hw\\binary.txt");
        String strLine = "";
        StringTokenizer st = null;
        int lineNumber = 0;
        int tokenNumber = 0;
        byte[] bytes;
        //read comma separated file line by line
        while ((strLine = br.readLine()) != null) {
            lineNumber++;
            st = new StringTokenizer(strLine, ",");
            while (st.hasMoreTokens()) {
                tokenNumber++;
                int i = 0;
                bytes[i] = st.nextToken().getBytes(StandardCharsets.UTF_8);
                i++;
            }
            tokenNumber = 0;
            for (int k =0, k<2, k++){
            Files.write(path, bytes[k]);




    }}
    public readCSV() throws FileNotFoundException {
    }
}

