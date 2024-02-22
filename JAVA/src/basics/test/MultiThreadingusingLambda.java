package basics.test;

public class MultiThreadingusingLambda {
	
	
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread running");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread running");
		}
	}
	

}
