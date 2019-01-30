//this program generates an otp of 4 digits;
package otpa4;
import java.util.*;

public class Otp {
public static void main(String[] args)
{
	int myotp;
	//random is a defined class in java which is in util  and here rd is the object of random class just  like we make an object of scanner class
	Random rd=new Random();
	myotp=rd.nextInt(8999)+1000;
	System.out.println(myotp);
}
}
