package com.quest;

public class Character implements Moveable, Feedable, Modable {
    private String name;
    private int[] coords;
    private double speed;
    private int health;
    private String[] modes;
    private String mode;

    public Character(){};

    public Character(String name, int[] coords, double speed, int health, String[] modes) {
        this.name = name;
        this.coords = coords;
        this.speed = speed;
        this.health = health;
        this.modes = modes;
        this.mode = modes[0];
    }

    @Override
    public void move() {
        for(int coord = 0; coord < this.coords.length; coord++)
            this.coords[coord] = (int)(this.coords[coord] * this.speed);
    }



    @Override
    public void feed(int delta) {
        this.health += delta;
    }

    @Override
    public void changeMode(String mode) {
        this.mode = mode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoords(int[] coords) {
        this.coords = coords;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setModes(String[] modes) {
        this.modes = modes;
    }
}
