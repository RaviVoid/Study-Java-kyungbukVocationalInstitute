import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * for�� 1���� 10������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 * @author smart04
 *
 */
public class Loop14_1 {

	public static void main(String[] args) {
		// ��ü��������=========================
		int sum = 0;// sum(����)
		int odd = 0;// odd(Ȧ��)
		int even = 0;// even(¦��)
		int start = 0; // start(���۰�)
		int end = 0; // end(���ᰪ)
		int quotient = 0; // quotient(�������� ��)
		int i = 0, j = 0, k = 0; // ���־��°͵� ���պ�������
		char text = 0;
		// ��ü�������� ��======================

		// ������ ���
		System.out.println("===�ݺ���1 : 3�� ����� ������ ����ض�===");
		// ������ ��� ����

		// �ݺ��� : 1���� 10������ ������ ���
		start = 1;
		end = 10;
		for (i = start; i <= end; i++) {

			// ���ǹ� : 3�� ����� ����
			if (i % 3 == 0) {
				sum += i; // sum = sum + i // 3�� ������ sum�� ����

				System.out.printf("%d", i); // sum�� ���� ���� ������ ���

				// �ִ밪���� 3�� ������ ���� ����
				quotient = (end / 3);

				// �򿡼� 3�� �����ָ� ���� 3�� ��� �ִ밪�� ����
				if (i != (quotient * 3)) {
					System.out.printf(" + "); // sum�� ���̻��̿� +�� �־��
				}
			}

		}
		// �ݺ��� ����
		System.out.printf("\n= %d\n", sum); // sum �������� ���
		// ���м� ���
		System.out.println("===============");
		// ���м� ��� ����
		
		// ������ ���
		System.out.println("===�ݺ���2 : 3�� ����� ������ ����ض�===");
		// ������ ��� ����

		// �ݺ��� : 1���� 10������ ������ ���
		start = 1;
		end = 10;
		sum = 0;
		for (i = start; i <= end; i++) {

			// ���ǹ� : 3�� ����� ����
			if (i % 3 == 0) {
				sum += i; // sum = sum + i // 3�� ������ sum�� ����

				System.out.printf("%d", i); // sum�� ���� ���� ������ ���

				// �򿡼� 3�� �����ָ� ���� 3�� ��� �ִ밪�� ����
				if (i != end-(end%3)) {
					System.out.printf(" + "); // sum�� ���̻��̿� +�� �־��
				}
			}

		}
		// �ݺ��� ����
		System.out.printf("\n= %d\n", sum); // sum �������� ���
		// ���м� ���
		System.out.println("===============");
		// ���м� ��� ����
	}
}

