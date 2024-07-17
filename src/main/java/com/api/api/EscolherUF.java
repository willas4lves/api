package com.api.api;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class EscolherUF {

    private static final Map<String, String> regioes = new HashMap<>();

    static {
        regioes.put("norte", "Acre, Amapá, Amazonas, Pará, Rondônia, Roraima e Tocantins.");
        regioes.put("nordeste", "Alagoas, Bahia, Ceará, Maranhão, Paraíba, Pernambuco, Piauí, Rio Grande do Norte e Sergipe.");
        regioes.put("centro-oeste", "Goiás, Mato Grosso, Mato Grosso do Sul e Distrito Federal.");
        regioes.put("sudeste", "Espírito Santo, Minas Gerais, Rio de Janeiro e São Paulo.");
        regioes.put("sul", "Paraná, Rio Grande do Sul e Santa Catarina.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a região: ");
        String regiao = scanner.nextLine().toLowerCase();
        
        switch (regiao) {
            case "norte":
                System.out.println("Estados: Acre, Amapá, Amazonas, Pará, Rondônia, Roraima e Tocantins.");
                break;
            case "nordeste":
                System.out.println("Estados: Alagoas, Bahia, Ceará, Maranhão, Paraíba, Pernambuco, Piauí, Rio Grande do Norte e Sergipe.");
                break;
            case "centro-oeste":
                System.out.println("Estados: Goiás, Mato Grosso, Mato Grosso do Sul e Distrito Federal.");
                break;
            case "sudeste":
                System.out.println("Estados: Espírito Santo, Minas Gerais, Rio de Janeiro e São Paulo.");
                break;
            case "sul":
                System.out.println("Estados: Paraná, Rio Grande do Sul e Santa Catarina.");
                break;
            default:
                System.out.println("Região não reconhecida.");
        }
        
        scanner.close();
    }

}
