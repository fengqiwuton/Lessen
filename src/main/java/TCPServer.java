import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        /**
         * ServerSocket serverSocket = new ServerSocket(9999);
         *         System.out.println("waiting");
         *         Socket socket = serverSocket.accept();
         *         System.out.println("服务器  socket = " + socket.getClass());
         *         InputStream inputStream = socket.getInputStream();
         *         byte[] bytes = new byte[1024];
         *         int read = 0;
         *         while ((read = inputStream.read(bytes) )!= -1){
         *             System.out.println(new String(bytes, 0,read));
         *         }
         *         //关闭
         *         OutputStream outputStream = socket.getOutputStream();
         *         outputStream.write("hello client".getBytes());
         *         socket.shutdownInput();
         *         inputStream.close();
         *         outputStream.close();
         *         socket.close();
         *         serverSocket.close();
         */

        /**
         *  ServerSocket serverSocket = new ServerSocket(9999);
         *         System.out.println("waiting");
         *         Socket socket = serverSocket.accept();
         *         System.out.println("服务器  socket = " + socket.getClass());
         *         InputStream inputStream = socket.getInputStream();
         *         //用inputStreamReader将inputStream 转为字符流
         *         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
         *         String s = bufferedReader.readLine();
         *         System.out.println(s);
         *         OutputStream outputStream = socket.getOutputStream();
         *         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
         *         bufferedWriter.write("你也好，客户");
         *         bufferedWriter.newLine();
         *         bufferedWriter.flush();
         *         inputStream.close();
         *         outputStream.close();
         *         socket.close();
         *         serverSocket.close();
         */

    }
}
