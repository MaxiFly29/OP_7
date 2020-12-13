
public class HeapSort implements Sort {

	@Override
	public long[] sort(long[] arr) {
		if (arr.length == 0)
			return arr;
		makeHeap(arr);
		for (int i = 0;i<arr.length - 1;i++) {
			long tem = arr[0];
			arr[0] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tem;
			pushDown(arr, 0, arr.length - 1 - i);
		}
		return arr;
	}
	
	long[] makeHeap(long[] arr) {
		for (int i = arr.length / 2;i>=0;i--) {
			pushDown(arr, i, arr.length);
		}
		return arr;
	}
	
	long[] pushDown(long[] arr, int i, int n) {
		//2i + 1, 2i + 2
		int ind = i;
		long min = arr[i];
		if (2*i + 1 < n && arr[2*i + 1] < min) {
			ind = 2*i + 1;
			min = arr[ind];
		}
		if (2*i + 2 < n && arr[2*i + 2] < min) {
			ind = 2*i + 2;
			min = arr[ind];
		}
		if (min < arr[i]) {
			arr[ind] = arr[i];
			arr[i] = min;
			pushDown(arr, ind, n);
		}
		return arr;
	}
}
