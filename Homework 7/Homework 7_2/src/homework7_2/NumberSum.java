package homework7_2;

public abstract class NumberSum {
	
	public static final long getSum(int range, long sum) {
		if (range > 0) {
			sum += range;
			range--;
			return getSum(range, sum);
		}
		return sum;
	}
}
