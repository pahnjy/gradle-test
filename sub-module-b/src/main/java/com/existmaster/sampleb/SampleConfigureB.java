package com.existmaster.sampleb;

import com.existmaster.person.PersonConfigure;
import com.existmaster.person2.Person2Configure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by existmaster on 2016. 8. 5..
 */
@Configuration
@ComponentScan
@Import({PersonConfigure.class, Person2Configure.class})
@EnableAutoConfiguration
public class SampleConfigureB {
    public static void main(String[] args) {
        SpringApplication.run(SampleConfigureB.class, args);
    }
}
