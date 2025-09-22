//Convert Days + Day of Week
import java.util.*;
import java.time.*;
class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();
    int years = days / 365;
    int weeks = (days % 365) / 7;
    int remDays = (days % 365) % 7;
    System.out.println("Years:" + years);
    System.out.println("Weeks:" + weeks);
    System.out.println("Days:" + remDays);

    int d = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
    LocalDate date = LocalDate.of(y, m, d);
    System.out.println(date.getDayOfWeek());
  }
}

//Student Users
import java.util.*;
class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int staff = sc.nextInt();
    int students = total - staff;
    System.out.println("Students:" + students);
  }
}

//Factors and nth Factor
import java.util.*;
class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= Math.abs(n); i++) {
      if (n % i == 0) {
        count++;
        if (count == k) System.out.println(k + "th factor: " + i);
      }
    }
    System.out.println("Number of factors = " + count);
  }
}


//n Primes After nth Prime
import java.util.*;
class Q4 {
  static boolean prime(int x) {
    if (x < 2) return false;
    for (int i = 2; i * i <= x; i++)
      if (x % i == 0) return false;
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), count = 0, num = 1;
    while (count < n) if (prime(++num)) count++;
    System.out.println(n + "th prime is " + num);
    int c = 0, p = num + 1;
    while (c < n) if (prime(p++)) {System.out.print((p-1)+" ");c++;}
  }
}

//Perfect Squares with Digit Sum < 10
import java.util.*;
class Q5 {
  static int digitSum(int x) {
    int sum = 0;
    while (x > 0) { sum += x % 10; x /= 10; }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt(), u = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = (int)Math.ceil(Math.sqrt(l)); i*i <= u; i++) {
      int sq = i * i;
      if (digitSum(sq) < 10) list.add(sq);
    }
    System.out.println(list);
  }
}


//Unique Permutations
import java.util.*;
class Q6 {
  static void perm(String s, String ans, Set<String> set) {
    if (s.isEmpty()) { set.add(ans); return; }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      String rest = s.substring(0, i) + s.substring(i+1);
      perm(rest, ans + c, set);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Set<String> set = new TreeSet<>();
    perm(s, "", set);
    System.out.println(set);
  }
}

// Number and Square Array
import java.util.*;
class Q7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt(), u = sc.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for (int i = l; i <= u; i++) {
      list.add("(" + i + "," + (i*i) + ")");
    }
    System.out.println(list);
  }
}

//Bank Account 1
class Bank {
  String name, type;
  int acc;
  double bal = 10000;
  Bank(int a, String n, String t) { acc=a; name=n; type=t; }
  void deposit(double x) { bal += x; }
  void withdraw(double x) { if (bal-x >= 500) bal -= x; }
  void show() { System.out.println(name+" "+acc+" "+type+" "+bal); }
}
class Q8 {
  public static void main(String[] args) {
    Bank b = new Bank(100, "Raja", "S");
    b.withdraw(2000);
    b.show();
  }
}

//Bank Account 2
import java.util.*;
class Bank{String name,typ;int acc;double bal=10000;Bank(int a,String n,String t){acc=a;name=n;typ=t;}void dep(double x){bal+=x;}void wit(double x){if(bal-x>=500)bal-=x;}void show(){System.out.println(name+" "+acc+" "+typ+" "+bal);}}
class Q8{public static void main(String[]a){Bank b=new Bank(100,"Raja","S");b.wit(2000);b.show();}}

//Reverse and Add until Palindrome 1
import java.util.*;
class Q9 {
  static boolean pal(long n) {
    String s = "" + n;
    return s.equals(new StringBuilder(s).reverse().toString());
  }
  static long rev(long n) {
    return Long.parseLong(new StringBuilder(""+n).reverse().toString());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    while (!pal(n)) n += rev(n);
    System.out.println(n);
  }
}

//Reverse and Add until Palindrome 2
import java.util.*;
class Q9{
  static boolean pal(long x){String s=""+x;return s.equals(new StringBuilder(s).reverse().toString());}
  static long rev(long x){return Long.parseLong(new StringBuilder(""+x).reverse().toString());}
  public static void main(String[]a){Scanner sc=new Scanner(System.in);long n=sc.nextLong();while(!pal(n)){n+=rev(n);}System.out.println(n);}
}



//Synchronization with Deposit/Withdraw 1
class Account {
  int bal = 10000;
  synchronized void deposit(int x) { bal += x; notify(); }
  synchronized void withdraw(int x) {
    while (bal < x) try { wait(); } catch(Exception e){}
    bal -= x;
    System.out.println("Withdraw success, Balance:" + bal);
  }
}
class Q10 {
  public static void main(String[] args) {
    Account a = new Account();
    new Thread(() -> a.withdraw(12000)).start();
    new Thread(() -> a.deposit(3000)).start();
  }
}

//Synchronization with Deposit/Withdraw 2
class Acc{int bal=10000; synchronized void dep(int x){bal+=x;notify();} synchronized void wit(int x){while(bal<x)try{wait();}catch(Exception e){}bal-=x;System.out.println("Withdraw success, Bal:"+bal);}}
class Q10{public static void main(String[]a){Acc ob=new Acc();new Thread(()->ob.wit(12000)).start();new Thread(()->ob.dep(3000)).start();}}
