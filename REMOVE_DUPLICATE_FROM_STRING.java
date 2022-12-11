/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		 StringBuilder sb=new StringBuilder("shreyas");
		 for(int i=0;i<sb.length();i++){
		     for(int j=i+1;j<sb.length();j++){
		         if(sb.charAt(i)==sb.charAt(j))
		            sb.deleteCharAt(j);
		     }
		 }
		 System.out.println(sb);
	}
}

