import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for��, if~else�� for�� �� �ڡ� �ڡڡ� �ڡڡڡ� �ڡڡڡڡ� �� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop10 {

	public static void main(String[] args) {
		// ��ü��������=========================
		int sum = 0;// sum(����)
		int odd = 0;// odd(Ȧ��)
		int even = 0;// even(¦��)
		int start = 0; // start(���۰�)
		int end = 0; // end(���ᰪ)
		int i = 0, j = 0, k = 0; // ���־��°͵� ���պ�������
		char text = 0;

		System.out.printf("=======�Ǻ���ġ����=======\n");// ������

		// A(n+2)=A(n+0)+A(n+1) �Ǻ���ġ����
		// 1,1,2,3,5,8,13
		int m = 0;
		int n = 1;
		int o = m + n;
		for (int r = 1; r <= 7; r++) {
			m = n;
			n = o;
			o = m + n;
			System.out.printf(" %d", m);

		}
		System.out.printf("\n\n=======�빮��A~Z���=========\n");// ������
		for (i = 0; i <= 25; i++) {
			text = (char) (i + 'A');
			System.out.printf(" %c", text);
		}
		System.out.printf("\n\n=======�ҹ���a~z���=========\n");// ������
		for (i = 0; i <= 25; i++) {
			text = (char) (i + 'a');
			System.out.printf(" %c", text);
		}
		System.out.printf("\n\n=======�ҹ���a~z���=========\n");// ������
		for (i = 'a'; i <= 'z'; i++) {
			text = (char) i;
			System.out.printf(" %c", text);
		}
	}
}