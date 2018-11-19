public class ArrayShift {
	public static void main(String[] args) {
		theQuestion([1,2,3,4,5], 5);
		//1,5 - sort array
		//2,6 - factorial
		//3,7 - rotate left
		//4,8 - fibonacci;
	}
	public static void theQuestion(int array[], int n) {
	Object temp = pool[position];
	for (int i = (position - 1); i >= 0; i--) {                
		array[i+1] = array[i];
	}
		array[0] = temp;
	}
}
