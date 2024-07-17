package com.api.api;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("1. Escolher UF");
            System.out.println("0. Sair");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    EscolherUF.main(null);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        
    }
}
