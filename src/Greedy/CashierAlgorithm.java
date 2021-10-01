package Greedy;

public class CashierAlgorithm {
    int[] denominations={1,5,10,25,100};
    public void performCashierAlgorithm(int totalValue)
    {
        int noOfCoins=0;
        int valueRemaining=totalValue;
        for(int i=4;i>=0;i--)
        {
            while (valueRemaining>0&&denominations[i]<=valueRemaining)
            {
                noOfCoins++;
                valueRemaining-=denominations[i];
            }

        }
        if(valueRemaining==0)
        System.out.println("No of coins required to give this amount is"+noOfCoins+" for a value of "+totalValue);
    }
}
