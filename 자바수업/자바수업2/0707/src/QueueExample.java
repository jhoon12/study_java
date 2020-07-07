
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
			Queue<Message> messageQueue = new LinkedList<Message>();
			
			messageQueue.offer(new Message("sendMail", "ȫ�浿"));
			messageQueue.offer(new Message("sendSNS", "�ſ��"));
			messageQueue.offer(new Message("sendKaKaotalk", "ȫ�β�"));
			
			while(!messageQueue.isEmpty()) {
				Message message = messageQueue.poll();
				switch(message.comand) {
				case "sendMail":
					System.out.println(message.to+"�Կ��� ������ �����ϴ�.");
					break;
				case "sendSNS":
					System.out.println(message.to + "�Կ��� SNS�� �����ϴ�.");
					break;
				case "sendKaKaotalk":
					System.out.println(message.to + "�Կ��� ī�� �����ϴ�");
					break;
				}
			}
	}

}
