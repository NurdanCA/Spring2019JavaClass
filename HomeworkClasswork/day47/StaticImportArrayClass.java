package day47;
// static import Arrays.sort method
import static java.util.Arrays.sort;
public class StaticImportArrayClass {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	
	}
	
	
}
