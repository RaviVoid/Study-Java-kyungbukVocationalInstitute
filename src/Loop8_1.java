import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for��, if~else�� 1���� 10������ Ȧ����, ¦����, ������ ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop8_1 {

	public static void main(String[] args) {
		// ��ü��������=========================
		int sum = 0;// sum(����)
		int odd = 0;// odd(Ȧ��)
		int even = 0;// even(¦��)
		int start = 0; // start(���۰�)
		int end = 0; // end(���ᰪ)

		// ==================================���۰� �Է�
		Scanner scan = new Scanner(System.in); // ���� �Է¹޴� �Լ� Scan
		System.out.println("�Ʒ��� Ŀ���� �ΰ� ���۰��� �Է��ϼ���.");
		start = scan.nextInt();

		// ==================================���ᰪ �Է�
		System.out.println("�Ʒ��� Ŀ���� �ΰ� ���ᰪ�� �Է��ϼ���.");
		end = scan.nextInt();

		// ==================================¦Ȧ����
		// Ȧ¦���� ���ǹ� ����-----------
		int i = start;
		while (i <= end) {
			if (i % 2 == 0) {// ¦���ΰ�?
				even += i; // even = even + i;// ¦�������ض�
			} else {// Ȧ���ΰ�?
				odd += i; // odd = odd + i;// Ȧ�������ض�
			}
			i++;
		}
		// Ȧ¦���� ���ǹ� ����-----------

		sum = odd + even;// sum=Ȧ��+¦��

		// ==================================��¹�
		System.out.println("����:" + sum);
		System.out.println("Ȧ����:" + odd);
		System.out.println("¦����:" + even);
	}
}
