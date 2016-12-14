# Cracking-the-Coding-Interview
URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.) EXAMPLE Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"

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
