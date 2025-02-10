package io.github.irfnhanif.ridehailingfarecomparisonapp.dto;

public class RouteResponse {
    private RouteData route;
    private LocationData pickUpLocation;
    private LocationData destinationLocation;
    private FareData fares;

    public RouteResponse(RouteData route, LocationData pickUpLocation, LocationData destinationLocation, FareData fares) {
        this.route = route;
        this.pickUpLocation = pickUpLocation;
        this.destinationLocation = destinationLocation;
        this.fares = fares;
    }

    public RouteData getRoute() {
        return route;
    }

    public void setRoute(RouteData route) {
        this.route = route;
    }

    public LocationData getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(LocationData pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public LocationData getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(LocationData destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public FareData getFares() {
        return fares;
    }

    public void setFares(FareData fares) {
        this.fares = fares;
    }
}
