package com.techymeet.Multithreading;
class Desert{
	
}
class Cake implements Runnable{
	
	public void run() {
		System.out.println("Mixing Ingredient for cake :"+Thread.currentThread().getId());
		System.out.println("Baking for cake :"+Thread.currentThread().getId());
		System.out.println("Completion for cake :"+Thread.currentThread().getId());
	}
}
public class ThreadBaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int cakeCount = 4;
        for(int i=0;i<cakeCount;i++) {
        	Cake cake = new Cake();
        	Thread thread = new Thread(cake);
        	thread.start();
        	thread.checkAccess();
        	thread.suspend();
        }
	}

}
