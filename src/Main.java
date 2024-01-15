//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//        Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // definizione dei 2 BigDecimal
        BigDecimal bigNumber1 = BigDecimal.valueOf(2.4);
        BigDecimal bigNumber2 = BigDecimal.valueOf(2.7);
        //definizione dell'operazione grazie all'Enum
        EnumOperazione operazione = EnumOperazione.ADDIZIONE;

        //Stampe richieste
        BigDecimal risultato = eseguiOperazione(operazione, bigNumber1, bigNumber2);
        System.out.println("Primo numero: " + bigNumber1);
        System.out.println("Secondo numero: " + bigNumber2);
        System.out.println("Operazione: " + operazione.getSimbolo());
        System.out.println("Risultato: " + risultato);
    }

    // metodo per calcolare l'operazione richiesta e e ritorni il risultato.
    public static BigDecimal eseguiOperazione(EnumOperazione operazione, BigDecimal num1, BigDecimal num2) {
        switch (operazione) {
            case ADDIZIONE:
                return num1.add(num2);
            case SOTTRAZIONE:
                return num1.subtract(num2);
            case MOLTIPLICAZIONE:
                return num1.multiply(num2);
            case DIVISIONE:
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    throw new ArithmeticException("Divisione per zero non consentita");
                } else return num1.divide(num2);
            default:
                throw new IllegalArgumentException("Operazione non supportata: " + operazione.getSimbolo());

        }
    }
}
