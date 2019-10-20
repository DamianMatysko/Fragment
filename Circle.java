package sk.itsovy.matysko.projectfragment;

public class Circle {

        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public double calcArea(){
            return Math.PI*radius*radius;
        }
        public double calcPerimeter(){
            return 2*Math.PI*radius;
        }


}
