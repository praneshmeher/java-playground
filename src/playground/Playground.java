package playground;

public class Playground {

	{
        System.out.println("init");
    }
	Playground()
    {
        System.out.println("default");
    }
	Playground(int x)
    {
        System.out.println(x);
    }
 
    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }
    public static void main(String args[])
    {
        new Playground();
        new Playground(10); 
    }

}
