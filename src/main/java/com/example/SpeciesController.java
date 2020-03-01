package com.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static java.lang.String.format;

public class SpeciesController {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Chumi Goldwag\\IdeaProjects\\week4_hw\\binary.txt");
        byte[] fileContents =  Files.readAllBytes(path);

        String name = "";
        int population = 0;
        double growth_rate = 0.0;
        String[] array = new String[2];
        //assign var

        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        try (BufferedReader br = Files.newBufferedReader(path,
                StandardCharsets.UTF_8);
             CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
                     .build()) {

            List<String[]> rows = reader.readAll();

            for (String[] row : rows) {
                int i = 0;
                for (String e : row) {
                    array[i] = format("%s ", e);
                    i++;
                }


            }


        Species species = new Species(name, population, growth_rate);

        String write = species.toString();
        //write string to txt file
        Path pathText = Paths.get("C:\\Users\\Chumi Goldwag\\IdeaProjects\\week4_hw\\binary.txt");

        Files.write(pathText, Collections.singleton(write));
    }

}
