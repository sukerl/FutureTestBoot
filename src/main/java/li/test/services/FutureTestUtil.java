package li.test.services;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class FutureTestUtil {
	
	@Async("taskExecutor")
	public CompletableFuture<String> runFuture1() {

	    try {
	        TimeUnit.SECONDS.sleep(2);
	    } catch (InterruptedException e) {
	       throw new IllegalStateException(e);
	    }
	    return CompletableFuture.completedFuture("Result of Future 1:" +Thread.currentThread().getName());

	}
	
	@Async("taskExecutor")
	public CompletableFuture<String> runFuture2() {

	    try {
	        TimeUnit.SECONDS.sleep(2);
	    } catch (InterruptedException e) {
	       throw new IllegalStateException(e);
	    }
	    return CompletableFuture.completedFuture("Result of Future 2:" +Thread.currentThread().getName());

	}
	
	@Async("taskExecutor")
	public CompletableFuture<String> runFuture3() {

	    try {
	        TimeUnit.SECONDS.sleep(2);
	    } catch (InterruptedException e) {
	       throw new IllegalStateException(e);
	    }
	    return CompletableFuture.completedFuture("Result of Future 3:" +Thread.currentThread().getName());

	}

}
