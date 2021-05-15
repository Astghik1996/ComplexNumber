package com.company;

public class Main {

    public static void main(String[] args) {
        Complex complex = new Complex();
        complex.setRealPart(1.5);
        complex.setImaginaryPart(2.5);
        Complex otherComplex = new Complex(0.25, 1.5);
        Complex sum = complex.add(otherComplex);
        System.out.print("Sum of Complex numbers is `" + " ");
        System.out.print(sum.getRealPart() + " " + "+" + " ");
        System.out.println(sum.getImaginaryPart() + "i");
        Complex substract = complex.substract(otherComplex);
        System.out.print("Substract of Complex numbers is `" + " ");
        System.out.print(substract.getRealPart() + " " + "+" + " ");
        System.out.println(substract.getImaginaryPart() + "i");


    }
}
