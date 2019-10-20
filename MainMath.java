package sk.itsovy.matysko.projectfragment;

public class MainMath {
    public Fragment add(Fragment a, Fragment b) {
        Fragment resut = null;
        resut =
                new Fragment(a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(), a.getDenominator() * b.getDenominator());

        resut.changeToBasicShape();
        return resut;
    }

    public Fragment sub(Fragment a, Fragment b) {
        Fragment resut = null;
        resut =
                new Fragment(a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(), a.getDenominator() * b.getDenominator());

        resut.changeToBasicShape();
        return resut;
    }

    public Fragment nul(Fragment a,Fragment b){
        Fragment resut=null;
        resut= new Fragment(a.getNumerator()*b.getNumerator(),a.getDenominator()*b.getDenominator());
        resut.changeToBasicShape();
        return resut;
    }

    public Fragment div(Fragment a,Fragment b){
        Fragment resolut=null;
        resolut= new Fragment(a.getNumerator()*b.getNumerator(),a.getDenominator()*b.getNumerator());
        resolut.changeToBasicShape();
        return resolut;
    }

    //polymorfizmus
    public Fragment nul(int value,Fragment a){
        Fragment resut=null;
        resut=
                new Fragment(a.getNumerator()*value,a.getDenominator());
        resut.changeToBasicShape();
        return resut;

    }

    public Fragment add(int value, Fragment b) {
        Fragment temp=new Fragment(value,1);
        return add(temp,b);
    }
///////////////////////

    public MixedNumber mixAdd(MixedNumber a, MixedNumber b) {
        MixedNumber resut=null;
        Fragment r;
        Fragment aa=a.convertToFragment();
        Fragment bb=b.convertToFragment();
        r=add(aa,bb);
        resut= r.getMixedNumber();
        return resut;
    }

    public MixedNumber mixSub(MixedNumber a, MixedNumber b) {
        MixedNumber resut=null;
        Fragment r;
        Fragment aa=a.convertToFragment();
        Fragment bb=b.convertToFragment();
        r=sub(aa,bb);
        resut= r.getMixedNumber();
        return resut;
    }

    public MixedNumber mixNul(MixedNumber a, MixedNumber b) {
        MixedNumber resut=null;
        Fragment r;
        Fragment aa=a.convertToFragment();
        Fragment bb=b.convertToFragment();
        r=nul(aa,bb);
        resut= r.getMixedNumber();
        return resut;
    }

}
