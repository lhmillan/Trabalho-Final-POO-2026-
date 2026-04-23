package br.com.serratec;

import br.com.serratec.service.GeradorNotaFiscal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeradorNotaFiscal service = new GeradorNotaFiscal();

        System.out.println("--- Sistema de Geração de NF ---");
        System.out.println("Digite o ID da fatura: ");
        int idBuscado = sc.nextInt();

        service.gerarNota(idBuscado);

        sc.close();
    }
}
