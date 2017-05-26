/*
  Test result:
  pqy@sda1:~/.../chapter4$ javac Precedence.java 
  pqy@sda1:~/.../chapter4$ java Precedence
  a = 5 b = 1
  pqy@sda1:~/.../chapter4$ 
  [pqy@sda1:0]  0:ss-local 1:bash                                           1.25 100% Fri 2017-05-26 21:44
 */
public class Precedence
{
    public static void main (String[] args)
    {
	int x = 1, y = 2, z = 3;
	int a = x + y - 2/2 + z;
	int b = x + (y - 2)/(2 + z);
	System.out.println("a = " + a + " b = " + b);
    }
}
