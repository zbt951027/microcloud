package cn.mldn.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApplication_9002 {
	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication_9002.class, args);
	}
}
