import java.util.Scanner;

/**
 * (��,��,��,����,���) ����ó�����α׷��� �ۼ��Ͻÿ�
 * 
 * @author smart04
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		/**
		 * ������ ���� �迭 Ÿ��[] ������ ; Ÿ�� ������[]; int[] j = new int[2]; //2ĭ¥�� ��4����Ʈ�� ������ ���������
		 **/
	
		ArrayExam4 ae = new ArrayExam4();

		System.out.println(ae); // �޸𸮻��� �ؽ��ڵ� ���� ���
		System.out.println("=============="); // ���м�

		System.out.println("=======�ǽ�����======="); // ���м�

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;

		kor = 50; // �������� �Է�
		eng = 80; // �������� �Է�
		math = 90; // �������� �Է�

		total = kor + eng + math;
		avg = total / 3;
		System.out.printf("����:%d, ����:%d, ����:%d\n", kor, eng, math);
		System.out.printf("����:%d, ���:%f\n", total, avg);
		System.out.println("=============="); // ���м�

		System.out.println("=======�迭�ǽ�����======="); // ���м�

		System.out.println("Ű���� �Է��� ��ٸ��ϴ�.");
		Scanner scan = new Scanner(System.in); // Ű���� �Է��� �޴´�.
		
		
		
		int[] grade = new int[5];
		double[] gradeAvg = new double[1];
		System.out.println("������� �Է��ϼ���?");
		grade[0] = scan.nextInt();
		System.out.println("������� �Է��ϼ���?");
		grade[1] = scan.nextInt();
		System.out.println("���м����� �Է��ϼ���?");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		gradeAvg[0] = grade[3] / 3;
		System.out.printf("����:%d, ����:%d, ����:%d\n", grade[0], grade[1], grade[2]);
		System.out.printf("����:%d, ���:%d\n", grade[3], grade[4]);
		System.out.printf("���:%f\n", gradeAvg[0]);
		System.out.println("=============="); // ���м�

		System.out.println("=======�迭�ǽ�����======="); // ���м�
		System.out.println("�ش�迭�� ���̴� = " + grade.length); // �ش� �迭�� ���̸� �� �� �ִ�

	}

}
