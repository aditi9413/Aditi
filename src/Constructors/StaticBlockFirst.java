package Constructors;
class  StaticBlockFirst
{
    static int a;  
    static
    {
        a = 4;
        System.out.println ("inside static block");
        System.out.println ("a = " + a);
    }    
    StaticBlockFirst()
    {
        System.out.println ("inside constructor");
        a = 10;
    }    
    public static void func()
    {
        a = a + 1;
        System.out.println ("a = " + a);
    }   
    public static void main(String[] args)
    {
 
    	 StaticBlockFirst obj = new  StaticBlockFirst();
        obj.func();
    }
}

