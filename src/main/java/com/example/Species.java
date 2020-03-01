package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;


public class Species implements Serializable {

        private String name;
        private int population;
        private double growthRate;
    FileReader filereader = new FileReader("C:\\Users\\Chumi Goldwag\\IdeaProjects\\week4_hw\\speciesText.txt");

    public Species(String name, int initialPopulation, double growthRate) throws FileNotFoundException {
            this.name = name;
            if (initialPopulation >= 0) {
                this.population = initialPopulation;
            } else {
                throw new IllegalArgumentException("initial population is less than zero");
            }
            this.growthRate = growthRate;
    }


        public String toString() {
            return ("Name: = " + name + "\n" +
                    "Population: = " + population + "\n" +
                    "Growth rate: = " + growthRate + "%");
        }


    }

