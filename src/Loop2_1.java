/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´� 1~10���� ��������
 * ����ض� 1~10���� ������ ����ض�
 * 
 * @author smart04
 *
 */
public class Loop2_1 {

	public static void main(String[] args) {
		{
			int sum = 0;
			int i = 1;
			while (i <= 10) {
				System.out.printf("������ %d�� �̴�.\n", i);
				sum = sum + i;
				i++;

				System.out.printf("���ݱ��� �Ұ��?\n %d�̴�.\n", sum);
			}
			System.out.printf("���ݱ��� �� ���� %d �̴�.", sum);
		}
	}
}
