package com.example.batchappone.config

import groovy.util.logging.Slf4j
import org.springframework.batch.core.ExitStatus
import org.springframework.batch.core.Job
import org.springframework.batch.test.JobLauncherTestUtils
import org.springframework.batch.test.context.SpringBatchTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import spock.lang.Specification

@SpringBootTest
@SpringBatchTest
@DirtiesContext
@Slf4j
class ExportUserJobIntegrationTest extends Specification {

    @Autowired
    JobLauncherTestUtils jobLauncherTestUtils


    @Autowired
    Job job

    def "job one"() {
        given: "job"
        jobLauncherTestUtils.setJob(job)

        when: "job launched"
        final var jobExecution = jobLauncherTestUtils.launchJob()

        then: "results are as expected"
        ExitStatus.COMPLETED == jobExecution.getExitStatus()

    }
}
