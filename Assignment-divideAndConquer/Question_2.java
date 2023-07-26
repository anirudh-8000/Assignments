package Assignment_DivideAndConquer;

public class Question_2 {
	public static void solve(int [] arr) {
//		int positive=-1;
//		boolean bool=true;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>0&&bool==true) {
//				positive=i;	
//				bool=false;
//			}
//			else {
//				if(positive!=-1) {
//					int temp=arr[positive];
//					arr[positive]=arr[i];
//					arr[i]=temp;
//					bool=true;
//				}
//			}
//		}
		int pos=0;
		int neg=0;
		boolean posi=false;
		boolean negi=false;
		while(pos<arr.length-1&&neg<arr.length-1) {
			if(arr[pos]>0) {
				posi=true;
			}
			else {
				pos++;
			}
			if(arr[neg]<0) {
				negi=true;
			}
			else {
				neg++;
			}
			if(posi==true&&negi==true) {
				int temp=arr[pos];
				arr[pos]=arr[neg];
				arr[neg]=temp;
				pos++;
				neg++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
        solve(arr);
        for(int i=0;i<arr.length;i++)
	        System.out.print(arr[i]+" ");
	}

}
