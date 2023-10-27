//package dev.app.jobrunner;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.stereotype.Component;
//
///**
// * @author Anish Panthi
// */
//@Component
//@RequiredArgsConstructor
//public class TaskProducer {
//
//    private final RabbitTemplate rabbitTemplate;
//
//    public void enqueueTask(String task){
//        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, task);
//    System.out.println("Task enqueued: "+ task);
//  }
//}
