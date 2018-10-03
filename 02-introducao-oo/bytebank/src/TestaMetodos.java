public class TestaMetodos {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();

        contaDoPaulo.deposita(500);
        System.out.println(contaDoPaulo.getSaldo());

        contaDoPaulo.saca(200);
        System.out.println(contaDoPaulo.getSaldo());

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        contaDaMarcela.transfere(300, contaDoPaulo);
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());

        Cliente cliente = new Cliente();
        contaDaMarcela.setTitular(cliente);

        contaDaMarcela.getTitular().setNome("Paulo");


        System.out.println(contaDaMarcela.getTitular().getNome());


    }
}
