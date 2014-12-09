package lab19;

public class ArrayUtil {
	/**
	 * Funkcija ispisuje članove niza
	 * @param array
	 */
	
	public static void printArray(int[] array) {
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}

	}
	
	/**
	 * Funkcija prima dva cijela broja i popunjava niz sa default vrijednošću
	 * @param size
	 * @param defaultValue
	 * @return niz
	 */
	
	public static int[] getArray(int size, int defaultValue)
	{
		int[] niz = new int[size];
		for (int i=0; i<size; i++)
		{
			niz[i] = defaultValue;
		}
		return niz;
	}
	
	/**
	 * Funkcija prima broj i kreira niz, te traži od korisnika da popuni niz
	 * @param size
	 * @return niz
	 */
	
	public static int[] getUserArray(int size)
	{
		int[] niz = new int[size];
		for (int i=0; i<size; i++)
		{
			System.out.println("Unesite " + (i+1) + ". član niza: ");
			niz[i] = TextIO.getInt();
		}
		return niz;
	}
	
	/**
	 * Funkcija kopira jedan niz u drugi
	 * @param niz1
	 * @param niz2
	 */
	
	public static void copyArray2(int[] niz1, int[] niz2)
	{
		if (niz1.length < niz2.length)
		{
			niz2 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz2[i] = niz1[i];
			}	
		}
		else if (niz1.length > niz2.length)
		{
			niz2 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz2[i] = niz1[i];
			}
		}
		else
		{
			for (int i=0; i<niz1.length; i++)
			{
				niz2[i] = niz1[i];
			}
		}	
	}
	
	/**
	 * Funkcija kopira jedan niz u drugi i vraća drugi niz
	 * @param niz1
	 * @param niz2
	 * @return niz2 || niz3
	 */
	
	public static int[] copyArray(int[] niz1, int[] niz2)
	{
		if (niz1.length < niz2.length)
		{
			int[] niz3 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz3[i] = niz1[i];
			}
			return niz3;
		}
		else if (niz1.length > niz2.length)
		{
			int[] niz3 = new int [niz1.length];
			for (int i=0; i<niz1.length; i++)
			{
				niz3[i] = niz1[i];
			}
			return niz3;
		}
		else
		{
			for (int i=0; i<niz1.length; i++)
			{
				niz1[i] = niz2[i];
			}
			return niz2;
		}
		
	}
	
	/**
	 * Funkcija pomjera sve članove niza lijevo
	 * @param niz1
	 */
	
	public static void moveToLeft(int[] niz1)
	{
		for (int i=0; i<niz1.length-1; i++)
		{
			niz1[i] = niz1[i+1];
		}
		niz1[niz1.length-1] = 0;
	}
	
	/**
	 * Funkcija pomjera sve članove niza desno
	 * @param niz1
	 */
	
	public static void moveToRight(int[] niz1)
	{
		for (int i=niz1.length-1; i>0; i--)
		{
			niz1[i] = niz1[i-1];
		}
		niz1[0] = 0;
	}
	
	/**
	 * Funkcija vraća matricu za zadane brojeve redova i kolona
	 * @param redovi
	 * @param kolone
	 * @return matrica
	 */
	
	public static int[][] createMatrix(int redovi, int kolone) {
		int[][] matrica = new int [redovi][kolone];
		for (int i=0; i<redovi; i++)
		{
			for (int j=0; j<kolone; j++)
			{
				System.out.println("Unesite (" + (i+1) + ", " + (j+1) + ") član matrice: ");
				matrica[i][j] = TextIO.getInt();
			}
		}
		return matrica;
	}
	
	/**
	 * Funkcija ispisuje matricu
	 * @param matrica
	 */
	
	public static void printMatrix(int[][] matrica) {
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.printf("%d ", matrica[i][j]);
			}
			System.out.println();
		}
		
	}
	
	/**
	 * Funkcija vraća jedan određeni red iz matrice
	 * @param matrica
	 * @param red
	 * @return matrica
	 */
	
	public static int[] getRow (int[][] matrica, int red)
	{
		return matrica[red];
	}
	
	/**
	 * Funkcija vraća jednu određenu kolonu iz matrice
	 * @param matrica
	 * @param kolona
	 * @return niz
	 */
	
	public static int[] getColumn(int[][] matrica, int kolona)
	{
		int[] niz = new int[matrica[0].length];
		for (int i=0; i<matrica[0].length; i++)
		{
			niz[i] = matrica[i][kolona];
		}
		return niz;
	}
	
	/**
	 * Funkcija pronalazi zadani element u nizu i vraća njegov index
	 * @param niz
	 * @param broj
	 * @return index
	 */
	public static int linearSearch(int[] niz, int broj)
	{
		int index = -1;
		for (int i=0; i<niz.length; i++)
		{
			if (niz[i] == broj)
			{
				index = i;
			}
		}
		return index;
	}
	
	/**
	 * Funkcija sortira niz od najvećeg člana ka najmanjem i vraća taj niz
	 * @param niz
	 * @return niz 
	 */
	
	private static int[] sortAscending(int[] niz)
	{
		 int i;
	     boolean flag = true;
	     int temp;   
	     while (flag)
	     {
	            flag= false;    
	            for( i=0;  i < niz.length -1;  i++ )
	            {
	                   if ( niz[i] < niz[i+1] )   
	                   {
	                           temp = niz[i];                
	                           niz[i] = niz[i+1];
	                           niz[i+1] = temp;
	                           flag = true;             
	                  } 
	            } 
	      }
	     return niz;
	}
	
	/**
	 * Funkcija sortira niz od najmanjeg člana ka najvećem i vraća taj niz
	 * @param niz
	 * @return niz
	 */
	
	private static int[] sortDescending(int[] niz)
	{
	int pomocna, j;
		 for (int i=1; i<niz.length; i++)
		 {
			 pomocna = niz[i];
			 for (j=i-1; j>=0 && pomocna<niz[j]; j--)
			 {
				 
					 niz[j+1] = niz[j];
				 
			}
			niz[j+1]=pomocna;
		 }
		 return niz;
	}
	
	/**
	 * Funkcija prima niz i boolean vrijednost i poziva jednu od dvije funkcije za sortiranje, te vraća sortirani niz
	 * @param niz
	 * @param ascending
	 * @return niz
	 */
	
	public static int[] sortArray(int[] niz, boolean ascending)
	{
		if (ascending == true)
		{
			niz = sortAscending(niz);
		}
		else
		{
			niz = sortDescending(niz);
		}
		return niz;
	}
}
