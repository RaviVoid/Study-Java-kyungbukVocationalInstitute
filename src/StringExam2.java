/**
 * ���ڿ� String Ŭ����
 * 
 * @author smart04
 *
 */
public class StringExam2 {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //���� ���� : ĳ���͹迭
		// char c = 'A'; //���� ���� : ĳ���͹迭
		// String Ŭ������ ���ڿ��� ó�����ش�
		// String s; //�������� : ���ڿ� s�� ���������
		// s = new String(); //�ڸ����� �� �ִ´�� ĭ�� �þ��

		String str1 = new String("ABC");
		String str2 = new String("ABC");

		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str2 = %s\n", str2);

		String str3 = "ABC";// str3�� ���ڿ� ABC�� �ּҸ� ��Ī�Ѵ�
		String str4 = "ABC";// str4�� ���� �ִ� ���ڿ� ABC�� �ּҸ� ��Ī�Ѵ�

		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str2 = %s\n", str2);
		System.out.printf("%s\n", str3 == str4);
		System.out.printf("%s\n", str3.equals(str4));
		// equals�� ��� ���� ���� ����
		// ���۷����� ���ڿ� ���� �Է����� �ʾұ� ������ �ּҰ��� ���Ѵ�
		// and�������� ù��° ���ڿ����� ������� ���Ѵ�
		// n��° ������ ������ ������ ���� ��

		String str5 = "ABC";// str3�� ���ڿ� ABC�� �ּҸ� ��Ī�Ѵ�
		String str6 = "abc";// str4�� ���� �ִ� ���ڿ� ABC�� �ּҸ� ��Ī�Ѵ�

		System.out.printf("str5 = %s\n", str5);
		System.out.printf("str6 = %s\n", str6);
		System.out.printf("%s\n", str5 == str6);
		System.out.printf("%s\n", str5.equals(str6));
		// equals�� ��� ���� �ٸ� ����
		// ���۷����� ���ڿ� ���� �Է����� �ʾұ� ������ �ּҰ��� ���Ѵ�
		// ��.�ҹ��ڸ� �����Ѵ�
		// and�������� ù��° ���ڿ����� ������� ���Ѵ�
		// n��° ������ ������ ������ ���� ��

	}

}
