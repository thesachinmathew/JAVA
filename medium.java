//1. Count Prime & Composite
import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime=0, comp=0;
        while(true) {
            int n = sc.nextInt();
            if(n==-1) break;
            if(n<2) continue;
            boolean isPrime = true;
            for(int i=2; i*i<=n; i++)
                if(n%i==0) { isPrime=false; break; }
            if(isPrime) prime++; else comp++;
        }
        System.out.println("Prime numbers: " + prime);
        System.out.println("Composite numbers: " + comp);
    }
}

//2. Mth Max & Nth Min   ***
import java.util.*;
class Q2 {
    public static void main(String[] args) {
        int[] arr = {14,16,87,36,25,89,34};
        int M=1, N=3;
        Arrays.sort(arr);
        int mthMax = arr[arr.length-M];
        int nthMin = arr[N-1];
        System.out.println(M+"st Maximum: " + mthMax);
        System.out.println(N+"rd Minimum: " + nthMin);
        System.out.println("Sum: " + (mthMax+nthMin));
        System.out.println("Difference: " + (mthMax-nthMin));
    }
}

//3. ATM Total Balance
import java.util.*;
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        for(int i=0;i<4;i++){
            System.out.print("Enter denomination: ");
            int denom = sc.nextInt();
            System.out.print("Enter number of notes: ");
            int notes = sc.nextInt();
            total += denom*notes;
        }
        System.out.println("Total ATM Balance: " + total);
    }
}

//4. Palindrome Check
import java.util.*;
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Case (1-String, 2-Number): ");
        int caseType = sc.nextInt();
        if(caseType==1){
            System.out.print("Enter string: ");
            String str = sc.next();
            String rev = new StringBuilder(str).reverse().toString();
            System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
        } else {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int temp=n, rev=0;
            while(n>0){ rev=rev*10+n%10; n/=10; }
            System.out.println(temp==rev ? "Palindrome" : "Not Palindrome");
        }
    }
}

//5. Decimal to Binary & Octal   ***
import java.util.*;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal: ");
        int n = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));
    }
}

//6. Salary Bonus
import java.util.*;
class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A/B): ");
        char grade = sc.next().charAt(0);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        double bonus = (grade=='A'?0.05:0.10)*salary;
        if(salary<10000) bonus += 0.02*salary;
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary+bonus));
    }
}

//7. First N Perfect Numbers
import java.util.*;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt(), count=0, num=2;
        System.out.print("Perfect Numbers: ");
        while(count<N){
            int sum=1;
            for(int i=2;i*i<=num;i++) if(num%i==0) sum+=i+(i!=num/i?num/i:0);
            if(sum==num){ System.out.print(num+" "); count++; }
            num++;
        }
    }
}

//8. Student Grades
import java.util.*;
class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        String[] subjects = {"Python","C","Maths","Physics"};
        int total=0;
        for(int i=0;i<4;i++){
            System.out.print("Enter marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double agg = total/4.0;
        System.out.println("Total: " + total);
        System.out.println("Aggregate: " + agg);
        if(agg>75) System.out.println("Distinction");
        else if(agg>=60) System.out.println("First Division");
        else if(agg>=50) System.out.println("Second Division");
        else if(agg>=40) System.out.println("Third Division");
        else System.out.println("Fail");
    }
}

//9. Average of Positive & Negative
import java.util.*;
class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posSum=0,posCount=0, negSum=0, negCount=0;
        while(true){
            System.out.print("Enter number (-1 to exit): ");
            int n=sc.nextInt();
            if(n==-1) break;
            if(n>0){ posSum+=n; posCount++; }
            else if(n<0){ negSum+=n; negCount++; }
        }
        System.out.println("Positive avg: "+(posCount>0?(double)posSum/posCount:0));
        System.out.println("Negative avg: "+(negCount>0?(double)negSum/negCount:0));
    }
}

