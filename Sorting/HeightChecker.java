class Solution
{
    public int heightChecker(int[] heights)
    {
        // Create a copy of original array
        int[] expected = heights.clone();

        // Sort the copy
        java.util.Arrays.sort(expected);

        // Count mismatched positions
        int count = 0;

        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != expected[i])
            {
                count++;
            }
        }

        return count;
    }
}
