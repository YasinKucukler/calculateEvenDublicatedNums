import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1,2,4,56,34,4,33,22,13,5,66,34,33,4};
		int[] dublicatedEvenNum = new int[arr.length];
		int startIndex = 0, counter =0;
		Arrays.sort(arr);
		for (int i = 0; i< arr.length; i++)
		{
			for(int k = 0; k<arr.length; k++)
			{
				if ((i != k)
				&& (arr[i] == arr[k])
				&& (arr[i] %2 == 0))
				{
					if (!isAdded(dublicatedEvenNum,arr[i])){
						dublicatedEvenNum[startIndex ++] = arr[i];
						counter ++;
					}
				}
			}
		}
		
		for (int i = 0; i<counter; i++)
		{
			System.out.print(dublicatedEvenNum[i] + " ");
		}
	}
	public static boolean isAdded(int[] arr, int value){
		for (int j : arr) {
			if (j == value) return true;
		}
		return false;
	}
}