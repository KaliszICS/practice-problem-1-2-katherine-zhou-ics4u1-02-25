public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] array, int num) {
		try{
			int value = arr[num];
			return true;

		}
		catch (ArrayIndexOutOfBoundsException e){

		return false;
	}
}

	public static int divide(int a , int b){
		try{
			int div = a / b;
			return div;
		}
		catch (ArithmeticException d){
			return 0;
		}

	}

	public static int safeConvertStringToInt(String str){
		try {
			return Integer.parseInt(str);
		}

		catch (NumberFormatException i){
			return 0;
		}

	}


}
