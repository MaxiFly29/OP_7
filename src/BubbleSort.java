
public class BubbleSort implements Sort {

	@Override
	public long[] sort(long[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean f = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					f = false;
					long tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
			if (f)
				break;
		}
		return arr;
	}

}
