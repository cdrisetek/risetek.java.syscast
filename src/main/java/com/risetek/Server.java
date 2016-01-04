package com.risetek;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server extends Thread {

	@Override
	public void run() {
		DatagramSocket dgSocket = null;
		try {
			dgSocket = new DatagramSocket(80);
			receiveIP(dgSocket);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dgSocket != null)
				dgSocket.close();
		}
	}

	private void receiveIP(DatagramSocket dgSocket) throws Exception {
		while (true) {
			byte[] by = new byte[1024];
			DatagramPacket packet = new DatagramPacket(by, by.length);
			dgSocket.receive(packet);

			String str = new String(packet.getData(), 0, packet.getLength());

			System.out.println("Packet Size:" + str.length());
			System.out.println(str);
		}
	}
}
