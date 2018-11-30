
public class CreateThreadJavaEight {

	public static void main(String[] args) {
	
		Runnable runs = ()-> {
				for(int i=0;i<11;i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						//-generated catch block
						e.printStackTrace();
					}
				}
			};
			Thread t1 = new Thread(runs);
			t1.start();
	}
}
