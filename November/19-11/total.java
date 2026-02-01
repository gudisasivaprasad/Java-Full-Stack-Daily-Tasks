/*Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.*/

void main(){
  IO.println("Enter basic salary:");
  int basicSalary = Integer.parseInt(IO.readln());
  int HRA = (basicSalary*15)/100;   IO.println(" HRA salary of person is " + HRA);
  int ENT = (basicSalary*10)/100;   IO.println("ENT salary of person is " + ENT);
  int con = (basicSalary*15)/100;   IO.println("COnveyance salary of person is " + con); 
  int total = (basicSalary+HRA+ENT+con);
  IO.println("Total salary of person is " + total);
  
    
}
