package dev.app.jobrunner;

import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.jobrunr.configuration.JobRunr;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.server.JobActivator;
import org.jobrunr.storage.StorageProvider;
import org.jobrunr.storage.StorageProviderUtils;
import org.jobrunr.storage.sql.common.SqlStorageProviderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@RequiredArgsConstructor
public class JobRunrConfig {

  private final DataSource dataSource;

  @Bean
  @Profile("local")
  public JobScheduler initJobRunr(JobActivator jobActivator) {
    return JobRunr.configure()
        .useJobActivator(jobActivator)
        .useStorageProvider(initStorageProvider())
        .useBackgroundJobServer()
        .useDashboard()
        .initialize()
        .getJobScheduler();
  }

  @Bean
  @Profile("local")
  public StorageProvider initStorageProvider() {
    return SqlStorageProviderFactory.using(
        dataSource, "JOBRUNR.", StorageProviderUtils.DatabaseOptions.SKIP_CREATE);
  }

  @Bean
  @Profile("local_h2")
  public JobScheduler initJobRunrForH2(JobActivator jobActivator) {
    return JobRunr.configure()
        .useJobActivator(jobActivator)
        .useStorageProvider(SqlStorageProviderFactory.using(dataSource))
        .useBackgroundJobServer()
        .useDashboard()
        .initialize()
        .getJobScheduler();
  }
}
