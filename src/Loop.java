/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´�
 * 
 * @author smart04
 *
 */
public class Loop {

	public static void main(String[] args) {
		{
			for (int i = 0; i < 10; i++) { // �ʱⰪ�� �Ϲ������� 0�� ����
				System.out.println(i + 1);
			}
			for (int i = 0; i < args.length; i++) {

			}
		}
		{
			for (int i = 1; i <= 10; i++) { // �ʱⰪ�� �Ϲ������� 0�� ����
				System.out.println(i);
			}
		}
		{
			for (int i = 10; i >= 1; i--) { // �ʱⰪ�� �Ϲ������� 0�� ����
				System.out.println(i);
			}
		}
	}
}
