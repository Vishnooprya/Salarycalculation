/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*class TemporaryEmployee implements salarycal,extrafunds
{
    
}*/
import java.util.Scanner;
class DateOfBirth
{
    int d,m,y;
    DateOfBirth(int a,int b,int c)
    {
        if(d<=31)
         d=a;
        if(m<=12)
         m=b;
        y=c;
    }
    @Override
   public  String toString()
    {
        return d+"/"+m+"/"+y+"\n";
        
    }
           
}
class PermanentEmployee implements salarycal,extrafunds
{
    String name;
    int emp_id;
    int experience;
    DateOfBirth d1;
    double salary;
    double bp,hra,da,it;
   void getdetails()
   {
       System.out.println("Enter your name :");
       Scanner input=new Scanner(System.in);
       name=input.next();
       System.out.println("Enter your employment id:");
       emp_id=input.nextInt();
       System.out.println("Enter your DOB as d m y:");
       int a=input.nextInt();
       int b=input.nextInt();
       int c=input.nextInt();
       d1=new DateOfBirth(a,b,c);
       System.out.println("Enter your basic pay:");
       bp=input.nextDouble();
   }
   @Override
 public  void increment()
   {
       System.out.println("Enter the number of years working in this company:");
       Scanner input=new Scanner(System.in);
       experience=input.nextInt();
       if(experience > 5)
       {    System.out.println("You can apply for an increment of  Rs.10000\n ");
       
           }
       else
           System.out.println("You are not elligible for increment\n");
   }
 @Override
 public void salarycalci()
 {
     
     hra=RATE*bp;
     da=VAL*bp;
     salary=bp+hra+da;
 }
 @Override
 public void itcal()
 {
     if(bp>10000)
         it=0.6*bp;
     else
         it=0.8*bp;
     
 }
 @Override
 public void salaryshow()
 {
     salary=bp+hra+da-it;
     System.out.println("Your salary is"+salary+"\n");
 }
 @Override
 public void annualsal()
 {
   double total;
   total=salary*12;
   System.out.println("The annual salary is "+total+" \n");
 }
 @Override
 public void insurance()
 {
     System.out.println("Your insurance plan is : Silver plan \n In case of accident/emergency rs.100000 willbe provided\n");
 }
 @Override
        public void provident()
        {
            
        }
        void showdata()
        {
            salarycalci();
            System.out.println("Name:"+name+"\nEmployment id:"+emp_id+"\nDOB:"+d1.d+"/"+d1.m+"/"+d1.y+"\nSalary:"+salary+"\n");
        }
int search(int x)
{
    if(emp_id==x)
        return 1;
    else 
        return 0;
}
}


class TemporaryEmployee implements salarycal,extrafunds
{
    String name;
    int emp_id;
    int experience,days;
    DateOfBirth d2;
    double salary,bp,it;
    
   void getdata()
   {
       System.out.println("Enter your name: ");
       Scanner input=new Scanner(System.in);
       name=input.next();
       System.out.println("Enter your employment id: ");
       emp_id=input.nextInt();
       System.out.println("Enter your DOB as d m y");
       int a=input.nextInt();
       int b=input.nextInt();
       int c=input.nextInt();
       d2 = new DateOfBirth(a,b,c);
        System.out.println("Enter your daily salary: ");
       bp=input.nextDouble();
       System.out.println("Enter the number of working days:");
       days=input.nextInt();
   }
  
   @Override
 public  void increment()
   {
       System.out.println("Enter the number of years working in this company:");
       Scanner input=new Scanner(System.in);
       experience=input.nextInt();
       if(experience > 5)
       {    System.out.println("You can apply for an increment of  Rs.10000\n ");
       
           }
       else
           System.out.println("You are not elligible for increment\n");
   }
 @Override
 public void salarycalci()
 {
     
     salary=bp*days;
 }
 @Override
 public void itcal()
 {
     if(bp<10000)
         it=0.1*bp;
     else
         it=0.2*bp;
     
 }
 @Override
 public void salaryshow()
 {
     salary=bp-it;
     System.out.println("Your salary is"+salary+"\n");
 }
 @Override
 public void annualsal()
 {
   double total;
   total=bp*365;
   System.out.println("The annual salary is approximately "+total+" \n");
 }
 @Override
 public void insurance()
 {
     System.out.println("Your insurance plan is : Copper \n In case of accident/emergency rs.10000 will be provided\n");
 }
 @Override
        public void provident()
        {
            
        }
  void showdetails()
  {
      salarycalci();
      System.out.println("Name:\t"+name+"\nEmployment id:"+emp_id+"\nDOB:"+d2.d+"/"+d2.m+"/"+d2.y+"\n Salary:"+salary+"\n");
  }
int searchs(int x)
{
    if(emp_id==x)
        return 1;
    else 
        return 0;
}
}
    

