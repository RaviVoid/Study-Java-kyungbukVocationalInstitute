import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class Client {
     
    final static String SERVER_IP = "203.228.62.11";
    //final�� ����� ���� �� ���(���� �� �� ���� ���� ������ �� ����)
    //����� �������� ��� �빮�ڷ� ���, �ܾ�+�ܾ� = �ܾ�_�ܾ�
    final static int SERVER_PORT = 1225;
    //������� �ʴ� ��Ʈ�� ����Ѵ�. �ƴҰ�� �浹 �߻�
    //����:"cmd"���� "netstat -nao"�Է��ؼ� ������� ��Ʈ&���̵� Ȯ��
    final static String MESSAGE_TO_SERVER = "�ȳ�,�ϰ� ������?";
     
    public static void main(String[] args) {
         
        Socket socket = null;
        //Ŭ���̾�Ʈ ������ ������. ����������� ����
         
        try {
            /** ������� ���� */
            socket = new Socket(SERVER_IP,SERVER_PORT);
            //����� ���콺�� �ø��� surround with try/catch�ۼ�����
            //������ ����ڴ�, ������ ������
            //try = ����ó��, ����� �ȵ� ���� �����Ƿ� �ۼ�
            System.out.println("socket ����");
         
            /** Client���� Server�� ������ ���� ��� */
            OutputStream os = socket.getOutputStream();
            /** Server���� ���� ���� �ޱ� ���� ��� */
            InputStream is = socket.getInputStream();
             
            os.write( MESSAGE_TO_SERVER.getBytes() );
            os.flush();
             
            byte[] data = new byte[16];
            int n = is.read(data);
            final String resultFromServer = new String(data,0,n);
            System.out.println(resultFromServer);
            
            is.close();
            os.close();
            
            socket.close();
            //������ �������� �׻� �ݾ������
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}