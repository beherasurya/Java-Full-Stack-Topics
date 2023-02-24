public class Calculate {
    

    public boolean isPrime(int number)
    {
        int result=0;
        for(int i=1;i<=number ;i++)
        {
            if(number%i ==0)
            {
                result++;
            }
        }

         boolean finalAnswer = result >2 ? false:true;
         return finalAnswer;
    }
}
