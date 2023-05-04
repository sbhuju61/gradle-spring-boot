package com.example.batchapptwo.config;

import com.example.springbatchlibrary.tasklet.CommonTasklet;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ImportUserJob {
    @Bean
    public Job importJob(JobRepository jobRepository, Step step1) {
        return new JobBuilder("job2", jobRepository)
                .incrementer(new RunIdIncrementer())
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JobRepository jobRepository,
                      PlatformTransactionManager transactionManager
            , CommonTasklet commonTasklet) {

        return new StepBuilder("step1", jobRepository)
                .tasklet(commonTasklet, transactionManager)
                .build();
    }

    @Bean
    CommonTasklet commonTasklet() {
        return new CommonTasklet("from", "batch app two");
    }

}
