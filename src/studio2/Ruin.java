package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("startAmount");
		int startAmount=in.nextInt();
		System.out.println("winChance");
		double winChance=in.nextDouble();
		System.out.println("winLimit");
		int winLimit=in.nextInt();
		System.out.println("totalSimulations");
		int stimes=in.nextInt();
		double ruins=0;
		for (int x=0; x<stimes;x++) {
			int y=startAmount;
			int winrounds=0;
			int lostrounds=0;
			while ( y<winLimit&&y>0) {
			double worl = Math.random();
			boolean win=(worl<=winChance);
			if (win==true) {
				y++;winrounds++;}
			else {
				y--;lostrounds++;}
			
			}
			
			if (y==10) {
				System.out.println("Simulation"+(x+1)+":"+winrounds+" Win");
				}
				else {
				System.out.println("Simulation"+(x+1)+":"+lostrounds+" Lost");
				ruins++;
		}
			
	}System.out.println("Actual ruin rate is "+ruins/stimes);
		if(winChance==0.5) {
			double out=1-startAmount/winLimit;
			System.out.println("expected ruin is"+out);
		}
		else {
			double a=(1-winChance)/winChance;
			double b=(Math.pow(a,startAmount))-Math.pow(a,winLimit);
			double c=b/(1-Math.pow(a,winLimit));
			System.out.println("expected ruin is "+c);
		}
		
	}
}