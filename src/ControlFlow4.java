/**
 * �ٹ������� ���� ���� ������ �����Ͻÿ� ����-�ϼ� 01-15 02-15 03-16 04-16 05-17 06-17 07-18 08-18
 * 09-19 10-19 ~ 21-25 22-25 �������� 25��
 * 
 * @author smart04
 *
 */
public class ControlFlow4 {

	public static void main(String[] args) {
		// �����������α׷� if��
		System.out.printf("�����������α׷� if��=====\n\n");
		int i = 20 * 12 + 2;//���� ����, �� �ٹ������� ����
		System.out.printf("�� �ٹ��������� %d���� �Դϴ�.\n", i);
		int year = i / 12;//���� ����, �ٹ����� ����
		System.out.printf("�ټӿ����� %d�� %d���� �Դϴ�.\n\n", year, i % year);
		// 60*60*24 �ʴ��� ���Թ��
		{

			{

				if (year < 1) {//1�������� 1���� ������ ��쿡 �����޿� ���� 1���� �� �� �ִ�
					System.out.printf("������ %d���Դϴ�.\n", (i - 1));
				} else if (year >= 1) {//1������ �ƴҰ�쿡 ������ ������
					if (year <= 2) {//2����, 3���� ������
						System.out.printf("������ 15���Դϴ�.\n");
					} else if (year <= 4) {
						System.out.printf("������ 16���Դϴ�.\n");
					} else if (year <= 6) {
						System.out.printf("������ 17���Դϴ�.\n");
					} else if (year <= 8) {
						System.out.printf("������ 18���Դϴ�.\n");
					} else if (year <= 10) {
						System.out.printf("������ 19���Դϴ�.\n");
					} else if (year <= 12) {
						System.out.printf("������ 20���Դϴ�.\n");
					} else if (year <= 14) {
						System.out.printf("������ 21���Դϴ�.\n");
					} else if (year <= 16) {
						System.out.printf("������ 22���Դϴ�.\n");
					} else if (year <= 18) {
						System.out.printf("������ 23���Դϴ�.\n");
					} else if (year <= 20) {
						System.out.printf("������ 24���Դϴ�.\n");
					} else {//21���� ���ʹ� ���� ������ 25�� �����ȴ�
						System.out.printf("������ 25���Դϴ�.\n");
					}
				}
			}
			System.out.printf("======================\n");
		}

	}
}
