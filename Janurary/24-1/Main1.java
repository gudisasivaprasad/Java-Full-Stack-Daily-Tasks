/*2. TypeReversalUsingAbstractClass
Easy
100 points
• 130 min suggested
Problem Description
3) Write a java program to create an abstract class Type with abstract method reverse(). Create sub classes StringType & IntegerType that
extend the Type class & override reverse() method to reverse the given string & reverse the dig */
public class Main1{
    void main(){
        String str = IO.readln();
        int num = Integer.parseInt(IO.readln());

        Type s1 = new StringType(str);
        IO.println("Reversed String = " + s1.reverse());

        Type i1 = new IntegerType(num);
        IO.println("Reversed Integer = " + i1.reverse());
    }
}

abstract class Type{
    abstract String reverse();
}
class StringType extends Type{
    private String str;

    StringType(String str){
        this.str = str;
    }

    String reverse(){
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
class IntegerType extends Type{
    private int num;

    IntegerType(int num){
        this.num = num;
    }

    String reverse(){
        String rev = "";
        while(num > 0){
            int digit = num % 10;
            rev += digit;
            num = num / 10;
        }
        return rev;
    }
}