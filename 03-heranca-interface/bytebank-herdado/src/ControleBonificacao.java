public class ControleBonificacao {

    private int soma;

    public int getSoma() {
        return soma;
    }

    public void registra(Funcionario f) {
        double bonificacao = f.getBonificaçao();
        this.soma += bonificacao;

    }
}
