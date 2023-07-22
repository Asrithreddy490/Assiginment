package PLT_Algorithmic_Questions.cg;

public class SumEqualtoGiven {
	public static void main(String[] args) {
		int[] array= {2,2,3,1,3,1};
		int num = 4;
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] + array[j] == num) {

					System.out.println("the pairs " + i + " " + j + " having " + array[i] + " " + array[j]
							+ " have the sum " + num);

				}

			}

		}
	}
}
