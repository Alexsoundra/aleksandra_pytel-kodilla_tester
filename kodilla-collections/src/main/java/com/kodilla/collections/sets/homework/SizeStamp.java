package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class SizeStamp {

    private double length;
    private double width;

    public SizeStamp(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "SizeStamp{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SizeStamp sizeStamp = (SizeStamp) o;
        return Double.compare(sizeStamp.length, length) == 0 &&
                Double.compare(sizeStamp.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
