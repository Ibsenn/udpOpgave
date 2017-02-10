package com.mycompany.udpeksempler;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;


public class UdpServer
{
    //Udp er connectionless og TCP er connectionbased. 
    //Som i at når en TCP laver forbindelse så er der et "handshake" 
    
    public static void main(String[] args) throws SocketException, IOException
    {
        DatagramSocket socket = new DatagramSocket(
                new InetSocketAddress("LocalHost", 8080));
        
        byte[] buffer = new byte[10]; 
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length); 
        
        socket.receive(packet);
        
        System.out.println(buffer);
    }
    
    /*
    Opgave 2: 
    Ip-address: 192.168.43.73
    DNS-address: 192.168.43.1
    MAC-address: Kan ikke finde det..
    Network Interfaces: 6...?
    Different kind of networks? 
    */
}
