package com.tentados;

class Solution {
    public int somaVetor(int [] vetor)
    {   int soma = 0;
        for (int i : vetor) {
            soma += i;
        }
        return soma;
    }

    public boolean tankVazio(int tank)
    {
        if( tank < 0 ) return true;
        else return false;
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if( somaVetor(cost) > somaVetor(gas)) return -1;
        boolean possivel = false;
        int index = -1;
        int tank;
        while(possivel == false)
        {
            index++;
            possivel = true;
            tank = 0;
            if(index == gas.length) return -1;
            for( int i = index; i < gas.length; i++ )
            {
                tank += gas[i] - cost[i];
                if( tankVazio(tank) )
                {
                    possivel = false;
                    break;
                }
            }

            for( int i = 0; i < index; i++ )
            {
                tank += gas[i] - cost[i];
                if( tankVazio(tank) )
                {
                    possivel = false;
                    break;
                }
            }

        }
        return index;
    }
}

