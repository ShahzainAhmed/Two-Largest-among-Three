// Java program to find 2 largest numbers among 3.

import java.util.*;
public class TwoLargNum{
public static void main(String args[]){
System.out.println ("Enter any 3 numbers. ");
Scanner s = new Scanner (System.in);
int n1 = s.nextInt(); // Taking number 1 from the user.
int n2 = s.nextInt(); // Taking number 2 from the user.
int n3 = s.nextInt(); // Taking number 3 from the user.

if (n1<n2 && n1<n3){
System.out.println (n2 + " & " + n3 + " are the largest numbers "); }
else if (n2<n1 && n2<n3){
System.out.println (n1 + " & " + n3 + " are the largest numbers "); }  
else if (n3<n1 && n3<n2){
System.out.println (n1 + " & " + n2 + " are the largest numbers "); }
}
}

// Output: if the user gives the n1, n2 and n3 as 5, -2 and -1 respectively. Then the output would be, => "5 and -1 are the largest numbers." 

// Output: if the user gives the n1, n2 and n3 as 4, 19 and 22 respectively. Then the output would be, => "19 and 22 are the largest numbers." 


