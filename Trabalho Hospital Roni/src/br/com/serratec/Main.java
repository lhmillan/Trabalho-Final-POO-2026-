package br.com.serratec;

import br.com.serratec.service.InserirNotaFiscal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InserirNotaFiscal inserirnf = new InserirNotaFiscal();

        System.out.println("--- Sistema de Geração de NF ---");
        System.out.println("Digite o ID da fatura: ");
        int idBuscado = sc.nextInt();

        inserirnf.gerarNota(idBuscado);

        sc.close();

    }
}
