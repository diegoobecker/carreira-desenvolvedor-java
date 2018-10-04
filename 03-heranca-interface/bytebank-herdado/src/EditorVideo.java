public class EditorVideo extends Funcionario {

    @Override
    public double getBonificaçao() {
        System.out.println("Chamando o metodo da classe Editor de Video");
        return 200.0;
    }
}
