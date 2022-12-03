package PooAlura.aula01;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente Paulo = new Cliente();
        Paulo.nome = "Paulo";
        Paulo.profissao = "Medico";
        Paulo.cpf = "32493420";


        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = Paulo;
        System.out.println(contaDoPaulo.titular.nome+contaDoPaulo.titular.cpf+contaDoPaulo.titular.profissao);



    }
}
