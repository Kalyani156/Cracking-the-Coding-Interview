
/**
Approach:


Count the total spaces in a string in one iteration, say the count is spaceCount
Calculate the new length of a string by newLength = length + 2*spaceCount; 
(we need two more places for each space since %20 has 3 characters, one character
will occupy the blank space and for rest two we need extra space)
Do another iteration in reverse direction
If you encounter the space, for next 3 spaces put %,2,0.
If you encounter the character, copy it
**/
import java.util.Scanner;

public class ReplaceSpacesWithTrueLength {
	
public static final char SPACE=' ';

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String s=scanner.nextLine();
	replaceSpacesWithTrueLength(s,13);
}
public static void replaceSpacesWithTrueLength(String s,int trueLength)
{
	char ch[]=s.toCharArray();
	int spaceCount=0;
	for(int i=0;i<trueLength;i++)
	{
		if(ch[i]==SPACE)
		{
			spaceCount++;
		}
	}
	int newLen=trueLength+spaceCount*2;
	char newChar[]=new char[newLen];
	for(int j=trueLength-1;j>=0;j--)
	{
		if(ch[j]!=SPACE)
		{
		newChar[newLen-1]=ch[j];
		newLen=newLen-1;
		}
		else
		{
			newChar[newLen-1]='0';
			newChar[newLen-2]='2';
			newChar[newLen-3]='%';
			newLen=newLen-3;
		}
		System.out.println(String.valueOf(newChar));
	}
}
}
