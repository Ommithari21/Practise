package restapi.example.practise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import restapi.example.practise.Aop.BusinessAopExample;

@SpringBootApplication
public class PractiseApplication implements CommandLineRunner {

	private Logger logger=LoggerFactory.getLogger(getClass());

	private BusinessAopExample businessAopExample1;

	@Autowired
	public PractiseApplication(BusinessAopExample businessAopExample1) {
		this.businessAopExample1 = businessAopExample1;
	}

	public static void main(String[] args) {
		SpringApplication.run(PractiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

int data =businessAopExample1.calculateMax();
		logger.info("value returned {}",data);
	}
}
