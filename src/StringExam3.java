/**
 * ���ڿ� String Ŭ����
 * 
 * @author smart04
 *
 */
public class StringExam3 {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //���� ���� : ĳ���͹迭
		// char c = 'A'; //���� ���� : ĳ���͹迭
		// String Ŭ������ ���ڿ��� ó�����ش�
		// String s; //�������� : ���ڿ� s�� ���������
		// s = new String(); //�ڸ����� �� �ִ´�� ĭ�� �þ��

		String s1 = new String("���ڿ�");
		String s2 = new String("���ڿ�");

		s1 = "123"; // s1�� ���ڿ� 123 ����
		s2 = "ABC"; // s2�� ���ڿ� ABC ����
		s2 = "ABC" + 123; // s2�� ���ο� ���ڿ� ABC123�� ����, ����� ABC�� garbage���� �ȴ�.

		System.out.printf("s1 = %s\ns2 = %s\n", s1, s2);

		StringBuffer sb = null;// �޸𸮰����ȿ� sb��� ������ �����
		sb = new StringBuffer("AB"); // sb�� AB��� ���ڿ��� �����Ѵ�
		sb.append("123");// sb�� ���Ե� AB�� ���� 123�� �߰��ȴ�.
		// �޸𸮸� ȿ�������� ���� ���ؼ� Buffer�� ����Ѵ�.
		// ���� �߰��ϴ� ���� �ƴϰ� ��ü�ϱ� �����̴�.
		System.out.printf("sb = %s\n", sb);
	}

}
