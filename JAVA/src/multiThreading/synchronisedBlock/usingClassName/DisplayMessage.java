package multiThreading.synchronisedBlock.usingClassName;

public class DisplayMessage {

	public void displayMethod(String name)
	{
		synchronized(DisplayMessage.class){
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
