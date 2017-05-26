/*
  Test reault:
  pqy@sda1:~/.../chapter4$ javac MathOps.java 
  pqy@sda1:~/.../chapter4$ java MathOps
  j: 59
  k: 56
  j + k: 115
  j - k: 3
  k / j: 0
  k * j: 3304
  k % j: 56
  j %= k: 3
  v: 0.5309454
  w: 0.0534122
  v + w: 0.5843576
  v - w: 0.47753322
  v * w: 0.028358962
  v / w: 9.940527
  pqy@sda1:~/.../chapter4$ 
  [pqy@sda1:0]  0:ss-local 1:bash                                           1.04 100% Fri 2017-05-26 22:16
 */

import java.util.*;

public class MathOps
{
    public static void main(String[] args)
    {
	Random rand = new Random(47);
	int i, j, k;

	j = rand.nextInt(100) + 1;
	System.out.println("j: " + j);
	k = rand.nextInt(100) + 1;
	System.out.println("k: " + k);
	i = j + k;
	System.out.println("j + k: " + i);
	i = j - k;
	System.out.println("j - k: " + i);
	i = k / j;
	System.out.println("k / j: " + i);
	i = k * j;
	System.out.println("k * j: " + i);
	i = k % j;
	System.out.println("k % j: " + i);
	j %= k;
	System.out.println("j %= k: " + j);
	
	float u, v, w;
	v = rand.nextFloat();
	System.out.println("v: " + v);
	w = rand.nextFloat();
	System.out.println("w: " + w);
	u = v + w;
	System.out.println("v + w: " + u);
	u = v - w;
	System.out.println("v - w: " + u);
	u = v * w;
	System.out.println("v * w: " + u);
	u = v / w;
	System.out.println("v / w: " + u);
    }
}
