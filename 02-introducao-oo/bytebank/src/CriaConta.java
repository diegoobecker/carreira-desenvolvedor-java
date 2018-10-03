public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta(123, 456);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(50);

        System.out.println("Saldo da primeira: " + primeiraConta.getSaldo());
        System.out.println("Saldo da segunda: " + segundaConta.getSaldo());

        System.out.println("Total de contas: " + Conta.getTotal());
    }
}
