package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private SizeStamp getSizeStamp;
    private boolean isStamped;

    public Stamp(String stampName, SizeStamp getSizeStamp, boolean isStamped) {
        this.stampName = stampName;
        this.getSizeStamp = getSizeStamp;
        this.isStamped = isStamped;
    }

    public String getStampName(){
        return stampName;
    }
    public SizeStamp getSizeStamp() {
        return getSizeStamp;
    }

    public boolean isStamped(){
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(getSizeStamp, stamp.getSizeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, getSizeStamp, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", getSizeStamp=" + getSizeStamp.toString() +
                ", isStamped=" + isStamped +
                '}';
    }
}