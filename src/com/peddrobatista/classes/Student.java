package com.peddrobatista.classes;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public void finalGrade() {
        double nf = n1 + n2 + n3;
        if (nf >= 60) {
            System.out.println("FINAL GRADE = " + nf);
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE = " + nf);
            System.out.println("FAILED");
            double miss = 60 - nf;
            System.out.println("MISSING " + miss + " POINTS");
        }
    }

}
