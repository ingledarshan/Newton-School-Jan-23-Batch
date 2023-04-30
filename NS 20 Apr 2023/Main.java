// https://my.newtonschool.co/playground/code/mxg4viddct70/
public class Main
{
    // we use the factorial funtion to calculate the number of permutations of 
    // the remaining characters in the string, from the current index to the end
	public static long factorial(int n)
    {
        long fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
	
    public static long calc_rank(String str)
    {
        if(str==null)
            return 0;
        long rank = 1;
        for (int i=0; i<str.length(); i++)
        {
            // count all smaller characters than str[i] to the right of i
            int count = 0;
            for(int j=i+1; j<str.length(); j++)
                if(str.charAt(i) > str.charAt(j))
                    count++;

            rank += count * factorial(str.length()-1-i);
        }
        return rank;
    }
	
public static void main(String[] args) 
{
	String str = "UDVNXVWE";
    System.out.println("Rank of "+str+" is "+calc_rank(str));	

}
}

