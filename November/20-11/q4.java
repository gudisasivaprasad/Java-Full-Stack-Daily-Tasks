/*
Assignment 04 :
----------------
WAP to read your gender from keyword with user input message ("Enter your Gender[M/F] :").
Based on the gender give the follwing message.

Output format :

Enter your Gender :Male
Your gender is :M
Welcome Sir

Enter your Gender :Female
Your gender is :F
Welcome Madam */

void main(){
    IO.println("Enter Your Gender (M/F)");//m f String
    String gender = IO.readln();//String 
    char ch = gender.charAt(0);
    if( ch == 'M'){
        IO.println("Welcome Sir");
    }
    else if(ch == 'F'){
        IO.println("Welcome madam");
        
    }

}