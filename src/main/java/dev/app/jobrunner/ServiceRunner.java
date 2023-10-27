//package dev.app.jobrunner;
//
//import dev.app.jobrunner.singleentity4multipletables.TableA;
//import dev.app.jobrunner.singleentity4multipletables.TableService;
//import lombok.RequiredArgsConstructor;
//import lombok.SneakyThrows;
//import org.jobrunr.scheduling.JobScheduler;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@RequiredArgsConstructor
//public class ServiceRunner implements CommandLineRunner {
//
//    private final JobScheduler jobScheduler;
//
//    private final TableService tableService;
//
//    private final TaskProducer taskProducer;
//    /**
//     * Callback used to run the bean.
//     *
//     * @param args incoming main method arguments
//     * @throws Exception on error
//     */
//    @Override
//    public void run(String... args) throws Exception {
////        jobScheduler.create(
////                JobBuilder.aJob()
////                        .withName("print-hello-world")
////                        .withAmountOfRetries(3)
////                        .withLabels("service-a")
////                        .withDetails(this::executeMe));
//
////        jobScheduler.create(
////          JobBuilder.aJob()
////              .withName("print-anish-world")
////              .withAmountOfRetries(5)
////              .withLabels("service-b")
////              .withDetails(this::executeRecurrentlyJob));
//
////        for(int i = 0; i < 50; i++) {
////            taskProducer.enqueueTask("Processing Task " + (i+1));
////        }
//
//        TableA tableA = new TableA();
//        tableA.setFirstName("Anish");
//        tableA.setLastName("Panthi");
//
//        tableService.saveToTable("TABLE_A", tableA);
//        tableService.saveToTable("TABLE_B", tableA);
//        tableService.saveToTable("TABLE_C", tableA);
//    }
//
//    public void executeMe() {
////        jobScheduler.schedule(
////                LocalDateTime.now().plusSeconds(30),
////                () -> System.out.println("I will say Hello World..."));
//    }
//
//    @SneakyThrows
//  public void executeRecurrentlyJob() {
////        String jobId = "batch-id-"+System.currentTimeMillis();
////                jobScheduler.scheduleRecurrently(
////                        jobId, Cron.every5minutes(), () -> System.out.println("Hello Anish from recurrently job..."));
////        BackgroundJob.delete(jobId);
//  }
//}
