/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´� 2022����� ������
 * ������� �ݺ��ؼ� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop3_1 {

	public static void main(String[] args) {

		int i = 2022;
		while (i >= 1981) {

			System.out.printf("������ %d���̴�. ���̴� %d���̴�.\n", i, (i - 1980));
			i--;
		}
		i = 2022;
		int myAge = 1996;
		while (i >= myAge) {

			System.out.printf("�⵵ %d, ���� %d %n", i, i - (myAge - 1)); // syso ���� Ctrl+Space ������ �ϼ���
			i--;
		}

	}
}
