
public class InsertionSort implements Sort {

	@Override
	public long[] sort(long[] arr) {
		for (int i = 0; i< arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] < arr[j]) {
				long tem = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = tem;
				j--;
			}
		}
		return arr;
	}
	
}
