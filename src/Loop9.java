import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for��, if~else�� for�� �� �ڡ� �ڡڡ� �ڡڡڡ� �ڡڡڡڡ� �� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop9 {

	public static void main(String[] args) {
		// ��ü��������=========================
		int sum = 0;// sum(����)
		int odd = 0;// odd(Ȧ��)
		int even = 0;// even(¦��)
		int start = 0; // start(���۰�)
		int end = 0; // end(���ᰪ)
		int i = 0, j = 0, k = 0; // ���־��°͵� ���պ�������

		System.out.printf("=======�����Բ�=======\n");// ������
		// ����� ���ǹ� ����-----------
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		// ����� ���ǹ� ����-----------
		System.out.printf("=================\n");// ���м�
		// ����� ���ǹ� ����-----------
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf("��");
			}
			System.out.printf("\n");
		}
		// ����� ���ǹ� ����-----------
		System.out.printf("=================\n");// ���м�
		// ����� ���ǹ� ����-----------
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.printf("��");
			}
			System.out.printf("\n");
		}
		// ����� ���ǹ� ����-----------
		System.out.printf("=================\n");// ���м�
		// ����� ���ǹ� ����-----------
		for (i = 1; i <= 5; i++) {// �ݺ��� : 5�ٱ���
			// ���ǹ� : 1~3������ ���
			if (i <= 3) {
				for (j = 1; j <= i; j++) {
					System.out.printf("��");
				}
				System.out.printf("\n");
			} else { // ���ǹ� : �������� ��� 4~5
				for (j = 2; j >= 1; j--) {
					System.out.printf("��");
				}
				System.out.printf("\n");
			}
		}
		// ����� ���ǹ� ����-----------

	}
}
