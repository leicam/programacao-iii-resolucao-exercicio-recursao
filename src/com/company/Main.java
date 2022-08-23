package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fatorial de 4 é:" +
                calcularFatorial(4));
    }

    private static Integer calcularFatorial(Integer valor){
        if (valor == 1)
            return 1;

        return valor * calcularFatorial(valor - 1);
    }
}
