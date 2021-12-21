class Leader
{
    static void findTheLeaders(int arr[], int n)
    {
        System.out.print(arr[n-1] + " ");
        int right_max = arr[n-1];
        
        for (int i = n-2; i >= 0; i--)
        {
            if (arr[i] > right_max)
            {
                System.out.print(arr[i] + " ");
                right_max = arr[i];
            }
        }
    } 
    
    public static void main(String args[])
    {
        int arr[] = {12, 27, 14, 11, 25, 6, 7};
        int n = arr.length;
        
        findTheLeaders(arr, n);
    }
}

