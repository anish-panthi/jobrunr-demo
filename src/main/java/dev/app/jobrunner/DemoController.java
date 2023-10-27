package dev.app.jobrunner;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Log4j2
public class DemoController {

  private final RecurringJobService recurringJobService;

  @GetMapping(value = "/create-scheduler/{service-name}/{client-cd}/{batch-id}")
  public ResponseEntity<Void> startProcessorScheduler(
      @PathVariable("service-name") String serviceName,
      @PathVariable("client-cd") String clientCd,
      @PathVariable("batch-id") String batchId) {

    try {
      recurringJobService.scheduleProcessorScheduler(batchId, clientCd, serviceName);
    } catch (Exception e) {
      log.error("Error while scheduling job: {}", (Object) e.getStackTrace());
    }
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
