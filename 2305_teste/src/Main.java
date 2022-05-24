import java.time.temporal.TemporalAccessor;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Ex. Calculadora: ");
        Calculadora.soma(10, 10);
        Calculadora.subtracao(10, 10);
        Calculadora.multiplicacao(10, 10);
        Calculadora.divisao(10, 10);

        //TempoMensagem
        System.out.println("Ex. TempoMenssagem: ");
        TempoMensagem.Tempo(800);
        TempoMensagem.Tempo(1300);
        TempoMensagem.Tempo(2100);
        TempoMensagem.Tempo(50000);

        //Emprestimo
        System.out.println("Ex. Emprestimo: ");
        Emprestimo.Emprestimo(1000, 2);
    }

}