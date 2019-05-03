package home;

public class TabularOutput {
	public static void main(String[] args){
		int n;
		System.out.printf("%5c %3d*N %2d*N %1d*N%n",'N',10,100,1000);
		for(n=0;n<5;n++) {
			System.out.printf("%5d %5d %5d %5d %n",n+1,(n+1)*10,(n+1)*100,(n+1)*1000);
		}
	}

}
