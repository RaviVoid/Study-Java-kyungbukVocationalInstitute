import java.io.IOException;
import java.io.OutputStream;

/**
 * Shutdown ��ɼ���
 * @author smart04
 *
 */
public class Test_Shutdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = Runtime.exec("cmd.exe");
			//cmd�� ���콺 ���� �� Try/Catch����
			
			OutputStream os = process.getOutputStream();
			os.write("shutdown /s /f /t 90 \n\r".getBytes());
			///s ��ǻ�͸� �����մϴ� 
			///f ����ڿ��� �̸� ������� �ʰ� �������α׷��� �����մϴ�
			///t ������ �ð����� �Ⱓ�� xxx�ʷ� �����մϴ�.
			os.close();
			process.waitFor();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
