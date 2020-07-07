
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
			Queue<Message> messageQueue = new LinkedList<Message>();
			
			messageQueue.offer(new Message("sendMail", "È«±æµ¿"));
			messageQueue.offer(new Message("sendSNS", "½Å¿ë±Ç"));
			messageQueue.offer(new Message("sendKaKaotalk", "È«µÎ²²"));
			
			while(!messageQueue.isEmpty()) {
				Message message = messageQueue.poll();
				switch(message.comand) {
				case "sendMail":
					System.out.println(message.to+"´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
					break;
				case "sendSNS":
					System.out.println(message.to + "´Ô¿¡°Ô SNS¸¦ º¸³À´Ï´Ù.");
					break;
				case "sendKaKaotalk":
					System.out.println(message.to + "´Ô¿¡°Ô Ä«Åå º¸³À´Ï´Ù");
					break;
				}
			}
	}

}
