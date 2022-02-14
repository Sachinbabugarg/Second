package Vec;
import java.util.*;
public class VecTor {
public static void main(String[]args)
{
	Vector v=new Vector();
        Vector v1=new Vector();
        Vector v2=new Vector();
	System.out.println(v.capacity());
	for(int i=1;i<=10; i++)
	{
		v.addElement(i);
	}
	System.out.println(v);
	System.out.println(v.capacity());
	v.addElement("11");
	System.out.println(v);
	System.out.println(v.capacity());
	
}
}
