package com.rbsamplesprngcamelmongo.demo.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class UserMessageRouter extends RouteBuilder{

	private static final String RABBITMQ_XCHG_USR_MSG = "rabbitmq://localhost/XCHG-USRMSG?exchangeType=direct&queue=USRMSGQ&routingKey=usrMsgk&autoDelete=false";
	private static final String MONGODB_XCHG_USR_MSG_SAVE = "mongodb3:mongoBean?database=userdb&collection=user&operation=save";
	
	@Override
	public void configure() throws Exception {

		from(RABBITMQ_XCHG_USR_MSG)
		.log("${body}")
		.convertBodyTo(String.class)
		//.convertBodyTo(User.class)
		.to(MONGODB_XCHG_USR_MSG_SAVE);		
	}

}
