/**
 * ���
 * 
 * @author smart04
 *
 */
public class ControlFlow {

	public static void main(String[] args) {
		// if��(println���)
		System.out.println("if��println=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.println(i + "��(��) 5���� Ů�ϴ�");
			}
			if (i == 5) {
				System.out.println(i + "��(��) 5�� �����ϴ�");
			}
			if (i < 5) {
				System.out.println(i + "��(��) 5���� �۽��ϴ�");
			}
		}
		// if��(printf���)
		System.out.println("if��printf=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.printf("%d��(��) 5���� Ů�ϴ�\n", i);
			}
			if (i == 5) {
				System.out.printf("%d��(��) 5�� �����ϴ�\n", i);
			}
			if (i < 5) {
				System.out.printf("%d��(��) 5���� �۽��ϴ�\n", i);
			}
		}
		// if/else��
		System.out.println("if/else��=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.printf("%d��(��) 5���� Ů�ϴ�\n", i);
			} else {

				if (i == 5) {
					System.out.printf("%d��(��) 5�� �����ϴ�\n", i);
				}
				if (i < 5) {
					System.out.printf("%d��(��) 5���� �۽��ϴ�\n", i);
				}
			}
		}
		// if/else if��
		System.out.println("if/else if��=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.printf("%d��(��) 5���� Ů�ϴ�\n", i);
			} else if (i == 5) {
				System.out.printf("%d��(��) 5�� �����ϴ�\n", i);
			} else {
				System.out.printf("%d��(��) 5���� �۽��ϴ�\n", i);

			}
		}
	}

}
