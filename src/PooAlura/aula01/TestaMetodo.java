package PooAlura.aula01;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaPaulo = new Conta();
        contaPaulo.saldo = 100;
        contaPaulo.deposita(50);
        System.out.println(contaPaulo.saldo);
        System.out.println(contaPaulo.saca(50));



    }
}
