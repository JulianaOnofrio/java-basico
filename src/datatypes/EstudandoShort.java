package datatypes;

public class EstudandoShort {

        public static void main(String[] args) {
            //valor permitido de short Stores whole numbers from -32,768 to 32,767, ocupa 2 bytes

            short variavelTipoShort = 3665;
            System.out.println(variavelTipoShort);

            variavelTipoShort = -15222;

            System.out.println(variavelTipoShort);

            //qaundo ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
            variavelTipoShort = (short) 36000;

            System.out.println(variavelTipoShort);

            variavelTipoShort = (short) -152655;

            System.out.println(variavelTipoShort);

            //fazendo cast para um tipo que suporta mais

            byte variavelTipoByte = (byte) 102;
            variavelTipoShort = variavelTipoByte;

            System.out.println(variavelTipoShort);

            variavelTipoByte = -55;
            variavelTipoShort = variavelTipoByte;

            System.out.println(variavelTipoShort);
        }
    }

