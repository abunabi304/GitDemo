Last login: Tue Jan  5 13:35:27 on ttys000
abunabi@Tashfias-iMac ~ % cd desktop
abunabi@Tashfias-iMac desktop % cd javalifecycle
abunabi@Tashfias-iMac javalifecycle % ls -al
total 40
drwxr-xr-x@ 7 abunabi  staff   224 Jan  5 13:35 .
drwx------@ 8 abunabi  staff   256 Jan  5 13:35 ..
-rw-r--r--@ 1 abunabi  staff  6148 Jan  5 12:51 .DS_Store
-rw-r--r--@ 1 abunabi  staff   122 Jan  5 13:35 HelloWorld.java
-rw-r--r--@ 1 abunabi  staff   499 Jan  5 13:05 HelloWorld.java.rtf
-rw-------  1 abunabi  staff   123 Jan  5 13:34 helloworld.java.save
drwxr-xr-x@ 2 abunabi  staff    64 Jan  5 13:23 tt
abunabi@Tashfias-iMac javalifecycle % javac hellowworld.java
error: file not found: hellowworld.java
Usage: javac <options> <source files>
use --help for a list of possible options
abunabi@Tashfias-iMac javalifecycle % ls -al                
total 40
drwxr-xr-x@ 7 abunabi  staff   224 Jan  5 13:35 .
drwx------@ 8 abunabi  staff   256 Jan  5 13:35 ..
-rw-r--r--@ 1 abunabi  staff  6148 Jan  5 12:51 .DS_Store
-rw-r--r--@ 1 abunabi  staff   122 Jan  5 13:35 HelloWorld.java
-rw-r--r--@ 1 abunabi  staff   499 Jan  5 13:05 HelloWorld.java.rtf
-rw-------  1 abunabi  staff   123 Jan  5 13:34 helloworld.java.save
drwxr-xr-x@ 2 abunabi  staff    64 Jan  5 13:23 tt
abunabi@Tashfias-iMac javalifecycle % javac helloworld.java 
helloworld.java:1: error: class, interface, or enum expected
Public class HelloWorld  {
^
helloworld.java:3: error: <identifier> expected
Public static void main(String args[]){
      ^
helloworld.java:4: error: illegal character: '\u201c'
System.out.println(“Welcome to Java Class”)
                   ^
helloworld.java:4: error: ';' expected
System.out.println(“Welcome to Java Class”)
                              ^
helloworld.java:4: error: illegal character: '\u201d'
System.out.println(“Welcome to Java Class”)
                                         ^
5 errors
abunabi@Tashfias-iMac javalifecycle % ls -al               
total 40
drwxr-xr-x@ 7 abunabi  staff   224 Jan  5 13:35 .
drwx------@ 8 abunabi  staff   256 Jan  5 13:35 ..
-rw-r--r--@ 1 abunabi  staff  6148 Jan  5 12:51 .DS_Store
-rw-r--r--@ 1 abunabi  staff   122 Jan  5 13:35 HelloWorld.java
-rw-r--r--@ 1 abunabi  staff   499 Jan  5 13:05 HelloWorld.java.rtf
-rw-------  1 abunabi  staff   123 Jan  5 13:34 helloworld.java.save
drwxr-xr-x@ 2 abunabi  staff    64 Jan  5 13:23 tt
abunabi@Tashfias-iMac javalifecycle % javac HelloWorld.java
HelloWorld.java:1: error: class, interface, or enum expected
Public class HelloWorld  {
^
HelloWorld.java:3: error: <identifier> expected
Public static void main(String args[]){
      ^
HelloWorld.java:4: error: illegal character: '\u201c'
System.out.println(“Welcome to Java Class”)
                   ^
HelloWorld.java:4: error: ';' expected
System.out.println(“Welcome to Java Class”)
                              ^
HelloWorld.java:4: error: illegal character: '\u201d'
System.out.println(“Welcome to Java Class”)
                                         ^
5 errors
abunabi@Tashfias-iMac javalifecycle % vim helloworld.java

public class HelloWorld{
  
public static void main(String args[]){
System.out.println(“Welcome to Java Class”);

}

}
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               

