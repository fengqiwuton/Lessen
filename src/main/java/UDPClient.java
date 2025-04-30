
import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] bytes = "hello".getBytes();
        DatagramPacket datagramPacket =
                new DatagramPacket(bytes, bytes.length,
                        InetAddress.getByName("10.26.192.51"), 9999);

        datagramSocket.send(datagramPacket);
        //关闭资源
        datagramSocket.close();

    }

}
