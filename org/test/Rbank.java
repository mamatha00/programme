package org.test;

public class Rbank implements Hbank{
	
	
public void deposit() {
	System.out.println("depoit6%");
}
public static void main(String[] args) {
	Rbank H=new Rbank();
	H.savings();
	H.deposit();
	
}
@Override
public void savings() {
	System.out.println("saving6%");
	
}




}
