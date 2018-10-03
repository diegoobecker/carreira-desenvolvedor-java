public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Funcionario();

        nico.setNome("Nico Steppat");
        nico.setCpf("2233344455-4");
        nico.setSalario(2500.0);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificaçao());
    }
}
