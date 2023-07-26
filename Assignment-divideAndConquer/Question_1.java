package Assignment_DivideAndConquer;

public class Question_1 {
    public static  void swapSort(int [] arr) {
    	int j=-1,k=-1;
    	for(int i=1;i<arr.length-1;i++) {
    		if(!(arr[i-1]<=arr[i]  && arr[i]<arr[i+1])) {
    		    if(j!=-1) {
    				k=i+1;
    				break;
    			}
    			else {
    				j=i;
        			i++;
    			}
         }
    	}
    	int temp=arr[j];
    	arr[j]=arr[k];
    	arr[k]=temp;
    }
	public static void main(String[] args) {
		int []arr= {3, 8, 6, 7, 5, 9, 10};
		swapSort(arr);
		for(int i=0;i<arr.length;i++)
	        System.out.print(arr[i]+" ");
	}

}
