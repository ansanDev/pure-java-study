package Thread_ForkJoin_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
	private long workLoad = 0;
	
	public MyRecursiveAction(long workLoad) {
		this.workLoad = workLoad;
	}
	
	@Override
	protected void compute() {
		
		if(this.workLoad > 16) {
			System.out.println("Splitting workLoad : " + this.workLoad);
			
			List<MyRecursiveAction> subTasks =  new ArrayList<MyRecursiveAction>();
			
			subTasks.addAll(createSubtasks());
			
			for(RecursiveAction subtask : subTasks) {
				subtask.fork();
			}
		} else {
			System.out.println("Doing workLoad myself: " + this.workLoad);
		}
	}
	
	private List<MyRecursiveAction> createSubtasks(){
		List<MyRecursiveAction> subtasks = new ArrayList<MyRecursiveAction>();
		
		MyRecursiveAction subtask1 = new MyRecursiveAction(this.workLoad / 2);
		MyRecursiveAction subtask2 = new MyRecursiveAction(this.workLoad / 2);
		
		subtasks.add(subtask1);
		subtasks.add(subtask2);
		
		return subtasks;
	}
}
