package li.test.services;

import java.sql.Timestamp;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	FutureTestUtil futureTestUtil;
	
	@Scheduled(cron="0 */1 * * * *")
	public void run() throws InterruptedException, ExecutionException {
		
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		CompletableFuture<String> future1 = futureTestUtil.runFuture1();
		CompletableFuture<String> future2 = futureTestUtil.runFuture2();
		CompletableFuture<String> future3 = futureTestUtil.runFuture3();

		CompletableFuture.allOf(future1, future2, future3).get();

		System.out.println(future1.get());
		System.out.println(future2.get());
		System.out.println(future3.get());
		
		System.out.println(new Timestamp(System.currentTimeMillis()));
	}

}
