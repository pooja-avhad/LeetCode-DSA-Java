class Solution
{
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        
        int max = arr1[0];

        for(int i = 1; i < arr1.length; i++)
        {
            if(arr1[i] > max)
            {
                max = arr1[i];
            }
        }

        
        int[] count = new int[max + 1];

        
        for(int i = 0; i < arr1.length; i++)
        {
            count[arr1[i]]++;
        }

        
        int[] result = new int[arr1.length];
        int index = 0;

        
        for(int i = 0; i < arr2.length; i++)
        {
            int value = arr2[i];

            while(count[value] > 0)
            {
                result[index] = value;
                index++;
                count[value]--;
            }
        }

        
        for(int i = 0; i < count.length; i++)
        {
            while(count[i] > 0)
            {
                result[index] = i;
                index++;
                count[i]--;
            }
        }

        return result;
    }
}
