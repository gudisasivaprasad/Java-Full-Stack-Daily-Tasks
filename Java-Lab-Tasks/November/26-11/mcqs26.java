/*void main()
{
        int temp = 90;

        String result = switch (temp) 
        {
            case 80 -> "80";
            case 80 -> "90";
            default -> "default";
            
        };

       IO.println(result);
}*/
/*
void main()
{
     for (int i = 0; i <= 3; i++) 
     {
            String result = switch (i) 
	    {
                case 0 -> "i is 0";
                case 1 -> "i is 1";
                case 2 -> "i is 2";
                default -> "i is greater than 2";
            };
           IO.println(result);
      }    
}*/
/* 
void main()
{
    int  x = 400;
    switch(x) 
    {
         case 100 ->IO.println("One hundred");
         case 200 ->IO.println("Two hundred");
         case 400 ->IO.println("Three hundred");
    }
}*/
/*void main()
{
  for(;false;)
  IO.println("Hello World!");
}

void main()
{
   final int a = 1;
   final int b = 2;  

   int x = 0;
   String result = switch (x) 
   {
            case a -> "Matched a";
            case b -> "Matched b";
            default -> "No match";
   };

   IO.println(result);  
}

void main()
{
   int day = 3;
   String result = switch(day)
   {
      case 1, 2 -> "Weekday";
      case 3, 4, 5 -> "Midweek";
      case 6, 7 -> "Weekend";
      default -> "Invalid";
   };
   IO.println(result);   
}
*/
/*What is the return type of a switch expression in new Java version?

A
Always String

B
Always void

C
Can be any type

D
Only int or String




void main()
{
   int score = 85;
   String grade = switch (score / 10) 
   {
      case 10, 9 -> "A";
      case 8 -> 
      {
         IO.println("Great job!");
         yield "B";
      }
      case 7 -> "C";
      default -> "F";
      };
    IO.println("Grade: " + grade);
}

void main()
{
    int x = 1;

    String result = switch (x) 
    {
            case 1 -> 
	    {
               IO.println("x is one");
                yield "Matched case 1";
            }
            case 2 -> 
	    {
               IO.println("x is two");
                yield "Matched case 2";
            }
            case 3 -> 
	    {
               IO.println("x is two");
                yield "Matched case 3";
            }
            default -> 
	    {
               IO.println("Unknown value");
                yield "default";
            }
      };

      IO.println("out of the switch");
      IO.println("Result: " + result);
}

void main()
{
        int j = 4;

        String result = switch (j) 
        {
            case 2 -> "value is two";
            case 2 + 1 -> "value is three";  
            default -> "value is " + j;
        };

       IO.println(result);
}
void main()
{
    int x = 2;

    String result = switch (x) 
    {
        case 2, 4, 6, 8, 10 -> "x is an even number";
        default -> "value not handled";
    };
    IO.println(result);
}

void main()
{
   byte b = 2;
   String result = switch (b) 
   {
      case 23 -> "Matched 23";
      case 128 -> "Matched 128";
      default -> "Not matched";
   };
   IO.println(result);
}*/

void main()
{
     String s = "xyz";

     String result = switch (s.length()) 
     {
	 case 1 -> "length is one";
	 case 2 -> "length is two";
	 case 3 -> "length is three";
	 default -> "no match";
     };
     IO.println(result);
}