/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´�. 2022�� 1���� ���ڸ�
 * ����Ͻÿ�(1~31) �ݺ��ؼ� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop5 {

	public static void main(String[] args) {
		int year = 2022; // �⵵ �Է�
		System.out.printf("���ش� %d�� �Դϴ�.\n", year);

		for (int month = 1; month <= 12; month++) { // �� ī����
			int lastDayOfMonth = 0;
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;
			default:
				lastDayOfMonth = 30;
				break;
			}
			System.out.printf("\n�̴��� %d�� �Դϴ�.--------------------------\n", month);

			{
				System.out.printf("%d���� �Ʒ��� �����ϴ�\n", month);
				for (int date = 1; date <= lastDayOfMonth; date++) {
					System.out.printf(" %d", date);
				}
				System.out.printf("\n------------------------------------------\n");
			}
		}
	}
}