public class employees {
    public static void main(String[] args)
    {
        PermanentEmployee p[]=new PermanentEmployee[10];
        Scanner input=new Scanner(System.in);
        System.out.println("DATA FEEDING(INITAL)\n");
        System.out.println("Enter the number of permanent employees:");
        int count=input.nextInt();
        int x,count1;
        for(int i=0;i<count;i++)
        {
            System.out.println("For permanent employee "+(i+1)+"\n");
            p[i]=new PermanentEmployee();
            p[i].getdetails();
         
        }
        TemporaryEmployee t[]=new TemporaryEmployee[10];
         System.out.println("Enter the number of temporary employees:");
          count1=input.nextInt();
        for(int i=0;i<count1;i++)
        {
            System.out.println("For temporary employee "+i+1+"\n");
            t[i]=new TemporaryEmployee();
            t[i].getdata();
         
        }
        System.out.println("EXISTING DETAILS CHECKING\n");
        System.out.println("Are you a 1.Permanent employee 2.Temporary employee\n");
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:
            {int ch1=1;
            while(ch1!=0)
            {  System.out.println("For permanent employees ,Enter the choice: 1.Salary enquiry 2.Increment enquiry 3.Insurance plan 4.Annual salary display 5.Display details 0.Exit");
                ch1=input.nextInt();
                switch(ch1)
                {
                    case 1:
                    {System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count;i++)
                        {
                           if( p[i].search(x)==1)
                           {p[i].salarycalci();
                           p[i].itcal();
                           p[i].salaryshow();
                           }
                        }
                        break;}
                      case 2:
                      {System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count;i++)
                        {
                           if( p[i].search(x)==1)
                               p[i].increment();
                        }
                        break;}
                    case 3:
                    {  System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count;i++)
                        {
                           if( p[i].search(x)==1)
                               p[i].insurance();
                        }
                          break;}
                    case 4:
                    {System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count;i++)
                                
                        {
                           if( p[i].search(x)==1)
                           {
                               p[i].annualsal();
                            }
                        }
                        break;
                       }
                    case 5:
                    {System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count;i++)
                                
                        {
                           if( p[i].search(x)==1)
                           {
                               p[i].showdata();
                            }
                        }
                        break;
                        
                    }
                        
                }      
                        
                }break;
            }
            case 2:
                {int ch1=1;
            while(ch1!=0)
            {  System.out.println("For temporary employees ,Enter the choice: 1.Salary enquiry 2.Increment enquiry 3.Insurance plan 4.Annual salary display 5.Display details 0.Exit");
                ch1=input.nextInt();
                switch(ch1)
                {
                    case 1:
                        System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count1;i++)
                        {
                           if( t[i].searchs(x)==1)
                           {t[i].salarycalci();
                           t[i].itcal();
                           t[i].salaryshow();
                           }
                        }
                        break;
                    case 2:
                         System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count1;i++)
                        {
                           if( t[i].searchs(x)==1)
                               t[i].increment();
                        }
                        break;
                    case 3:
                         System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count1;i++)
                        {
                           if( t[i].searchs(x)==1)
                               t[i].insurance();
                        }
                          break;
                    case 4:
                         System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count1;i++)
                        {
                           if( t[i].searchs(x)==1)
                           {
                               t[i].annualsal();
                            }
                        }
                        break;
                    case 5:
                    {
                         System.out.println("Enter your employment id:");
                         x=input.nextInt();
                        for(int i=0;i<count1;i++)
                        {
                           if( t[i].searchs(x)==1)
                           {
                               t[i].showdetails();
                            }
                        }break;
                    }
                        
                }      
                        
                }
            break;
            }
                
        }
        
    }
}
