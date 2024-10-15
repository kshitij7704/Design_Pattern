public class TestDrive {
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 5};

		SortingContext s1 = new SortingContext(new BubbleSort());
		s1.doSort(arr);

		SortingContext s2 = new SortingContext(new SelectionSort());
		s2.doSort(arr);

		SortingContext s3 = new SortingContext(new InsertionSort());
		s3.doSort(arr);
	}
}
