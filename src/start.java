
//import static java.lang.System.out;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class start 
{
    public static void main  (String args[])
    {
    	Executor executor = Executors.newSingleThreadExecutor();
    	
    	Runnable task = () -> System.out.print("Hello Estherly\n");
    	Runnable task2 = () -> System.out.print("Test\n");
       
    	executor.execute(task);
    	executor.execute(task2);
    	test();
    	executor.execute(task);
    	
    	//System.exit(0); 
    }
    
    
    public static void test()
    {
    	
    	
    	
    }
}
