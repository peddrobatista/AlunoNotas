package com.peddrobatista.view;

import com.peddrobatista.classes.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Student stdnt  = new Student();

        stdnt.name = teclado.nextLine();
        stdnt.n1 = teclado.nextDouble();
        stdnt.n2 = teclado.nextDouble();
        stdnt.n3 = teclado.nextDouble();

        stdnt.finalGrade();

        teclado.close();
    }
}
