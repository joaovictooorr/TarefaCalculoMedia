package br.com.calculo;

public class Calculo {

    public static void calcular(int n1, int n2, int n3, int n4){
        int valorCalculado = (n1 + n2 + n3 + n4) / 4;
        System.out.println(valorCalculado);
    }

    public static void main(String[] args){
        calcular(3,4,5,6);

    }
}
