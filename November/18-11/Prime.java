/*5) Write a Java program to verify whether a number is prime or not where number must be taken from command line argument. */

void main( String[] args){

  int a = Integer.parseInt(args [0]);
  int count = 0;
  for(int i = 1 ; i < a; i++){
      if(a % i == 0){
        count++;
      }
  }
    if ( count == 1){
    IO.println("Number is Prime");
    }
    else{
    IO.println("Number is not Prime");
    }
  
}
