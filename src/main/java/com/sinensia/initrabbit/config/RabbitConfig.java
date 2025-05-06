package com.sinensia.initrabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	private String routingKey = "mi.routing.key"  ;
	
	@Bean
	Jackson2JsonMessageConverter messageConverter() {
	    return new Jackson2JsonMessageConverter();
	}
	
	// Exchanges
	
	@Bean("exchangeProductos")
	TopicExchange productosTopicExchange() {
		return new TopicExchange("exchange.productos");
	}
	
	@Bean("exchangeProductos1")
	TopicExchange productosTopicExchange1() {
		return new TopicExchange("exchange.productos1");
	}
	
	@Bean("exchangeProductos2")
	TopicExchange productosTopicExchange2() {
		return new TopicExchange("exchange.productos2");
	}
	
	@Bean("exchangeProductos3")
	TopicExchange productosTopicExchange3() {
		return new TopicExchange("exchange.productos3");
	}
	
	@Bean("exchangeProductos4")
	TopicExchange productosTopicExchange4() {
		return new TopicExchange("exchange.productos4");
	}
	
	@Bean("exchangeProductos5")
	TopicExchange productosTopicExchange5() {
		return new TopicExchange("exchange.productos5");
	}
	
	@Bean("exchangeProductos6")
	TopicExchange productosTopicExchange6() {
		return new TopicExchange("exchange.productos6");
	}
	
	// Colas
	
	@Bean("colaProductos")
	Queue colaProductos() {
		return new Queue("cola.productos", true);
	}
	
	@Bean("colaProductos1")
	Queue colaProductos1() {
		return new Queue("cola.productos1", true);
	}
	
	@Bean("colaProductos2")
	Queue colaProductos2() {
		return new Queue("cola.productos1", true);
	}
	
	@Bean
	Binding binding(Queue queue, TopicExchange topicExchange) {
		return BindingBuilder.bind(queue).to(topicExchange).with(routingKey);
	}
	
	/*
	@Bean
	Binding binding(Queue queue, TopicExchange topicExchange) {
		return BindingBuilder.bind(queue).to(topicExchange).with(routingKey);
	}
	*/
}
