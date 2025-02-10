package io.github.irfnhanif.ridehailingfarecomparisonapp.dto;

public class RouteRequest {
    private Coordinate pickup;
    private Coordinate destination;

    public Coordinate getPickup() {
        return pickup;
    }

    public void setStart(Coordinate pickup) {
        this.pickup = pickup;
    }

    public Coordinate getDestination() {
        return destination;
    }

    public void setDestination(Coordinate destination) {
        this.destination = destination;
    }
}
