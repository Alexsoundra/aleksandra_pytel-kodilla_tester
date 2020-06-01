package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String sizeStamp;
    private String stampedStamp;

    public Stamp(String stampName, String sizeStamp, String stampedStamp) {
        this.stampName = stampName;
        this.sizeStamp = sizeStamp;
        this.stampedStamp = stampedStamp;
    }

    public String getStampName(){
        return stampName;
    }
    public String getSizeStamp(){
        return sizeStamp;
    }
    public String getStampedStamp(){
        return stampedStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(sizeStamp, stamp.sizeStamp) &&
                Objects.equals(stampedStamp, stamp.stampedStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, sizeStamp, stampedStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", sizeStamp='" + sizeStamp + '\'' +
                ", stampedStamp='" + stampedStamp + '\'' +
                '}';
    }
}