/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´�
 * 1~10���� �������� ����ض�
 * 1~10���� ������ ����ض�
 * @author smart04
 *
 */
public class Loop2 {

	public static void main(String[] args) {
		{
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum = sum + i;
				System.out.printf("���° ����ΰ�? ������ %d�� �̴�.\n", i);
				System.out.printf("���ݱ��� �Ұ��?\n %d�̴�.\n", sum);				
			}
			System.out.printf("���ݱ��� �� ���� %d �̴�.", sum);
		}
	}
}
