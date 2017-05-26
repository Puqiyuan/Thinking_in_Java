/*
  Test result:
  pqy@sda1:~/.../chapter4$ javac PassObject.java 
  pqy@sda1:~/.../chapter4$ java PassObject
  1: x.c: a
  2: x.c: z
  pqy@sda1:~/.../chapter4$ 
  [pqy@sda1:0]  0:ss-local 1:bash                                           1.14 100% Fri 2017-05-26 22:01
*/

class Letter
{
    char c;
}

public class PassObject
{
    static void f(Letter y)
    {
	y.c = 'z';
    }


    public static void main(String[] args)
    {
	Letter x = new Letter();
	x.c = 'a';
	System.out.println("1: x.c: " + x.c);
	f(x);
	System.out.println("2: x.c: " + x.c);
    }
}
