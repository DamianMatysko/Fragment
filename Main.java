package sk.itsovy.matysko.projectfragment;

public class Main {
    public static void main (String[] args){

        Fragment f1=new Fragment(32,48);
        System.out.println(f1.toString());
        f1.changeToBasicShape();;
        System.out.println(f1.toString());
        f1.extendFunction(-5);
        System.out.println(f1.toString());
        System.out.println(f1.getRealValue());

        Fragment f2=new Fragment(7,28);
        f2.changeToBasicShape();
        System.out.println(f2.toString());
        System.out.println(f2.isFragmentInBasicShape());

        Fragment f3=new Fragment(7,0);
        Fragment f4=f2.copy();


        MainMath myMath = new MainMath();
        Fragment f6=new MainMath.add;
    }
}
