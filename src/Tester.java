
public class Tester {
	public static void main(String[] args) {
		testSort(new BubbleSort());
		testSort(new InsertionSort());
		testSort(new HeapSort());
	}
	static void printArr(long[] arr) {
		for(long x:arr) {
			System.out.print("" + x + " ");
		}
		System.out.println();
	}
	
	static void testSort(Sort sorter) {
		System.out.println(sorter.getClass().getSimpleName());
		printArr(sorter.sort(new long[] {1,2,3,4,5,6,7,8}));
		printArr(sorter.sort(new long[] {2,4,6,8,7,5,3,1}));
		printArr(sorter.sort(new long[] {9,4,2,3,4,5,0,-1,10,1}));
		sorter.sort(new long[] {});
		try {
			printArr(sorter.sort(null));
		}
		catch (NullPointerException ex) {
			System.out.println("Error! " + ex.getMessage());
		}
	}
}
