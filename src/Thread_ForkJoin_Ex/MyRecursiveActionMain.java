package Thread_ForkJoin_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveActionMain {
	public static void main(String[] ags) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		MyRecursiveAction myRecursiveAction = new MyRecursiveAction(24);
		forkJoinPool.invoke(myRecursiveAction);
	}
}
