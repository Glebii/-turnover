package com.example.appliances.config;

import com.example.appliances.service.impl.SpringSecurityAuditorAwareServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaAuditing
public class AuditBeanConfig {
    @Bean
    public AuditorAware<String> aware() {
        return new SpringSecurityAuditorAwareServiceImpl();
    }
}
