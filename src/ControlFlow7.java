/**
 * �ٹ������� ���� ���� ������ �����Ͻÿ� ����-�ϼ� 01-15 02-15 03-16 04-16 05-17 06-17 07-18 08-18
 * 09-19 10-19 ~ 21-25 22-25 �������� 25��
 * ����������α׷�(�⺰)
 * @author smart04
 *
 */
public class ControlFlow7 {

	public static void main(String[] args) {
		int longevity = -10; //���� 1������.
		
		//C���� ����ó���� �ϴ� ��� ����
		if (longevity < 1 ) {
			System.out.println("usage:������� �Է��ϼž��մϴ�.");//�����޼������
			return;//�Ʒ��ִ� ������ �������� �ʽ��ϴ�.void�� ���ư���.
		}
		//C���� ����ó���� �ϴ� ��� ��
		
		switch (longevity) {
		case 1: System.out.println("���������� 11�� �Դϴ�.");
		break;
		case 2: System.out.println("���������� 15�� �Դϴ�.");
		break;
		case 3:
		case 4: System.out.println("���������� 16�� �Դϴ�.");
		break;
		case 5:
		case 6: System.out.println("���������� 17�� �Դϴ�.");
		break;
		case 7:
		case 8: System.out.println("���������� 18�� �Դϴ�.");
		break;
		case 9:
		case 10: System.out.println("���������� 19�� �Դϴ�.");
		break;
		case 11:
		case 12: System.out.println("���������� 20�� �Դϴ�.");
		break;
		case 13:
		case 14: System.out.println("���������� 21�� �Դϴ�.");
		break;
		case 15:
		case 16: System.out.println("���������� 22�� �Դϴ�.");
		break;
		case 17:
		case 18: System.out.println("���������� 23�� �Դϴ�.");
		break;
		case 19:
		case 20: System.out.println("���������� 24�� �Դϴ�.");
		break;
		
		default: System.out.println("���������� 25�� �Դϴ�.");
		break;

		}
		
		
		
		
/*���ڵ����		// �����������α׷� if��
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
���ڵ峡*/
		
	}
}
