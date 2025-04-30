import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        /**
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());
        //字节流需要关闭
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = 0;
        while ((read = inputStream.read(bytes) )!= -1){
            System.out.println(new String(bytes, 0,read));
        }
         //必须关闭流和socket
        inputStream.close();
        outputStream.close();
        socket.close();
         */

/**
 *  Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
 *         OutputStream outputStream = socket.getOutputStream();
 *         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
 *         bufferedWriter.write("你好呀");
 *         bufferedWriter.newLine();//插入换行符表示写入内容结束，则不需要关闭socket，但要求对方使用readLine()读取
 *         //writer要刷新
 *         bufferedWriter.flush();
 *         InputStream inputStream = socket.getInputStream();
 *         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
 *         String s = bufferedReader.readLine();
 *         System.out.println(s);
 *         inputStream.close();
 *         outputStream.close();
 *         socket.close();
 */






    }
}
