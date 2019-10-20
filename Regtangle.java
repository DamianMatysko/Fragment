package sk.itsovy.matysko.projectfragment;

import sk.itsovy.matysko.orter.Rectangle;

public class Regtangle {
    private int a, b;
    private char charakter;
    private boolean fill;

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getCharakter() {
        return charakter;
    }

    public void setCharakter(char charakter) {
        this.charakter = charakter;
    }

    public Regtangle(int a, int b, char charakter) {
        this.a = a;
        this.b = b;
        this.charakter = charakter;
    }

    public int calcArea() {
        return a * b;
    }

    public int calcPerimeter() {
        return 2 * a + 2 * b;
    }

    public double calcDiagonal() {
        return Math.sqrt(a * a + b * b);
    }

    public void showRectangle() {
        System.out.println();
        if (isFill()) {
            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= a; b++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            }else{
                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= a; b++) {
                        if (i == 1 || i == b || j == 1 || j == a) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }

        }

        public void printRectangle () {

        }

        @Override
        public String toString () {
            return "rectangle: a= "+a+" , b= "+b;
        }
    }
