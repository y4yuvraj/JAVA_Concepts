package basics.test;

public class Main extends Child{
    int x;

    public Main(int x) {
       	super(x);
       	this.x=x;
    }

    public static void main(String[] args) {
    	Main main=new Main(10);
    	System.out.println(main.x);
    }
}

class Child
{
    int x=0;

    public Child(int x) {
        this.x = x;
    }
}