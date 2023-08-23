package PrototypeDesignPattern;
// Cloneable implements on the class to which you wants to clone

class CloneCar implements Cloneable{
	
	int data;
	int conn;
	
	public CloneCar(int data, int conn) {
		this.data = data;
		this.conn = conn;
	}
	
	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         System.out.println( super.clone());
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
	
}

public class PrototypeDesign{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneCar cloneCar = new CloneCar(4,10);
		CloneCar cloneCarclone = null;
		cloneCarclone = (CloneCar)cloneCar.clone();
		cloneCarclone.data = 10;
		
		System.out.println(cloneCar.data+ " "+cloneCarclone.data);
		
		
	}
}

