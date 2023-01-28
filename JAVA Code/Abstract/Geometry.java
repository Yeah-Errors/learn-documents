package com.learn.java.abstractclass;

import java.util.Date;

public abstract class Geometry implements Comparable<Geometry> {
    private String color = "white";
    private boolean filled;
    private Date creatDate;

    protected Geometry() {
        creatDate = new Date();
    }

    protected Geometry(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        creatDate = new Date();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public boolean getFilled() {
        return filled;
    }

    @Override
    public int compareTo(Geometry o) {
        if (getArea() > o.getArea()) return 1;
        if (getArea() < o.getArea()) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Geometry)) return false;
        if (compareTo((Geometry) obj) == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        return color + " " + filled + " " + creatDate + " " + getArea();
    }


    public abstract double getArea();

    public abstract double getPerimeter();
}
