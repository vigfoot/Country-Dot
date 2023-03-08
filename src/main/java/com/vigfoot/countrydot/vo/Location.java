package com.vigfoot.countrydot.vo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

public class Location {

    @Getter
    @Builder
    public static class Point {
        private double latitude;
        private double longitude;
    }

    @Builder
    public static class Place {
        private Point point;
        private boolean isLand;
    }

    @Builder
    public static class Continent {
        private String code;
        private String name;

    }
    @Data
    public static class Country {
        private Continent continent;
        private String code;
        private String name;

    }
}
