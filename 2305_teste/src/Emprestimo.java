public class Emprestimo {

    public static void Emprestimo(double valSolicitado, int parcelas) {

        double emprestimoFinal = valSolicitado + valSolicitado * getTaxa();
        System.out.printf("O Valor final do empréstimo solicitado é: R$" + emprestimoFinal / parcelas + ", parcelado em 2x.");
    }

    public static double getTaxa() {
        return 0.05;
    }
}
