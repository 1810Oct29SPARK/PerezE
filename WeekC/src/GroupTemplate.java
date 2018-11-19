public class GroupTemplate {
	public static void main(String[] args) {
		theQuestion(4);
		//1,5 - sort array
		//2,6 - factorial
		//3,7 - rotate left
		//4,8 - fibonacci;
	}
	public static void theQuestion(int n) {
		String[] myArray;
		if (n%5==0) {
			n=10;
		}
		else if (n%3==0 && n%6!=0 || n%8==0) {
			n=3;
		}
		else if (n%4==0) {
			n=4;
		}
		else if (n%2==1 || n%7==0) {
			n=2;
		}
		else if (n%2==0 ) {
			n=2;
		}
		else {
			n=1;
		}
			

		switch (n) {
			case 1: myArray = new String[]{"2","3","4","5","1"};
			break;
			case 2: myArray = new String[]{"3","4","5","1","2"};
			break;
			case 3: myArray = new String[]{"4","5","1","2","3"};
			break;
			case 4: myArray = new String[]{"5","1","2","3","4"};
			break;
			default:
			myArray = new String[]{"1","2","3","4","5"};
		}
		System.out.print("The array: ");
		for (int i=0; i<5; i++) {
			System.out.print(myArray[i].toString());
		}
	}
}
