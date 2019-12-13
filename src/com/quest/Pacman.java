package com.quest;

public class Pacman extends Character{
    class Shape {
        private String shape;

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setColor(String color) {
            this.color = color;
        }

        private String color;

        public Shape(String shape, String color) {
            this.shape = shape;
            this.color = color;
        }

    }
    private Shape shape = new Shape("Circle", "Yellow");
    public Pacman(){
        setName("Paci");
        int[] coords = new int[]{100, 100};
        setCoords(coords);
        setSpeed(1.2);
        setHealth(100);
        String modes[] = {"Wait", "Hunt", "Survive"};
        setModes(modes);
    }

    public Pacman(String name, int[] coords, double speed, int health, String[] modes) {
        super(name, coords, speed, health, modes);
    }

}
