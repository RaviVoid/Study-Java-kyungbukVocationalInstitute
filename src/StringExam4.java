/**
 * ���ڿ� String Ŭ����
 * 
 * @author smart04
 *
 */
public class StringExam4 {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //���� ���� : ĳ���͹迭
		// char c = 'A'; //���� ���� : ĳ���͹迭
		// String Ŭ������ ���ڿ��� ó�����ش�
		// String s; //�������� : ���ڿ� s�� ���������
		// s = new String(); //�ڸ����� �� �ִ´�� ĭ�� �þ��

		String str1 = new String("ABC");
		String str2 = new String("ABC");

		System.out.printf("%s\n", str1 == str2);
		System.out.printf("%s\n", str1.equals(str2));
		//equals�� ��� ���� �ٸ� ����
		//and�������� ù��° ���ڿ����� ������� ���Ѵ�
		//n��° ������ ������ ������ ���� ��
		
		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str2 = %s\n", str2);

	}

}
