/*
  partly test result:
  pqy@sda1:~/.../chapter3$ java ShowProperties | head
  -- listing properties --
  java.runtime.name=OpenJDK Runtime Environment
  sun.boot.library.path=/usr/lib/jvm/java-8-openjdk-amd64/jre...
  java.vm.version=25.111-b14
  user.country.format=CN
  java.vm.vendor=Oracle Corporation
  java.vendor.url=http://java.oracle.com/
  path.separator=:
  java.vm.name=OpenJDK 64-Bit Server VM
  file.encoding.pkg=sun.io
  pqy@sda1:~/.../chapter3$
*/

import java.util.*;

public class ShowProperties
{
    public static void main(String[] args)
    {
	System.getProperties().list(System.out);
	System.out.println(System.getProperty("user.name"));
	System.out.println(System.getProperty("java.library.path"));
    }
}
