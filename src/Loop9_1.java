import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for��, if~else�� for�� �� �ڡ� �ڡڡ� �ڡڡڡ� �ڡڡڡڡ� �� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop9_1 {

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
		i = 0;
		while (i < 5) {
			for (j = 0; j <= i; j++) {
				System.out.print("��");
			}
			i++;
			System.out.println();
		}
		// ����� ���ǹ� ����-----------
		System.out.printf("=================\n");// ���м�
		// ����� ���ǹ� ����-----------
		i = 1;
		while (i <= 5) {
			for (j = 1; j <= i; j++) {
				System.out.printf("��");
			}
			i++;
			System.out.printf("\n");
		}
		// ����� ���ǹ� ����-----------
		System.out.printf("=================\n");// ���м�
		// ����� ���ǹ� ����-----------
		i = 5;
		while (i >= 1) {
			j = 1;
			while (j <= i) {
				System.out.printf("��");
				j++;
			}
			i--;
			System.out.printf("\n");
		}
		// ����� ���ǹ� ����-----------
		System.out.printf("=================\n");// ���м�
		// ����� ���ǹ� ����-----------
		i = 1;
		while (i <= 5) {// �ݺ��� : 5�ٱ���
			// ���ǹ� : 1~3������ ���
			if (i <= 3) {
				j = 1;
				while (j <= i) {
					System.out.printf("��");
					j++;
				}
				System.out.printf("\n");
			} else { // ���ǹ� : �������� ��� 4~5
				j = 2;
				while (j >= 1) {
					System.out.printf("��");
					j--;
				}
				System.out.printf("\n");
			}
			i++;
		}
		// ����� ���ǹ� ����-----------

	}
}
