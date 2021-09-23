package com.company;

public class Triangle {
    int a;
    int b;
    int c;


    // konstruktørmetode
    public Triangle (int initialA, int initialB, int initialC) {
        this.a = initialA;
        this.b = initialB;
        this.c = initialC;
    }


    // metode der undersøger typen af trekant og returnere dens type som en streng (equilateral, isoceles eller scalene)
    public String getType() {

        String type;

        if (this.a >= this.b + this.c) {
            type = "invalid";
        } else if (this.b >= this.a + this.c) {
            type = "invalid";
        } else if (this.c >= this.a + this.b) {
            type = "invalid";
        } else if (this.a == this.b && this.a == this.c) {
            type = "equilateral";  // Hvis alle sidelængderne er lige store - Ligesidet trekant
        } else if (this.a == this.b || this.a == this.c || this.b == this.c) {
            type = "isosceles";    // Hvis to af sidelængderne er lige store - Ligebenet trekant
        } else {
            type = "scalene";      // Hvis ingen sidelængder er lige store
        }

        return type;
    }


    // toString metode
    public String toString() {
        return "Trekanten er " + getType();
    }

}
