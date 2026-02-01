/*2) WAP to calculate telephone bill  For 100 free call rental = 360 [fixed charge]
For 101 - 250, 1 Rs per call
For 251 - unlimited , 1.2 Rs per call
Calculate the final bill*/

void main(String[] args)
{
    IO.println("Enter no of calls:");
    int call = Integer.parseInt(IO.readln());
    if ( call > 0 && call <= 100){
    IO.println("telephone bill:" + 360);
    }
    else if (call > 100 && call < 251){
    IO.println("telephone bill:" + (360+(call - 100)*1));
    }
    else if (call > 100 && call < 251){
    IO.println("telephone bill:" + (360+(call - 250)*1.2));
    }
}
