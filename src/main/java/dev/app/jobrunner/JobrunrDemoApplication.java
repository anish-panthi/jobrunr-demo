package dev.app.jobrunner;

import javax.sql.DataSource;
import lombok.extern.log4j.Log4j2;
import org.jobrunr.configuration.JobRunr;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.server.JobActivator;
import org.jobrunr.storage.StorageProviderUtils;
import org.jobrunr.storage.sql.common.SqlStorageProviderFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Log4j2
public class JobrunrDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(JobrunrDemoApplication.class, args);
  }

}
