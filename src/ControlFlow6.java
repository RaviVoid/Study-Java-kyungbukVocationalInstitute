/**
 * ����[1], ����[2], ��[3] �������α׷��� �ۼ��Ͻÿ�.
 * 
 * @author smart04
 *
 */
public class ControlFlow6 {

	public static void main(String[] args) {
		{
			int user1 = (int) ((Math.random() * 3) + 1);// ����
			int user2 = (int) ((Math.random() * 3) + 1);// ����

			System.out.println("[DEG]=" + user1);
			System.out.println("[DEG]=" + user2);

			int a1 = '��';
			int a2 = '��';
			int b1 = '��';
			int b2 = '��';
			int c1 = '��';

			// ���� ��� ���� ���
			if (user1 == 1) {
				System.out.printf("��(user1)�� %c%c�� �������ϴ�\n", a1, a2);
			} else if (user1 == 2) {
				System.out.printf("��(user1)�� %c%c�� �������ϴ�\n", b1, b2);
			} else {
				System.out.printf("��(user1)�� %c�� �������ϴ�\n", c1);
			}

			// ������ ��� ���� ���
			if (user2 == 1) {
				System.out.printf("����(user2)�� ������ �������ϴ�\n");
			} else if (user2 == 2) {
				System.out.printf("����(user2)�� ������ �������ϴ�\n");
			} else {
				System.out.printf("����(user2)�� ���� �������ϴ�\n");
			}

			// ������������ ��� ���� ���
			if (user1 == 1 && user2 == 1) {
				System.out.println("�����ϴ�.");
			} else if (user1 == 1 && user2 == 2) {
				System.out.println("�����ϴ�.");
			} else if (user1 == 1 && user2 == 3) {
				System.out.println("�̰���ϴ�.");
			} else if (user1 == 2 && user2 == 1) {
				System.out.println("�̰���ϴ�.");
			} else if (user1 == 2 && user2 == 2) {
				System.out.println("�����ϴ�.");
			} else if (user1 == 2 && user2 == 3) {
				System.out.println("�����ϴ�.");
			} else if (user1 == 3 && user2 == 1) {
				System.out.println("�����ϴ�.");
			} else if (user1 == 3 && user2 == 2) {
				System.out.println("�̰���ϴ�.");
			} else if (user1 == 3 && user2 == 3) {
				System.out.println("�����ϴ�.");
			}
		}
	}
}
