package S8_ProgramacaoOrientadaAObjetos.S8_70__MembrosEstaticos.S8_72__ExerciciosFixacao;

public class Dolar {
    
    private static final double tax = 6;

    public static double CurrencyConverter(double currentQuote, double buyDollar) {
        return buyDollar * currentQuote * ((tax / 100) + 1);
    }
}
