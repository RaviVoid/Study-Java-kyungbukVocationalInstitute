import java.util.Scanner;

/**
 * (��,��,��,����,���) ����ó�����α׷��� �ۼ��Ͻÿ�
 * 
 * @author smart04
 *
 */
public class ArrayExam3 {

	public static void main(String[] args) {
		/**
		 * ������ ���� �迭 Ÿ��[] ������ ; Ÿ�� ������[]; int[] j = new int[2]; //2ĭ¥�� ��4����Ʈ�� ������ ���������
		 * �迭�� ���� Ÿ�Ը� ������ �ȴ�.
		 * �迭�� ũ�⸦ �����ϸ� �ø��ų� ���� �� ����.
		 **/
	
		//1���� �迭 ����
		System.out.println("1���� �迭 ����============");
		int [] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		//1���� �迭 ����
			
		//2���� �迭 ����
		System.out.println("2���� �迭 ����============");
		int [][] arr2 = new int [2][3];//�迭�� �ִ� ũ��� ������ -1�� �Ѵ�
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
		System.out.println(arr2[0].length);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		//2���� �迭 ����
	}

}
