package com.kodilla.collections.lists.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameStamp;
    private String sizeStamp;
    private boolean stampedYN;

    public Stamp (String nameStamp, String sizeStamp, boolean stampedYN) {
        this.nameStamp = nameStamp;
        this.sizeStamp = sizeStamp;
        this.stampedYN = stampedYN;
    }
        public String getNameStamp() {
        return nameStamp;
    }
        public String getSizeStamp() {
        return sizeStamp;

    }
        public boolean getstampedYN() {
        return stampedYN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampedYN == stamp.stampedYN && Objects.equals(nameStamp, stamp.nameStamp) && Objects.equals(sizeStamp, stamp.sizeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStamp, sizeStamp, stampedYN);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameStamp='" + nameStamp + '\'' +
                ", sizeStamp='" + sizeStamp + '\'' +
                ", stampedYN=" + stampedYN +
                '}';
    }
}
