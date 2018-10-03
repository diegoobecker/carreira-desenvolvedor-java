public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        double aliquota = 0.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            aliquota = 7.5 / 100;
        }
        if (salario >= 2800.0 && salario <= 3751.0) {
            aliquota = 15.0 / 100;
        }
        if (salario >= 3751.0 && salario <= 4664.0) {
            aliquota = 22.5 / 100;
        }

        System.out.println(aliquota);
    }
}
