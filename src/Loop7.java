import java.time.LocalDateTime;

/**
 * �ݺ��� for�� for(�ʱⰪ;���ǹ�;������){���๮} while�� {�ʱⰪ; while(���ǹ�){���๮;������} do~while��
 * �ʱⰪ; do{���๮;������(��������);}while(���ǹ�); do~while���� ���� ";"�����ݷ��� �ٴ´�. ����ð��� ����غ�����
 * 
 * @author smart04
 *
 */
public class Loop7 {

	public static void main(String[] args) {

		for (;;) {

			LocalDateTime ldt = LocalDateTime.now(); // ����ǻ���� �ð��� ������
			System.out.print(ldt.getHour() + ":");
			System.out.print(ldt.getMinute() + ":");
			System.out.printf("%d%n", ldt.getSecond());
			// System.out.print("\n");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}
}
