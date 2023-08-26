package Lec14;

public class Transpose {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 4, 5, 6, 9 },
				       { 11, 3, 7, 8 },
				         { 8, 1, 5, 6 }, 
				         { 110, 112, 167, 89 } };
		transp(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void transp(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[0].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
