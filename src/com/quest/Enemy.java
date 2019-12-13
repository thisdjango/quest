package com.quest;

public class Enemy extends Character{

    public Enemy() {
        setName("Enemi");
        int[] coords = new int[]{400, 200};
        setCoords(coords);
        setSpeed(1.2);
        setHealth(100);
        String modes[] = {"Wait", "Hunt", "Survive"};
        setModes(modes);
    }

    public Enemy(String name, int[] coords, double speed, int health, String[] modes) {
        super(name, coords, speed, health, modes);
    }

}
