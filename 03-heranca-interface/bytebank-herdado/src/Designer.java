public class Designer extends Funcionario {

    @Override
    public double getBonificaçao() {
        System.out.println("Chamando o metodo da classe Designer");
        return 100.0;
    }
}
