import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for��, if~else�� for�� �� �ڡ� �ڡڡ� �ڡڡڡ� �ڡڡڡڡ� �� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop10_1 {

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
		int r = 1;
		while (r <= 7) {
			m = n;
			n = o;
			o = m + n;
			System.out.printf(" %d", m);
			r++;

		}
		System.out.printf("\n\n=======�빮��A~Z���=========\n");// ������
		i = 0;
		while (i <= 25) {
			text = (char) (i + 'A');
			System.out.printf(" %c", text);
			i++;
		}
		System.out.printf("\n\n=======�ҹ���a~z���=========\n");// ������
		i = 0;
		while (i <= 25) {
			text = (char) (i + 'a');
			System.out.printf(" %c", text);
			i++;
		}
		System.out.printf("\n\n=======�ҹ���a~z���=========\n");// ������
		i = 'a';
		while (i <= 'z') {
			text = (char) i;
			System.out.printf(" %c", text);
			i++;
		}
	}
}