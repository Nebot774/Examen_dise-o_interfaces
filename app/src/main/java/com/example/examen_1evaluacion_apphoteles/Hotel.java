package com.example.examen_1evaluacion_apphoteles;

public class Hotel {
    private String name;
    private String location;
    private int imageResourceId;

    // Constructor
    public Hotel(String name, String location, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
