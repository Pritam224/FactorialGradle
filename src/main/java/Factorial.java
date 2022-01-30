public class Factorial {
    public int findFactorial(int num) {
        int ans = 1;
        if(num <= 1)
            return 1;

        for(int i = num; i>=1; i--)
        {
            ans *= i;
        }

        return ans;
    }
}
