public class DemoArray1 {
	public static void main(String[] args) {
		int arr[][] = {{10,20,30},{90,40,30},{89,78,34}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
