package com.azazlokus;

public class Vehicle {
    private String name;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
