/**
 * ��� ����ó�����α׷��� �ۼ��Ͻÿ�. ��������� 90���̻��̸� A, 80���̻��̸� B, 70���̻��̸� C 70�� �̸��̸� F ��
 * ����Ͻÿ�. �� : ���������� 59���̸� F�� ��µ˴ϴ�. if, switch�� �̿��Ͽ� ���� ���α׷��Ͻÿ�.
 * 
 * @author smart04
 *
 */
public class ControlFlow3 {

	public static void main(String[] args) {
		{
			// ����ó�����α׷� if��
			System.out.printf("����ó�����α׷� if��=====\n");
			{
				int jumsu = 85;
				if (jumsu >= 90) {
					System.out.printf("������ %d�� �Դϴ�.\n������ A�Դϴ�.\n", jumsu);
				} else if (jumsu >= 80) {
					System.out.printf("������ %d�� �Դϴ�.\n������ B�Դϴ�.\n", jumsu);
				} else if (jumsu >= 70) {
					System.out.printf("������ %d�� �Դϴ�.\n������ C�Դϴ�.\n", jumsu);
				} else {
					System.out.printf("������ %d�� �Դϴ�.\n������ F�Դϴ�.\n", jumsu);
				}
			}
		}
		{
			{
				// ����ó�����α׷� switch��
				System.out.printf("����ó�����α׷� switch��=====\n");
				int jumsu = 78;
				switch (jumsu / 10) {
				case 10:
					System.out.printf("������ %d�� �Դϴ�.\n������ A�Դϴ�.\n", jumsu);
					break;
				case 9:
					System.out.printf("������ %d�� �Դϴ�.\n������ A�Դϴ�.\n", jumsu);
					break;
				case 8:
					System.out.printf("������ %d�� �Դϴ�.\n������ B�Դϴ�.\n", jumsu);
					break;
				case 7:
					System.out.printf("������ %d�� �Դϴ�.\n������ C�Դϴ�.\n", jumsu);
					break;

				default:
					System.out.printf("������ %d�� �Դϴ�.\n������ F�Դϴ�.\n", jumsu);
					break;
				}
			}
		}
	}
}