package PooAlura.aula01.aula02;

public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    //public double getBonificacao() {
    //  return this.salario;
    //}
//Código continua abaixo...
}
