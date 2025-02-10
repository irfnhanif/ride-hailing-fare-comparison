package io.github.irfnhanif.ridehailingfarecomparisonapp.dto;

import java.util.List;

public class RouteData {
    private double distance;
    private double duration;
    private List<Coordinate> geometry;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public List<Coordinate> getGeometry() {
        return geometry;
    }

    public void setGeometry(List<Coordinate> geometry) {
        this.geometry = geometry;
    }
}
