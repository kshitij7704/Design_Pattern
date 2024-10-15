public class SortingContext {
	private SortingStrategy strategy;

	public SortingContext(SortingStrategy strategy){
		this.strategy = strategy;
	}

	public void doSort(int[] array){
		strategy.sort(array);
	}
}