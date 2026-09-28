class Solution
{
    public int[] sortArray(int[] nums)
    {
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    // Quick Sort
    private void quickSort(int[] nums, int low, int high)
    {
        if(low < high)
        {
            int pivotIndex = partition(nums, low, high);

            // Sort left part
            quickSort(nums, low, pivotIndex - 1);

            // Sort right part
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    // Partition
    private int partition(int[] nums, int low, int high)
    {
        // Choose middle element as pivot
        int pivotIndex = low + (high - low) / 2;

        // Move pivot to end
        int temp = nums[pivotIndex];
        nums[pivotIndex] = nums[high];
        nums[high] = temp;

        int pivot = nums[high];

        // Boundary for smaller elements
        int i = low - 1;

        // Check elements before pivot
        for(int j = low; j < high; j++)
        {
            if(nums[j] < pivot)
            {
                i++;

                // Swap smaller element
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Put pivot in correct position
        temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }
}
