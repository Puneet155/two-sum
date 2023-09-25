class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
      int[] Result=new int[2];
      for(int i=0;i<nums.length;i++)
      {
                int num1=nums[i];
                for(int j=i+1;j<nums.length;j++)
                {
                    if((num1+nums[j])==target)
                    {
                        Result[0]=i;
                        Result[1]=j;
                    }

                }
      }
      return Result;
    }
}
      
