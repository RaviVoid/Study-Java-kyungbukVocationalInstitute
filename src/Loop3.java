/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´� 2022����� ������
 * ������� �ݺ��ؼ� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop3 {

	public static void main(String[] args) {
		{

			for (int i = 2022; i >= 1981; i--) {

				System.out.printf("���� ����� ����ΰ�? ������ %d���̴�. ���̴� %d���̴�.\n", i, (i - 1980));

			}
		}
		{
			int myAge = 1996;
			for (int i = 2022; i >= myAge; i--) {

				System.out.printf("�⵵ %d, ���� %d %n", i, i - (myAge-1)); // syso ���� Ctrl+Space ������ �ϼ���

			}
		}
	}
}
