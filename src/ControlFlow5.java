/**
 * Ȧ¦ Ȯ�����α׷��� �ۼ��Ͻÿ�. ������ ���� �����ϰ� ���� 2�� ���� ���������� 0�̸� ¦��, �ƴϸ� Ȧ��
 * 
 * @author smart04
 *
 */
public class ControlFlow5 {

	public static void main(String[] args) {
		{
			int i;// ���� ����
			i = 59;// ������ �ʱ�ȭ

			// System.out.println("[DEG]=" + (i % 2 == 0));
			if (i % 2 == 0) {
				System.out.println("¦���Դϴ�.");
			} else if (i % 2 == 1) {
				System.out.println("Ȧ���Դϴ�.");
			}
		}
		{
			int i;// ���� ����
			i = 59;// ������ �ʱ�ȭ

			// System.out.println("[DEG]=" + (i % 2 == 0));
			if (i % 2 == 0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("Ȧ���Դϴ�.");
			}
		}
	}
}
