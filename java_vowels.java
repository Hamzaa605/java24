/*
Vowels:
A E I O U

CONSONANTS

. B C D . F
G H . J K L
M N . P Q R
S T . Y W X
Y Z
*/

import java.util.*;
class java_vowels
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			System.out.println("It is vowels");
			break;
			
			default:
			System.out.println("It is CONSONANTS");
			
		}
	}
	}