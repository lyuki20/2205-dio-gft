public class TempoMensagem {

    public static void Tempo(int hora) {

        if (hora > 0 && hora < 1200) {
            System.out.println("O horário é: " + hora + ", Bom dia!");
        } else if (hora >= 1200 && hora < 1800) {
            System.out.println("O horário é: " + hora + ", Boa tarde!");
        } else if (hora >= 1800 && hora <=2359) {
            System.out.println("O horário é: " + hora + ", Boa noite!");
        } else {
            System.out.println("Informe um horário válido! Formatação correta: HMM.");
        }

    }
}
