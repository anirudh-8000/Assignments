package Assignment_DivideAndConquer;

public class Question_3 {
	static void RearrangePosNeg(int arr[], int n)
    {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            if (key > 0)
                continue;
            j = i - 1;
            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
        int n = arr.length;
        RearrangePosNeg(arr, n);
        for(int i=0;i<arr.length;i++)
	        System.out.print(arr[i]+" ");
	}

}
