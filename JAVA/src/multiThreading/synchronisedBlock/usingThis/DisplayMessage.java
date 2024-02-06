package multiThreading.synchronisedBlock.usingThis;

public class DisplayMessage {

	public void displayMethod(String name)
	{
		synchronized(this){
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello "+name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
