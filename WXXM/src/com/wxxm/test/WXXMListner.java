package com.wxxm.test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class WXXMListner implements MessageListener {
	public void onMessage(Message message)  {
		// TODO Auto-generated method stub
	            try {
					System.out.println("消息订阅者收到的消息："+((TextMessage)message).getText());
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	        
	} 
}
