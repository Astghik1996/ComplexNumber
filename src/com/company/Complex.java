package com.company;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex otherComplexNumber) {
        Complex sum = new Complex();
        sum.setImaginaryPart(this.imaginaryPart + otherComplexNumber.getImaginaryPart());
        sum.setRealPart(this.realPart + otherComplexNumber.getRealPart());
        return sum;

    }

    public Complex substract(Complex otherComplexNumber){
        Complex substract = new Complex();
        substract.setRealPart(this.realPart - otherComplexNumber.getRealPart());
        substract.setImaginaryPart(this.imaginaryPart - otherComplexNumber.getImaginaryPart());
        return substract;
    }


}
