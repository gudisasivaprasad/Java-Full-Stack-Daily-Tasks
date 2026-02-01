/*WAP to read your age from keyword with user input message ("Enter your Age :").
Display your age in the console.
Print a message based on the Age :
 * If age is greater than 17, You are allowed in the theatre for a Movie, else you
   are a minor, wait for some time.*/

   
   void main(){

    IO.println("Enter Your age");
    Integer Age = Integer.parseInt(IO.readln());
    if (Age > 17){
        IO.println("You are allowed in the theatre for a movie");
    }
    else{
        IO.println("YOu are a minor, wait for some time");
    }

    
   }