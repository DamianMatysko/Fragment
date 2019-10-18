package sk.itsovy.matysko.projectfragment;

public class Fragment {
    private int numerator;
    private int denominator;

    //generate
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fragment(int numerator, int denominator) {
        if (denominator == 0)
            denominator = 1;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fragment(Fragment other) {//kopirovanie cez konstruktor
        numerator = other.getNumerator();
        denominator = other.getDenominator();
    }


    public void changeToBasicShape() {
        int commnDividisor = getTheLargestCommonDivsor();
        numerator = numerator / commnDividisor;
        denominator = denominator / commnDividisor;
    }

    public void extendFragment(int value) {
        if (value != 0) {
            numerator *= value;
            denominator *= value;
        }
    }

    public double getRealValue() {
        return (double)numerator/denominator;
    }

    public void reverse() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public void oposite() {
        numerator*=-1;
    }

    public Fragment copy() {
        Fragment newFragment = new Fragment(numerator, denominator);
        return newFragment;
    }

    private int getTheLargestCommonDivsor() {
        /* if(numerator<denominator)
              commonDivisor=numerator;
           else
              commonDivisor=denominator;  */

        // namiesto if pouzijem ternarny operator
        int absNumerator = Math.abs(numerator);
        int absDenominator = Math.abs(denominator);

        int commonDivisor = absNumerator < absDenominator ? absNumerator : absDenominator;
        while (absNumerator % commonDivisor != 0 || absDenominator % commonDivisor != 0) {
            commonDivisor--;
        }
        return commonDivisor;
    }

    public boolean isFragmentInBasicShape() {
        if (getTheLargestCommonDivsor() == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public MixedNumber getMixedNumber() {
        int value = numerator / denominator;
        Fragment f = new Fragment(numerator % denominator, denominator);
        return new MixedNumber(value, f);
    }
}


