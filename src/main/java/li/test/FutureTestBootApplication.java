package li.test;

import java.util.concurrent.ExecutionException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class FutureTestBootApplication {

//	@Autowired
//	FutureTestUtil futureTestUtil;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		SpringApplication.run(FutureTestBootApplication.class, args);

	}
/*
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			CompletableFuture<String> future1 = futureTestUtil.runFuture1();
			CompletableFuture<String> future2 = futureTestUtil.runFuture2();
			CompletableFuture<String> future3 = futureTestUtil.runFuture3();

			CompletableFuture.allOf(future1, future2, future3).get();

			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());

		};
	}
*/
}
