import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpClient
{
    public static void main(String[] args) throws SocketException, IOException
    {
        DatagramSocket socket = new DatagramSocket(); 
        
        socket.connect(new InetSocketAddress("LocalHost", 8080));
        
        byte[] bytes = "Hello world".getBytes(); 
        socket.send(new DatagramPacket(bytes, bytes.length));
    }
}
