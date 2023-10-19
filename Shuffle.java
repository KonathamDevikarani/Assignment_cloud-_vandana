import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Shuffle 
{
	public static void main(String[] args) 
	{
		Integer[] num={1,2,3,4,5,6,7,8};
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(num));
		Collections.shuffle(arrayList);
		Integer[] shuffledArray = arrayList.toArray(new Integer[0]);
		System.out.println("Shuffled array:" + Arrays.toString(shuffledArray));
	}
}







