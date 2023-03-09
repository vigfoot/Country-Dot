package com.vigfoot.countrydot.dto;

import lombok.Getter;

import java.util.List;

public class Location {

    @Getter
    public static class Polygon {
        private String type;
        private String name;
        private List<String> crs;
        private List<String> features;

    }

    @Getter
    public static class Feature {
        private String type;
        private Properties properties;
        private Geometry geometry;
    }

    @Getter
    public static class Properties {
        private String GID_0;
        private String COUNTRY;

    }

    @Getter
    public static class Geometry {
        private String type;
        private List<Double[]> coordinates;

    }
}