package sk.itsovy.matysko.projectfragment;

public class MixedNumber {
    private int number;
    private Fragment fragment;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public MixedNumber(int number, Fragment fragment) {
        this.number = number;
        this.fragment = fragment;
        fragment.changeToBasicShape();
    }

    public MixedNumber(int number, int numerator, int denominator) {
        this.number = number;
        this.fragment = new Fragment(numerator, denominator);
        this.fragment.changeToBasicShape();
    }

    @Override
    public String toString() {
        return number + " " + fragment.toString();
    }

    public Fragment convertToFragment() {
        Fragment newFragment = new Fragment(number * fragment.getDenominator() + fragment.getNumerator(), fragment.getDenominator());
        return newFragment;
    }

    public double getRealValue() {
        return number + fragment.getRealValue();
    }

    /*
    public MixedNumber getMixNumber() {
        MixedNumber n = null;
        int value = numerator / denumerator;
        Fragment f = new Fragment(numerator % denumerator, denominator);
        return new MixedNumber(value, f);
    }
*/

}
