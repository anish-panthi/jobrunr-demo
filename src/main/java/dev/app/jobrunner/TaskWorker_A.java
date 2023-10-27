//package dev.app.jobrunner;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
///**
// * @author Anish Panthi
// */
//@Component
//public class TaskWorker_A {
//
//    @Value("${server.port}")
//    private int port;
//
////    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
//    public void processTask(String task){
//    System.out.println("Task received on Port: "+port);
//    }
//}
