
public class ArrayExam {

	public static void main(String[] args) {
		/** ������ ����
		�迭
		Ÿ��[] ������ ;
		Ÿ�� ������[];
		int[] j = new int[2]; //2ĭ¥�� ��4����Ʈ�� ������ ���������
		**/
		ArrayExam ae = new ArrayExam();
		
		System.out.println(ae); //�޸𸮻��� �ؽ��ڵ� ���� ���
		System.out.println("=============="); //���м�
		
		System.out.println("=======�ǽ�����======="); //���м�		
		int [] j = new int[3];
		double [] k = new double[3];
		char [] l = new char[3];
		
		System.out.println(j); //�ؽ��ڵ� ���� ���
		System.out.println(j[0]+j[1]+j[2]); //int�� �⺻���� 0�ΰ��� Ȯ��
		System.out.println(k[0]+k[1]+k[2]); //double�� �⺻���� 0.0�ΰ��� Ȯ��
		System.out.println(l[0]+l[1]+l[2]); //char�� �⺻���� void�ΰ��� Ȯ��
		System.out.println("=============="); //���м�
		
		j[0] = 10; //j[0]��° ĭ�� 10�� �Է�
		System.out.println(j[0]); //j[0]��° ĭ�� ���� ���
		System.out.println("=============="); //���м�
		
		int [] m = {10,20,30};
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
	}

}