//10. Count Uppercase, Lowercase, Numbers
import java.util.*;
class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int up=0, low=0, num=0;
        while(true){
            System.out.print("Enter char (* to stop): ");
            String ch = sc.next();
            if(ch.equals("*")) break;
            char c = ch.charAt(0);
            if(Character.isUpperCase(c)) up++;
            else if(Character.isLowerCase(c)) low++;
            else if(Character.isDigit(c)) num++;
        }
        System.out.println("Uppercase: "+up);
        System.out.println("Lowercase: "+low);
        System.out.println("Numbers: "+num);
    }
}


//11. Factorial using Recursion   ***
import java.util.*;
class Q11 {
    static int fact(int n){ return n<=1?1:n*fact(n-1); }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: "); int n=sc.nextInt();
        System.out.println("Factorial: "+fact(n));
    }
}

//12. Nth Largest in Array   ***
import java.util.*;
class Q12 {
    public static void main(String[] args){
        int[] arr = {14,67,48,23,5,62}; int N=4;
        Arrays.sort(arr);
        System.out.println(N+"th Largest: "+arr[arr.length-N]);
    }
}

//13. Binary to Decimal & Octal   ***
import java.util.*;
class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary: "); String bin=sc.next();
        int dec = Integer.parseInt(bin,2);
        System.out.println("Decimal: "+dec);
        System.out.println("Octal: "+Integer.toOctalString(dec));
    }
}

//14. Count Special Characters
import java.util.*;
class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter statement: "); String str=sc.nextLine();
        int count=0;
        for(char c:str.toCharArray()) if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)) count++;
        System.out.println("Special Characters: "+count);
    }
}

//15. Remove Duplicate Items from Array   ***
import java.util.*;
class Q15 {
    public static void main(String[] args){
        int[] arr = {10,20,20,30,40,40,50};
        Set<Integer> s = new LinkedHashSet<>();
        for(int n:arr) s.add(n);
        System.out.println("Non-duplicate items: "+s);
    }
}

//16. Bank Interest Example   ***
class Bank {
    double rate; Bank(double r){ rate=r; }
    double getRate(){ return rate; }
}
class Q16 {
    public static void main(String[] args){
        Bank sbi = new Bank(8.4);
        Bank icici = new Bank(7.3);
        Bank axis = new Bank(9.7);
        System.out.println("SBI: "+sbi.getRate()+"%, ICICI: "+icici.getRate()+"%, AXIS: "+axis.getRate()+"%");
    }
}

//17. Subclass hiding Superclass members
class SuperCls {
    int x; SuperCls(int a){ x=a; System.out.println("Super: "+x); }
}
class SubCls extends SuperCls {
    int x; SubCls(int a,int b){ super(a); x=b; System.out.println("Sub: "+x); }
}
class Q17 {
    public static void main(String[] args){
        SubCls obj = new SubCls(100,200);
    }
}

//18. Multiplication Table with Thread
class TableThread extends Thread {
    int n; TableThread(int n){ this.n=n; }
    public void run(){
        for(int i=1;i<=10;i++){ System.out.println(n+" X "+i+" = "+(n*i)); try{Thread.sleep(50);}catch(Exception e){} }
    }
}
class Q18 {
    public static void main(String[] args){
        new TableThread(5).start();
        new TableThread(10).start();
    }
}

//19. Fibonacci using Runnable Thread
class FibRunnable implements Runnable {
    int n; FibRunnable(int n){ this.n=n; }
    public void run(){
        int a=0,b=1;
        System.out.print("Fib: ");
        for(int i=0;i<n;i++){ System.out.print(a+" "); int c=a+b;a=b;b=c; }
        System.out.println();
    }
}
class Q19 {
    public static void main(String[] args){
        new Thread(new FibRunnable(5)).start();
    }
}

//20. Sum of N numbers with ArrayIndexOutOfBoundsException
import java.util.*;
class Q20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=5; int[] arr={1,2,3,4,5}; int sum=0;
        try{ for(int i=0;i<=N;i++) sum+=arr[i]; }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("ArrayIndexOutOfBounds caught"); }
        System.out.println("Sum: "+sum);
    }
}

