package com.vigfoot.countrydot.dto;

import lombok.Getter;

public class Location {

    @Getter
    public static class Coordinate {
        private double latitude;
        private double longitude;
    }

}
