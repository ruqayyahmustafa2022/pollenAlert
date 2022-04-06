package com.detroitlabs.pollenAlert.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cities {
    private String cityName;
    private double latitude;
    private double longitude;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLatLong(double latitude, double longitude) throws FileNotFoundException {
        File file = new File("Absolute PathAbsolute Path");
        Scanner lat = new Scanner(file);
        Scanner usrInput = new Scanner(System.in);
        System.out.println("lat=30.695366&lon=-88.039894");
        return "hey";

    }

    public String getCityName(String cityName){
            return "hey";
    }


}
