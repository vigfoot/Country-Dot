package com.vigfoot.countrydot.vo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

public class Geographic {

    @Getter
    @Builder
    public static class Coordinate {
        private double latitude;
        private double longitude;
    }

    @Builder
    public static class Place {
        private Coordinate coordinate;
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
