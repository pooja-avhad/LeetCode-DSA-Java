class Solution
{
    public int mySqrt(int x)
    {
        if(x < 2)
        {
            return x;
        }

        int low = 1;
        int high = x;
        int answer = 0;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if((long) mid * mid == x)
            {
                return mid;
            }
            else if((long) mid * mid < x)
            {
                answer = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return answer;
    }
}
