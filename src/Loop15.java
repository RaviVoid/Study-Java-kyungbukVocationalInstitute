import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * for�� 50������ �ݺ� �������� ����ϼ��� 3�� ����϶��� ¦�̶�� ����ϼ��� System.out.println("¦");
 * 
 * @author smart04
 *
 */
public class Loop15 {

	public static void main(String[] args) {
		// ��ü��������=========================
		int sum = 0;// sum(����)
		int odd = 0;// odd(Ȧ��)
		int even = 0;// even(¦��)
		int start = 0; // start(���۰�)
		int end = 0; // end(���ᰪ)
		int i = 0, j = 0, k = 0; // ���־��°͵� ���պ�������
		char text = 0;
		// ��ü�������� ��======================

		// ������ ���
		System.out.println("===�ݺ��� : 1���� 50���� ����ض�===");
		// ������ ��� ����

		for (i = 1; i <= 50; i++) {

			// ���ǹ� : 3�� ����ϰ�쿡 ¦�� ����ϰ� ��������
			if (i % 3 == 0) {
				System.out.printf("¦(3�ǹ��)=%d\n", i);
				continue;
			}
			// ���ǹ� : 3�� ����ϰ�쿡 ¦�� ����ϰ� �������� ����

			// ���ǹ� : 3�� ��� ���ϰ�쿡 ����� ����ϰ� ��������
			if (i % 3 == 2) {
				System.out.printf("%d=������ ¦�Դϴ� �����ϼ���\n", i);
				continue;
			}
			// ���ǹ� : 3�� ��� ���ϰ�쿡 ����� ����ϰ� �������� ����

			// 3�� ����� ���� �������� ����ض�
			System.out.println(i);
			// 3�� ����� ���� �������� ����ض� ����

		}
		// �ݺ��� : 1���� 50���� ����ض� ����

		// ���м� ���
		System.out.println("===============");
		// ���м� ��� ����

	}
}