/*
  Test result:
  pqy@sda1:~/.../chapter4$ javac Assignment.java 
  pqy@sda1:~/.../chapter4$ java Assignment
  1: t1.level: 9, t2.level: 47
  2: t1.level: 47, t2.level: 47
  3: t1.level: 27, t2.level: 27
  pqy@sda1:~/.../chapter4$ 
  [pqy@sda1:0]  0:ss-local 1:bash                                           1.16 100% Fri 2017-05-26 21:53
 */
class Tank
{
    int level;
}

public class Assignment
{
    public static void main(String[] args)
    {
	Tank t1 = new Tank();
	Tank t2 = new Tank();
	t1.level = 9;
	t2.level = 47;

	System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
	t1 = t2;
	System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
	t1.level = 27;
	System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
