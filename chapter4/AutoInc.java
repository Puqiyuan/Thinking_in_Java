/*
  Test result:
  pqy@sda1:~/.../chapter4$ javac AutoInc.java 
  pqy@sda1:~/.../chapter4$ java AutoInc
  i: 1
  ++i: 2
  i++: 2
  i: 3
  --i: 2
  i--: 2
  i: 1
  pqy@sda1:~/.../chapter4$ 
  [pqy@sda1:0]  0:ss-local 1:bash                                           1.15 100% Fri 2017-05-26 22:22
 */

public class AutoInc
{
    public static void main(String[] args)
    {
	int i = 1;

	System.out.println("i: " + i);

	System.out.println("++i: " + ++i);
	System.out.println("i++: " + i++);
	System.out.println("i: " + i);
	System.out.println("--i: " + --i);
	System.out.println("i--: " + i--);
	System.out.println("i: " + i);
    }
}
