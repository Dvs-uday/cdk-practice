

class outer
{
    int x=15;
    class inner
    {
        int y=20;
    }
}
public class Innerclass {
    public static void main(String[] args) {
        outer out=new outer();
        outer.inner inside = out.new inner();
        System.out.println("Outer class Value is "+ out.x);
        System.out.println("Inner class Value is "+ inside.y);
    }
    
}
