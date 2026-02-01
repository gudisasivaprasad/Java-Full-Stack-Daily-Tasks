/*Program 07:
-----------
Write a Java program to check if a given number is a palindrome or not. A number is a palindrome if it remains the same when its digits are reversed.*/
void main(String[] args) 
	{
		IO.print("Enter a number : ");
		int num = Integer.parseInt(IO.readln());
		int temp = num;
		int rev = 0;
		while(num!=0){
			int rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		if(rev == temp){
			IO.println(temp+" is palindrome");
		}else{
			IO.println(temp+" is not palindrome");
		}
	}
