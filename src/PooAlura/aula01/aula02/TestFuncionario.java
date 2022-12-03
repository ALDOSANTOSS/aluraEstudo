package PooAlura.aula01.aula02;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Aldo Santos");
        nico.setCpf("3482430232");
        nico.setSalario(2500.00);
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
