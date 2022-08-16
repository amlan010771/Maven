package MavenGrp.MavenDemo;

 class Animal{
	 public Animal()
	 {
		 System.out.println("I am super constructor");
	 }
	 public String color="White";
	 public void  disp()
	{
		System.out.println("I am the disp method");
	}
}
class Dog extends Animal
{
	public Dog()
	{
		//System.out.println("Testing Begins");
		super();
		System.out.println(super.color);
		super.disp();
	}
	 public String color="Black";
	
	public void  disp1()
	{
		System.out.println("I am the disp child method");
		
	}
	
}


public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dg = new Dog();
        //dg.disp();
        //System.out.println(dg.color);
	}

}
