package lab19;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] arr = ArrayUtil.getUserArray(6);
		System.out.println("\nPrvi niz: ");
		ArrayUtil.printArray(arr);
		int[] arr2 = ArrayUtil.getArray(5, -1);
		System.out.println("\nDrugi niz: ");
		ArrayUtil.printArray(arr2);
		ArrayUtil.copyArray2(arr, arr2);
		System.out.println("\nDrugi niz: ");
		ArrayUtil.printArray(arr);
		arr2 = ArrayUtil.getArray(5, -1);
		ArrayUtil.moveToLeft(arr);
		System.out.println("\nNiz pomjeren ljevlje: ");
		ArrayUtil.printArray(arr);
		ArrayUtil.moveToRight(arr);
		System.out.println("\nNiz pomjeren dešnje: ");
		ArrayUtil.printArray(arr);
		System.out.println();
		int[][] matrica = ArrayUtil.createMatrix(3, 3);
		System.out.println("Vaša matrica: ");
		ArrayUtil.printMatrix(matrica);
		int[] red = ArrayUtil.getRow(matrica, 2);
		System.out.println("Red iz matrice: ");
		ArrayUtil.printArray(red);
		System.out.println();
		int[] kolona = ArrayUtil.getColumn(matrica, 2);
		System.out.println("Kolona iz matrice: ");
		ArrayUtil.printArray(kolona);
		System.out.println("\nUnesite element niza: ");
		int broj = TextIO.getInt();
		System.out.println("Index vašeg elementa je: " + ArrayUtil.linearSearch(arr, broj));
		boolean ascending = true;
		System.out.println("Niz poredan od najvećeg člana ka najmanjem: ");
		arr = ArrayUtil.sortArray(arr, ascending);
		ArrayUtil.printArray(arr);
		ascending = false;
		System.out.println("\nNiz poredan od najmanjeg člana ka najvećem: ");
		arr = ArrayUtil.sortArray(arr, ascending);
		ArrayUtil.printArray(arr);
	}
	
}
