package com.example.springbatchlibrary.tasklet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.lang.NonNull;

@Slf4j
public class CommonTasklet implements Tasklet {

    private final String field1;
    private final String field2;

    public CommonTasklet(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public RepeatStatus execute(@NonNull StepContribution contribution, @NonNull ChunkContext chunkContext) {

        log.info("field1: [{}], field2: [{}]", field1, field2);

        return RepeatStatus.FINISHED;
    }
}
