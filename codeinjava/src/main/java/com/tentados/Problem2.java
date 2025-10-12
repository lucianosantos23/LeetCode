package com.tentados;

public class Problem2 {
    public static int [] addTwoNumbers(int [] l1, int [] l2)
    {
        int tamMenor = Math.min( l1.length, l2.length );
        int tamMaior = Math.max( l1.length, l2.length );
        int [] resultado = new int[tamMaior+1];
        for( int i = 0; i < tamMenor; i++  )
        {
            int soma = l1[i] + l2[i];
            if( soma >= 10 )
            {
                resultado[i] = soma%10;
                l1[i+1]++;;
            }
            else
            {
                resultado[i] = soma;
            }
        }

        return resultado;
    }    
}
