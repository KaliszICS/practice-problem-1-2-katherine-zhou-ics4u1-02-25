public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] array, int num) {
		try{
			int value = array[num];
			return true;

		}
		catch (ArrayIndexOutOfBoundsException e){

		return false;
	}
}

	public static int divide(int a , int b){
		try{
			return a/b;
		}
		catch (ArithmeticException d){
			return 0;
		}

	}

	public static int safeConvertStringtoInt(String str){
		try {
			return Integer.parseInt(str);
		}

		catch (NumberFormatException i){
			return 0;
		}

	}


}
