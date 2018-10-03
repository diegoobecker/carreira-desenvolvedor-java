public class TestaGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Marco");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());

        g1.setSenha(22333);
        boolean autenticou = g1.autentica(22333);

        System.out.println(autenticou);

        System.out.println(g1.getBonificaçao());
    }
}
