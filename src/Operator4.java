/**
 * Operator ������
 * 
 * @author smart04
 *
 */
public class Operator4 {

	public static void main(String[] args) {
		// ���������� ++, --
		{
			int i = 0;
			i = i + 1;
			i = i + 1;
			System.out.println("����������");
			System.out.println("i + 1 = " + (i));
		}
		{
			int i = 0;
			i++;
			i++;// ����������
			System.out.println("i++ = " + (i));
		}
		{
			int i = 0;
			i++;// ����������
			++i;// ����������
			System.out.println("++i = " + (i));
		}
		{
			int i = 0;
			System.out.println("i++ = " + (i++));
		}
		{
			int i = 0;
			System.out.println("++i = " + (++i));
			System.out.println("==============");

		}
		{
			// ���������� !(����ǥ)
			boolean b = false;
			System.out.println("����������");
			System.out.println(b);
			System.out.println(!b);
			System.out.println("==============");

		}
		{
			// �񱳿����� >, >=, <, <=, ==, != ����� boolean
			int m = 10, n = 5;
			System.out.println("�񱳿�����");
			System.out.println(m > n);
			System.out.println(m >= n);
			System.out.println(m < n);
			System.out.println(m <= n);
			System.out.println(m == n);
			System.out.println(m = n);// ���Ժκп����� �״��?
			System.out.println(m != n);// �� Ʈ�簡 �ȳ�����?
			System.out.println("==============");
		}
		/*
		 * & : ���ۼ���(ampersand) | : ��Ƽ�� ��(Vertical bar)
		 */
		{
			// �������� ( and[&&] , or[||], not[!])
			System.out.println("��������");
			System.out.println(false && false);
			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(true && true);
			System.out.println("-----------");
			System.out.println(false || false);
			System.out.println(false || true);
			System.out.println(true || false);
			System.out.println(true || true);
			System.out.println("-----------");
			System.out.println(!false);
			System.out.println(!true);
			System.out.println("=========");

		}
		{
			// ��Ʈ������ & | ^(xor) ~(not) << >> >>> 0��1�θ��Ǿ��ִ�
			byte bitNum1 = 15;
			byte bitNum2 = -10;
			System.out.println("��Ʈ������");
			System.out.println(bitNum1 + bitNum2);
			System.out.println(bitNum1 & bitNum2);
			System.out.println(bitNum1 | bitNum2);
			System.out.println(bitNum1 ^ bitNum2);
			System.out.println(~bitNum2);
			System.out.println(bitNum2 << 1);
			System.out.println(bitNum2 >> 1);
			System.out.println(bitNum2 >>> 1);
			//���ȣȭ��Ʈ ��Ʈ����Ʈ unsigned
			System.out.println("===========");

		}
		{
			byte bitNum1 = 0;
			byte bitNum2 = 1;
			byte bitNum3 = 2;
			System.out.println("��Ʈ��������");
			System.out.println(bitNum1);
			System.out.println(bitNum2);
			System.out.println(bitNum3);
			System.out.println(~bitNum1);
			System.out.println(~bitNum2);
			System.out.println(~bitNum3);

		}
	}

}
