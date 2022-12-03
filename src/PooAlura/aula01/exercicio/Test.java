package PooAlura.aula01.exercicio;

import PooAlura.aula01.Cliente;

public class Test {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente01();
        contaDaMarcela.titular.nome = "aldo";
        System.out.println(contaDaMarcela.titular.nome);


    }
}
