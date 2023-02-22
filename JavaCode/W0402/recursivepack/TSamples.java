package recursivepack;

public class TSamples {
	public static int[] QColumns = new int[8];
	public static int sogp = 0;
	
	public static boolean canPlaceQueen(int row, int column)
	{
		boolean ok = true;
		int i;
		for(i=0;i<row;i++) {
			if (column == QColumns[i]
					||
					(Math.abs(i-row) == Math.abs(column-QColumns[i]))
					) {
				ok = false;
			}
				
		}
		return ok;
	}
	
	public static void printSolution() {
		sogp++;
		System.out.println("\n...... " + sogp);
		for(int i = 0; i<8; i++) {
			System.out.println("\t R: " + i + " C: " + QColumns[i]);
		}
	}
	
	public static void putQueens(int row) {
		if (row >= 8) {
			printSolution();
		} else {
			for(int i=0; i<8;i++) {
				if (canPlaceQueen(row, i)) {
					//setQUEEN
					QColumns[row] = i;
					putQueens(row+1);
					//removeQUEEN row
				}
			}
		}
	}
	
	
	public static void printFigure(int n) {
		if (n <= 0) {
			return;
		}
		
		int i;
		// PRE
		for(i=0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		//Recursive CALL
		printFigure(n-1);
		
		//POST
		for(i=0;i<n;i++) {
			System.out.print("#");
		}
		System.out.println("");
	}
}
