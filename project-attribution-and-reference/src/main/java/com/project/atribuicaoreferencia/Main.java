package com.project.atribuicaoreferencia;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA=" + intA + " intB=" + intA);
        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);
        MeuObj objA = new MeuObj(1);
        System.out.println("objA=" + objA + " objB=" + objA);
        objA.setNum(2);
        System.out.println("objA=" + objA + " objB=" + objA);
    }
}