//21. Prime check using Thread & Runnable
class PrimeRunnable implements Runnable {
    int n; PrimeRunnable(int n){ this.n=n; }
    public void run(){
        boolean prime = n>1;
        for(int i=2;i*i<=n && prime;i++) if(n%i==0) prime=false;
        System.out.println(n + (prime ? " is Prime" : " is Not Prime"));
    }
}
class Q21 {
    public static void main(String[] args){
        new Thread(new PrimeRunnable(5)).start();
    }
}

//22. Multi-Catch Exceptions
class Q22 {
    public static void main(String[] args){
        try{
            int a=10/0;
            int[] arr={1}; int x=arr[2];
            String s=null; s.length();
        } catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e){
            System.out.println("Caught Exception: "+e);
        }
    }
}

//23. File Write & Read ***
import java.io.*;
class Q23 {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("file.txt"); fw.write("Computer Science and Engineering"); fw.close();
        FileReader fr = new FileReader("file.txt");
        int ch; while((ch=fr.read())!=-1) System.out.print((char)ch);
        fr.close();
    }
}

//24. Box Volume using Default Constructor
class Box {
    int l=2,w=3,h=4;
    int volume(){ return l*w*h; }
}
class Q24 {
    public static void main(String[] args){
        Box b = new Box();
        System.out.println("Volume: "+b.volume());
    }
}

//25. String Operations  ***
import java.util.*;
class Q25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: "); String s=sc.nextLine();
        System.out.println("Replace 'Saveetha'->'ABC': "+s.replace("Saveetha","ABC"));
        System.out.println("Length: "+s.length());
        System.out.println("Uppercase: "+s.toUpperCase());
    }
}

//26. Hashtable Bank Details   ***
import java.util.*;
class Q26 {
    public static void main(String[] args){
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(101,"Alice"); ht.put(102,"Bob"); ht.put(103,"Charlie");
        System.out.println("Hashtable: "+ht);
        System.out.println("Size: "+ht.size());
        ht.clear(); System.out.println("Cleared Hashtable: "+ht);
    }
}

//27. Employee Record using Map
import java.util.*;
class Q27 {
    public static void main(String[] args){
        Map<Integer,String> emp = new HashMap<>();
        emp.put(1,"Alice"); emp.put(2,"Bob"); emp.put(3,"Charlie");
        System.out.println("Employees: "+emp);
        emp.remove(2); System.out.println("After Remove: "+emp);
        System.out.println("Is Empty? "+emp.isEmpty());
        emp.clear(); System.out.println("After Clear: "+emp);
    }
}

//28. Simple Generics for Sorting   ***
import java.util.*;
class GenericSort<T extends Comparable<T>> {
    T[] arr; GenericSort(T[] arr){ this.arr=arr; Arrays.sort(arr); }
    void print(){ for(T t:arr) System.out.print(t+" "); System.out.println(); }
}
class Q28 {
    public static void main(String[] args){
        Integer[] a={5,3,7}; new GenericSort<>(a).print();
        String[] b={"C","A","B"}; new GenericSort<>(b).print();
    }
}

//29. ListIterator + Reverse Print    ***
import java.util.*;
class Q29 {
    public static void main(String[] args){
        List<String> l = new ArrayList<>(Arrays.asList("C","A","E","B","D","F"));
        ListIterator<String> it = l.listIterator();
        while(it.hasNext()){ it.set(it.next()+"+"); }
        ListIterator<String> rev = l.listIterator(l.size());
        while(rev.hasPrevious()) System.out.print(rev.previous()+" ");
    }
}

//30. Arithmetic Operations + Division by Zero Exception    ***
import java.util.*;
class Q30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: "); int a=sc.nextInt();
        System.out.print("Enter b: "); int b=sc.nextInt();
        try{ System.out.println("a/b = "+(a/b)); }
        catch(ArithmeticException e){ System.out.println("Division by zero!"); }
    }
}
