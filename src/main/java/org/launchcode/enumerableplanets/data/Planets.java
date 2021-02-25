package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, 2440),
    VENUS("Venus", 225, 6052),
    EARTH("Earth", 365, 6371),
    MARS("Mars", 687, 3390),
    JUPITER("Jupiter", 4333, 69911),
    SATURN("Saturn", 10759, 58232),
    URANUS("Uranus", 30687, 25362),
    NEPTUNE("Neptune", 60200, 24622);

    private final String displayName;
    private final Integer yearLength;
    private final Integer radius;


    Planets(String displayName, Integer yearLength, Integer radius) {
        this.displayName = displayName;
        this.yearLength = yearLength;
        this.radius = radius;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getYearLength() {
        return yearLength;
    }

    public Integer getRadius() {
        return radius;
    }
}

