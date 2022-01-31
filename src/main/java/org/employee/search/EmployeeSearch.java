package org.employee.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeSearch {

    public static void main(String[] args){
        SpringApplication.run(EmployeeSearch.class, args);
    }

    @Scheduled(initialDelay = 1000L, cron="* * * * * *")
    void someJob() throws InterruptedException{
        System.out.println("Now is " + new Date());
        Thread.sleep(1000L);
    }
}

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduling.enabled", matchIfMissing = true)
class SchedulingConfiguration{

}
