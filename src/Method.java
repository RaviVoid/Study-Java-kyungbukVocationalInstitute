/**
 * ���ѷ�����Ű��
 * @author smart04
 *
 */
public class Method {

	public static void aaa() {//aaa�Լ�
		System.out.println("aaa()�Լ��� ȣ��Ǿ����ϴ�.");
		bbb();  
		/* method(function)
	       * �Լ�����
	       * ���������� public 
	       * �޸𸮿� �ö���ְ� ������ �� ���� �ֵ��� ���� static
	       * ��ȯ�� void
	       * �޼ҵ�� main
	       * �Ķ���� (String[] args) {
	       * return; //��ȯ���� ������ ����
	       * return ��ȯ��; //��ȯ���� ������ ��ȯ��(void) �κ��� Ÿ���� �ٲ��
	       * ex) ������ ��ȯ�ϸ� void�� int�� ����
	       * 
	       */
		
	}
	
	public static void bbb() {//bbb�Լ�
		System.out.println("bbb()�Լ��� ȣ��Ǿ����ϴ�.");
		ccc();
	}
	
	public static void ccc() {//ccc�Լ�
		System.out.println("ccc()�Լ��� ȣ��Ǿ����ϴ�.");
		aaa();
	}
	
	public static void main(String[] args) {// ���θ޼ҵ�
		aaa();
	}
	
}
