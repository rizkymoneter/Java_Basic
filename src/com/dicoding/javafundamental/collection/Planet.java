package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class Planet {
        private String name;
        private double mass;

        public Planet(String name, double mass){
            this.name = name;
            this.mass = mass;
        }

        public String toString(){
            return "Planet" + name + ", mass " + mass;
        }
}

