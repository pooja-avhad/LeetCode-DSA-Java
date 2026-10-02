import java.util.Arrays;
import java.util.HashMap;

class Solution
{
    public int[] arrayRankTransform(int[] arr)
    {
        // Create a copy of original array
        int[] sorted = arr.clone();

        // Sort the copy
        Arrays.sort(sorted);

        // Store rank of each value
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for(int i = 0; i < sorted.length; i++)
        {
            // Add rank only for a new value
            if(!rankMap.containsKey(sorted[i]))
            {
                rankMap.put(sorted[i], rank);
                rank++;
            }
        }

        // Replace each original value with its rank
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
