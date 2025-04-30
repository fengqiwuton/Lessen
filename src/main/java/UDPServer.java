import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPServer {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket = new DatagramSocket(9999);
        //UDP采用DatagramPacket对象接受传递数据
        //最大64K
        byte[] bytes = new byte[1026];//1k
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        socket.receive(datagramPacket);
        //解包
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0,length);
        System.out.println(s);
    }
}
