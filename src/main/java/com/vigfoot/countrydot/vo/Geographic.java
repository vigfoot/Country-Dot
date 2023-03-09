package com.vigfoot.countrydot.vo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

public class Geographic {

    @Getter
    @Builder
    public static class Coordinate {
        private double latitude;
        private double longitude;
        @Setter
        private boolean isLand;
    }

    @Getter
    @Builder
    public static class Land {
        private List<Coordinate> coordinates;

        public void addCoordinate(Coordinate coordinate){
            if (coordinates == null)
                coordinates = new LinkedList<>();

            coordinates.add(coordinate);
        }
    }

    @Data
    @Builder
    public static class Country {
        private Continent continent;
        private String code;
        private String name;
        private List<Land> lands;

        public void addLand(Land land){
            if (lands == null)
                lands = new LinkedList<>();

            lands.add(land);
        }
    }

    @Builder
    public static class Continent {
        private String code;
        private String name;

    }
}