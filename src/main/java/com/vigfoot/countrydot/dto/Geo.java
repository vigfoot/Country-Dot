package com.vigfoot.countrydot.dto;

import lombok.Getter;

public class Geo {

    @Getter
    public static class Point{
        private double latitude;
        private double longitude;
    }

    @Getter
    public static class Location{

    }
}
