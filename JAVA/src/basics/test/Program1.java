package basics.test;

public class Program1 {

	public static void main(String args[]){

        java.util.Vector<String> vc=new java.util.Vector<>();

        vc.add("111");
        vc.add("222");

        functioncall(vc);

        vc.add("333");

        System.out.println(vc);

    }

    public static void functioncall(java.util.Vector<String> vc){     

        vc=null;    

    }
	
}
