import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for��, if~else�� for�� �� �ڡ� �ڡڡ� �ڡڡڡ� �ڡڡڡڡ� �� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop13 {

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

		for (i = 0; i < 10; i++) {

			// i���� 5�̸� �ٷ� ���ǹ����� ����
			// if(i == 5) {
			// Ȧ���� ����ϼ���
			if (i % 2 != 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("===============");
		for (i = 0; i < 10; i++) {

			// i���� 5�̸� �ٷ� ���ǹ����� ����
			// if(i == 5) {
			// Ȧ���� ����ϼ���
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

	}
}