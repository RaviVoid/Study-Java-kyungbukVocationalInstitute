
public class Variable2 {

	public static void main(String[] args) {
		byte b = 127;
		short s = 1;
		int i = 10;
		long l = 10L;
		// long�� �ڿ� L���ͷ��� �ִ´�
		double d = 10.0;
		double d2 = 0.0;
		// double�� �ڿ� D�� ������ ������ �����ϴ�
		double d3 = 0; // ���� �����ʾƵ� �����̵Ǵµ� ����?
		// �Ǽ��� "."�� �ݵ�� �־���Ѵ�.
		// ex. 0., .0, 0.0 ����
		float f = .0F;
		// float�� �ݵ�� �ڿ� F or f�� �����Ѵ�.
		char c = 'A';
		boolean sw = true;
		boolean sw2 = false;

		System.out.println(sw);
		System.out.println(d3 + 1);
		System.out.println("��\t��ŭ���");
		System.out.println("��\n��\n���ٹٲ㾴��");
		System.out.println("��\"����ǥ���");
		System.out.println("Ȭ\'����ǥ���");
		System.out.println("��\\���������");
		System.out.println("�������1\b��");
		System.out.println("�������2\f��");
		System.out.println("�������3\r��");
	}
}

// ������ (�迭, ��ü)
// int[] iA = new int[3];
// iA[0]=1; //ù��°�濡 1
// iA[1]=2; //�ι�°�濡 2
// iA[2]=3; //����°�濡 3
// int�� 4����Ʈ�̹Ƿ� 4����Ʈ 3ĭ�� ���������
// iA���� �ּҰ��� ����ȴ�(����)
