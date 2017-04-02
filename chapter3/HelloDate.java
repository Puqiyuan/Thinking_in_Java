/*
  test result:
  pqy@sda1:~/.../chapter3$ java HelloDate
  Hello, it's:
  Sun Apr 02 22:39:04 CST 2017
 */

import java.util.*;

public class HelloDate
{
    public static void main(String[] args)
    {
	System.out.println("Hello, it's:");
	System.out.println(new Date());
    }
}
