//armstrom no
import javax.swing.*;
class arm
{
public static void main(String[]args)
{
	String num=JOptionPane.showInputDialog("enter any no:");
		int n=Integer.parseInt(num);
		int a=n%10;
		int b=n/10;
		int c=b%10;
		int d=b/10;
		int e=d*d*d;
		int f=c*c*c;
		int g=a*a*a;
		int A=e+f+g;
		if(n==A)
		{
			System.out.println("no is armstrom no:"+A);
		}
		else
		{
			System.out.println("no is not armstrom no:"+A);
		}
}
}