package dev.app.jobrunner;

import lombok.RequiredArgsConstructor;
import org.jobrunr.scheduling.JobBuilder;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.scheduling.cron.Cron;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecurringJobService {

  private final JobScheduler jobScheduler;

  public void scheduleProcessorScheduler(String batchId, String clientCode, String serviceName) {
    String jobId = batchId + "-" + clientCode + "-" + serviceName;
    jobScheduler.create(
        JobBuilder.aJob()
            .withName("processor-scheduler")
            .withAmountOfRetries(2)
            .withLabels("service-b")
            .withDetails(() -> startRecurrentlyJob(jobId)));
  }

  public void startRecurrentlyJob(String jobId) {
    jobScheduler.scheduleRecurrently(
        jobId, Cron.minutely(), () -> System.out.println("Hello Anish from recurrently job..."));
    //    BackgroundJob.delete(jobId);
  }
}
