/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´�. 2022�� 1���� ���ڸ�
 * ����Ͻÿ�(1~31) �ݺ��ؼ� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop4_1 {

	public static void main(String[] args) {
		int year = 2022; // �⵵ �Է�
		int month = 1; // �� �Է�
		System.out.printf("���ش� %d�� �Դϴ�.\n", year);
		System.out.printf("�̴��� %d�� �Դϴ�.\n", month);
		{
			System.out.printf("%d���� �Ʒ��� �����ϴ�\n", month);
			int date = 1;
			while (date <= 31) {
				System.out.printf(" %d", date);
				date++;
			}
		}
	}
}
