/**
 * Operator ������
 * 
 * @author smart04
 *
 */
public class Operator2 {

	public static void main(String[] args) {
		//��������� +, -, *, /, % (���ϱ�,����,���ϱ�,������,��������)
		{
		double i = 10;
		int j = 3;
		
		System.out.println("i + j = " + (i + j));
		//�켱������ ��ȣ�� �־ �����ϵ��� �Ѵ�
		System.out.println("i + j = " + i + j);
		System.out.println("i - j = " + (i - j));
		System.out.println("i * j = " + (i * j));
		System.out.println("i / j = " + (i / j));
		System.out.println("i % j = " + (i % j));
		}
		double i = 10;
		int j = 3;
		
		System.out.printf/* �޼ҵ� */("%f + %d = %2.2f", i, j, i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.printf("%.12f",i+j);
		System.out.println(i%j);
	}

}
