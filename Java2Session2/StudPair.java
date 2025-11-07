package Java2Session2;

import java. util .*;
public class StudPair<T, U> {
private T name;
private U rollNumber;
public StudPair (T nmObj, U rollNo) {
this.name = nmObj;
this.rollNumber = rollNo;
}
public T displayName () {
return name;
}
public U displayNumber () {
return rollNumber;
}
public static void main (String [] args) {
StudPair<String, Integer> studObj = new
StudPair<>("John",2);
System. out.println ("Student Name:");
System.out.println (studObj.displayName());
System.out.println ("Student Number:");
System.out.println (studObj.displayNumber());
}
}