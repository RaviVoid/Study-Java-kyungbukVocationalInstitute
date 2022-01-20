import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

	final static int SERVER_PORT = 1225;
	// Ŭ���̾�Ʈ�� ������ ��Ʈ�� �ݵ�� ��ġ�ؾ���
	final static String MESSAGE_TO_SERVER = "�Գ�,Ŭ��~�ݰ���!";

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		// ���� ������ ������. ����������� ����

		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			// ����� ���콺�� �ø��� surround with try/catch�ۼ�����
			// ������ ����ڴ�, ������ ������
			// try = ����ó��, ����� �ȵ� ���� �����Ƿ� �ۼ�

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			while (true) {
				System.out.println("socket ���� ���");
				Socket socket = serverSocket.accept();
				System.out.println("host : " + socket.getInetAddress() + " | ��� ���� ����");

				//Read/Write�ϴ� �κ� ����===================================
				/** Server���� ���� ���� �ޱ� ���� ��� */
				InputStream is = socket.getInputStream();
				// ��ü�� ���鶧�� ���ʿ��� �빮�ڸ� ���´� IS

				/** Server���� Client�� ������ ���� ��� */
				OutputStream os = socket.getOutputStream();

				byte[] data = new byte[16];
				// 16�ڸ� ���۸� ����ڴ�. 16���� �ѹ��� �ű�ڴ�.

				int n = is.read(data);
				// ������ ������ �����͸� �д´�.

				final String messageFromClient = new String(data, 0, n);
				//0���� n(16)���� �аڴ�.

				System.out.println(messageFromClient);

				os.write(MESSAGE_TO_SERVER.getBytes());
				//����Ʈ�� �迭�� �ִ� ��. ��Ʈ���� ����Ʈ�� �迭�� �ִ´�.
				
				os.flush();

				is.close();
				//��Ʈ���� �ݾ��ش�
				os.close();
				//��Ʈ���� �ݾ��ش�
				//Read/Write�ϴ� �κ� ����===================================
				
				socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class SocketRun implements Runnable {

	private Socket socket = null;

	SocketRun(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

	}
}