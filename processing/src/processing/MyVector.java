package processing;

import java.util.concurrent.Exchanger;
public class MyVector extends Thread  {
	public class Vector{
	int [] vector;
	Vector(int ... vector){
		this.vector=vector;
		
	}
	
	public int max() {
		int max=vector[0];
		for(int i:vector) {
			if(max<i)max=i;
		}
		return max;
	}
	public void showVector() {
		for(int i:vector) {
			System.out.print(" " + i+" ");
		}
	}}
	}
	@Override
	public void run() {
		public int summa() {
			int sum=0;
			for(int i:vector) {
				sum+=i;
				sleep(500);
			}
			return sum;
		}
	}

}
