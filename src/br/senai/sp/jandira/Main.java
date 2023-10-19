package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Jogador;
import br.senai.sp.jandira.model.Pessoas;
import br.senai.sp.jandira.model.Torcedor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoas jogador = new Jogador();
        Pessoas torcedor = new Torcedor();

        System.out.println("Cadastro jogador");
        jogador.cadastrarPessoas();
        System.out.println("\nCadastro torcedor");
        torcedor.cadastrarPessoas();
        jogador.comemorar();
        torcedor.comemorar();
    }
}
