package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Pessoas {

    private String nome, apelido;
    private int idade;

    public void cadastrarPessoas(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o apelido: ");
        apelido = scanner.nextLine();
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
    }


//    public void exibirInformacoes(){
//        System.out.println("===== Informações do cadastro =====");
//        System.out.println("Nome: " + nome);
//        System.out.println("Apelido: " + apelido);
//        System.out.println("Idade: " + idade);
//        System.out.println("===================================");
//    }

    public void comemorar(){
        System.out.println("A pessoa está comemorando!!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }




}
