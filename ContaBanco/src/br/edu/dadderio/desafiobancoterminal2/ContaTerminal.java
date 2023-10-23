package br.edu.dadderio.desafiobancoterminal2;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência com 4 dígitos: ");
        agencia = scanner.nextLine();
        agencia = String.format("xxx-x", agencia);

        System.out.println("Digite o número da sua conta com 4 digitos : ");
        numero = scanner.nextInt();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.next().toUpperCase();

        System.out.println("***********************************************************************************************************************************************************************");
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque.");

    }
}
