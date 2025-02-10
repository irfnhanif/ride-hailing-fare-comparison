package io.github.irfnhanif.ridehailingfarecomparisonapp.dto;

public class LocationData {
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    private String city;
    private String province;
}
