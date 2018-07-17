package xg.yxtk;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration

@SpringBootApplication
public class ServiceRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRedisApplication.class, args);

		Main.main(args);
	}
}
