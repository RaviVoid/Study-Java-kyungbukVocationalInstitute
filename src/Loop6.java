/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´�. ����ð��� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop6 {

	public static void main(String[] args) {
		int hour = 0, min = 0, sec = 0; // ��hour,��min,��sec ��������
		hour = 14; // �ð� �Է�
		min = 20; // �� �Է�
		sec = 3; // �� �Է�
		int sumSec = (hour * 60 * 60) + (min * 60) + (sec);

		sumSec++;

		System.out.println(sumSec); // ����2�� 20�п� �ش��ϴ� ��ü��
		System.out.println(sumSec / (60 * 60)); // ���� �ð� 14
		System.out.println((sumSec / (60)) % 60); // ���� �� 1203
		System.out.println(sumSec % (60)); // ���� ��

		for (;;) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
