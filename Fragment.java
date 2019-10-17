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
        if (denominator==0)
            denominator=1;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fragment(Fragment other){//kopirovanie cez konstruktor
        numerator=other.getNumerator();
        denominator=other.getDenominator();
    }


    public void changeToBasicShape(){
        int commnDividisor=getTheLargestCommonDivsor();

    }
    public void extendFunction(){

    }
    public double getRealValue(){
        return 0;//todo
    }
    public void reverse(){
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }
    public void oposite(){

    }
    public Fragment copy(){
        Fragment newFragment=new Fragment(numerator, denominator);
        return newFragment;
    }
    private int getTheLargestCommonDivsor(){
        int absNummerator= MainMath.abs(numerator);
        int absDenominator= MainMath.abs(denominator);

        int commonDividor=numerator<denominator?numerator<denominator;
        while (absNummerator%commonDividor !=0|| absDenominator%commonDividor!=0){
            commonDividor--;
        }
        return commonDividor;
    }
    public boolean isFragmentInBasicShape(){
        if(getTheLargestCommonDivsor()==1){
            return true;
        }else{
            return false;
        }

        @Override
        public String toString(){
            return numerator +"/" +denominator;
        }
    }

}
