package datatypes;

public class EstudandoInt {
    public static void main(String[] args) {
        // int Stores whole numbers from -2,147,483,648 to 2,147,483,647, ocua 4 bytes

        int variavelTipoInt = 18183665;
        System.out.println(variavelTipoInt);

        variavelTipoInt = -152838322;

        System.out.println(variavelTipoInt);

        //quando ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
        variavelTipoInt = (int) 36849403;

        System.out.println(variavelTipoInt);

        variavelTipoInt = (int) -152655;

        System.out.println(variavelTipoInt);

        //fazendo cast para um tipo que suporta mais

        variavelTipoInt = (int) 102;
        variavelTipoInt = variavelTipoInt;

        System.out.println(variavelTipoInt);

        variavelTipoInt = -55;
        variavelTipoInt = variavelTipoInt;

        System.out.println(variavelTipoInt);
    }


}


