/**
 * Operator ������
 * 
 * @author smart04
 *
 */
public class Operator5 {

	public static void main(String[] args) {
		// ���Կ����� (=, +=, -=, *=, /=, %= ...)
		int x = 1, y = 2, z = 0;
		{
			x += y; // x = x + y; //x���� x+y������ �ٲ��
			// x�ߺ��� ���� ����
			// ���Կ����ڸ� ���ÿ� ��ǻ���� ����ӵ��� ��������
		}
		{
			x -= y; // x = x - y;
		}
		System.out.println("====���Կ�����====");
		System.out.println(x);
		{
			// ���׿����� (���ǹ�)?��:����;
			// ���輺���� 60�� �̸��̸� ����� �ƴϸ� �н�
			int score = 100;
			String str = (score < 60) ? "�����" : "�н�";
			System.out.println("====���׿�����=====");
			System.out.println(str);
		}
		{
			String i = "textuF";// C���ó���ؽ�Ʈ�³���������
			char j = 't';// char�� �ѱ��ڸ� ��°���
			//Ȭ����ǥ�� ���δ� ���� �߿���
			int k = 10;
			System.out.println(i);
			System.out.println(j);
			System.out.printf("�ؽ�Ʈ %c�� ����մϴ�", j);
		}
	}
}

/*
 * printf()
 * 
 * %d * (decimal) ���� �������� ���
 * %f * (floating-point) �Ǽ� �������� ���
 * %c * (character) ���� �������� ���
 * %s * (string) ���ڿ� �������� ���
 * %b * (boolean) �� �������� ���
 */
