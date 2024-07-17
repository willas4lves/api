package com.api.api;

import com.api.api.Lista2.UnidadeFederativa;
import java.util.Scanner;

public class EscolherUF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma UF digitando sua sigla:");
        for (UnidadeFederativa uf : UnidadeFederativa.values()) {
            System.out.print(uf.name() + " ");
        }
        System.out.println();

        String sigla = scanner.nextLine().toUpperCase();
        
        try {
            UnidadeFederativa ufEscolhida = UnidadeFederativa.valueOf(sigla);
            System.out.println("Você escolheu: " + ufEscolhida.getNomePorExtenso());
        } catch (IllegalArgumentException e) {
            System.out.println("Sigla inválida. Tente novamente.");
        }

        scanner.close();
    }

}
