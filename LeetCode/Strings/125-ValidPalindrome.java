class Solution
{
    public boolean isPalindrome(String s)
    {
        int start = 0;
        int end = s.length() - 1;

        while(left < right)
        {
            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(start)))
            {
                left++;
            }

            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(end)))
            {
                right--;
            }

            if(Character.toLowerCase(s.charAt(start)) !=
               Character.toLowerCase(s.charAt(end)))
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
