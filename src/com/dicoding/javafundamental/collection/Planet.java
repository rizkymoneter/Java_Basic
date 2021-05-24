package com.dicoding.javafundamental.collection;

public class SetPlanet {
        private String name;
        private double mass;

        public SetPlanet(String name, double mass){
            this.name = name;
            this.mass = mass;
        }

        public String toString(){
            return "Planet" + name + ", mass " + mass;
        }
}
