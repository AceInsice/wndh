package xg.yxtk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "xg.yxtk.mapper")
public class WndhSsoServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(WndhSsoServicesApplication.class, args);
    }
}
