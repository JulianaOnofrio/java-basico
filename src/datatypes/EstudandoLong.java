package datatypes;

public class EstudandoLong {
    public static void main(String[] args) {
        // Long Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, ocupa 8 bytes

        long variavelTipoLong = 1118183665;
        System.out.println(variavelTipoLong);

        variavelTipoLong = -152838322;

        System.out.println(variavelTipoLong);

        //quando ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
        variavelTipoLong = (long) 36849403;

        System.out.println(variavelTipoLong);

        variavelTipoLong = (int) -152655;

        System.out.println(variavelTipoLong);

        //fazendo cast para um tipo que suporta mais


    }


}

