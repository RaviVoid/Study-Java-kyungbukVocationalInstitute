
public class Variable8/* Ŭ���� */ {

	public static void main/* �޼ҵ� */(String[] args) {
		int i = 10;
		int j = 20;
		// start

		int k = j; // k=20
		j = i; // j=10
		i = k; // i=20

		// end
		/*
		 * i����20, j����10
		 */
		System.out.println("i���� " + i);
		System.out.println("j���� " + j);
	}
}
