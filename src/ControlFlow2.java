/**
 * ���
 * 
 * @author smart04
 *
 */
public class ControlFlow2 {

	public static void main(String[] args) {
		//Switch��
		//Ctrl+SpaceŰ�� ����Ͽ� �����⺻Ʋ ���
		int i = 2;
		
		switch (i) {
		case 1: System.out.printf("�Է��� ����%d�Դϴ�. ����1�Դϴ�",i); break;
		case 2: System.out.printf("�Է��� ����%d�Դϴ�. ����2�Դϴ�",i); break;
		case 3: System.out.printf("�Է��� ����%d�Դϴ�. ����3�Դϴ�",i); break;
		case 4: System.out.printf("�Է��� ����%d�Դϴ�. ����4�Դϴ�",i); break;
		case 5: System.out.printf("�Է��� ����%d�Դϴ�. ����5�Դϴ�",i); break;
		// break; ������ ������ ����ϰ� �������Ͷ�
		default:
			System.out.printf("1~5 ������ ���� �ƴմϴ�.");
			break;
		}
	}
}
