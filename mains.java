import java.util.Scanner;
class mains
{
    public static void main(String agrs[])
    {
        comin s = new comin();
        s.get();
        s.calsi();
        s.calci();
        s.print();
    }
}
class getin
{
    Scanner sc = new Scanner(System.in);
    double p,t,r,time,rate;
    void get()
    {
        try{
        System.out.println("Enter Principal Amount : ");
        p = sc.nextDouble();
        System.out.println("Enter Rate Of Interest(in percent) : ");
        rate = sc.nextDouble();
        System.out.println("Enter Year(in months) : ");
        time = sc.nextDouble();
        r = rate/100;
        t = time/12; 
        }catch(Exception e){
        {
         System.out.println("enter input in proper format :");
        System.out.println("PRINCIPAL AMOUNT-rs RATE- percent(without %)  YEAR - months(1y-12)");
        }
    }
    }
}
class simin extends getin
{
    double si;
    void calsi()
    {
        si = p*r*t;
    }
}
class comin extends simin
{
    double ci,c;
    void calci()
    {
         c= Math.pow((1+r),t);
        ci = (p*c)-p;
    }
    void print()
    {
        System.out.println(" FOR PRINCIPAL AMOUNT "+p+" WITH RATE "+rate+"% IN "+t+"YEARS\n");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("|        INTEREST CALCULATION                                              |");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("|          SIMPLE INTEREST : "+si+"                                           |");
        System.out.println("|          COMPOUND INTEREST : "+ci+"                                         |");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("\n\n");
    }
}