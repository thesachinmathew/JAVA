// 1. Reverse a word without inbuilt
class Q1 { public static void main(String[] a){
String s="TEMPLE", r="";
for(int i=s.length()-1;i>=0;i--) r+=s.charAt(i);
System.out.println("Reverse: "+r);
}}

// 2. String to Integer
class Q2 { public static void main(String[] a){
String s="1234"; int n=0;
for(int i=0;i<s.length();i++) n=n*10+(s.charAt(i)-'0');
System.out.println(n);
}}

// 3. Username valid/invalid
class Q3 { public static void main(String[] a){
String u1="Saveetha@789",u2="Saveetha@123";
System.out.println(u1.equals(u2)?"Valid":"Invalid");
}}

// 4. Sort names A/D
import java.util.*; 
class Q4 { public static void main(String[] a){
String[] arr={"Banana","Carrot","Radish","Apple","Jack"};
Scanner sc=new Scanner(System.in); char c=sc.next().charAt(0);
Arrays.sort(arr); if(c=='D') Collections.reverse(Arrays.asList(arr));
for(String s:arr) System.out.println(s);
}}

// 5. Print special chars
class Q5 { public static void main(String[] a){
String s="He@llo#12$"; int c=0;
for(char ch:s.toCharArray()) if(!Character.isLetterOrDigit(ch)){System.out.print(ch+" ");c++;}
System.out.println("\nCount:"+c);
}}

// 6. Count vowels
class Q6 { public static void main(String[] a){
String s="Saveetha School of Engineering"; int c=0;
for(char ch:s.toLowerCase().toCharArray()) if("aeiou".indexOf(ch)>=0)c++;
System.out.println("Vowels="+c);
}}

// 7. Consonants & vowels
class Q7 { public static void main(String[] a){
String s="Engineering",v="",c="";
for(char ch:s.toLowerCase().toCharArray())
if("aeiou".indexOf(ch)>=0)v+=ch+" "; else c+=ch+" ";
System.out.println("Vowels:"+v+"\nCons:"+c);
}}

// 8. Find char index
class Q8 { public static void main(String[] a){
String s="I am a programmer"; char t='p'; int f=-1;
for(int i=0;i<s.length();i++) if(s.charAt(i)==t){f=i;break;}
System.out.println(f==-1?"Not Found":"Found at "+f);
}}

// 9. Arrange letters reverse alpha
import java.util.*; 
class Q9 { public static void main(String[] a){
String s="MOSQUE"; char[] ch=s.toCharArray(); Arrays.sort(ch);
for(int i=ch.length-1;i>=0;i--) System.out.print(ch[i]+" ");
}}

// 10. Remove vowels
class Q10 { public static void main(String[] a){
String s="we can play the game", r="";
for(char ch:s.toCharArray()) if("aeiouAEIOU".indexOf(ch)==-1) r+=ch;
System.out.println(r);
}}

// 11. Max & Min in array
class Q11 { public static void main(String[] a){
int[] arr={50,20,60,80,40}; int max=arr[0],min=arr[0];
for(int n:arr){ if(n>max)max=n; if(n<min)min=n; }
System.out.println("Max="+max+" Min="+min);
}}

// 12. Transpose matrix
class Q12 { public static void main(String[] a){
int[][] m={{1,2},{3,4}}; int[][] t=new int[2][2];
for(int i=0;i<2;i++) for(int j=0;j<2;j++) t[j][i]=m[i][j];
for(int[] r:t){ for(int n:r) System.out.print(n+" "); System.out.println(); }
}}

// 13. Left rotate array
class Q13 { public static void main(String[] a){
int[] arr={1,2,3,4,5}; int f=arr[0];
for(int i=0;i<arr.length-1;i++) arr[i]=arr[i+1]; arr[arr.length-1]=f;
for(int n:arr) System.out.print(n+" ");
}}

// 14. Average of N
class Q14 { public static void main(String[] a){
int[] arr={1,2,3,4,5}; int s=0;
for(int n:arr) s+=n;
System.out.println("Avg="+(s/arr.length));
}}

// 15. Odd/Even counts
class Q15 { public static void main(String[] a){
int[] arr={1,2,3,4,5,6}; int o=0,e=0;
for(int n:arr) if(n%2==0)e++; else o++;
System.out.println("Odd="+o+" Even="+e);
}}

// 16. Sum of matrix
class Q16 { public static void main(String[] a){
int[][] m={{1,2},{3,4}}; int s=0;
for(int[] r:m) for(int n:r) s+=n;
System.out.println("Sum="+s);
}}

// 17. Matrix multiplication 2x2
class Q17 { public static void main(String[] a){
int[][] A={{1,2},{3,4}},B={{2,0},{1,2}},C=new int[2][2];
for(int i=0;i<2;i++) for(int j=0;j<2;j++) for(int k=0;k<2;k++) C[i][j]+=A[i][k]*B[k][j];
for(int[] r:C){ for(int n:r) System.out.print(n+" "); System.out.println(); }
}}

// 18. Reverse array
class Q18 { public static void main(String[] a){
int[] arr={1,2,3,4}; for(int i=arr.length-1;i>=0;i--) System.out.print(arr[i]+" ");
}}

// 19. Merge two arrays
class Q19 { public static void main(String[] a){
int[] x={1,2,3},y={4,5},z=new int[x.length+y.length]; int i=0;
for(int n:x) z[i++]=n; for(int n:y) z[i++]=n;
for(int n:z) System.out.print(n+" ");
}}

// 20. Frequency of elements
class Q20 { public static void main(String[] a){
int[] arr={1,2,2,3,1}; boolean[] v=new boolean[arr.length];
for(int i=0;i<arr.length;i++){ if(v[i])continue; int c=1;
for(int j=i+1;j<arr.length;j++) if(arr[i]==arr[j]){c++;v[j]=true;}
System.out.println(arr[i]+":"+c);
}}

// 21. Palindrome number
class Q21 { public static void main(String[] a){
int n=121,r=0,t=n; while(n>0){r=r*10+n%10;n/=10;}
System.out.println(t==r?"Palindrome":"Not Palindrome");
}}

// 22. Prime or not
class Q22 { public static void main(String[] a){
int n=29,c=0; for(int i=2;i<=n/2;i++) if(n%i==0)c++;
System.out.println(c==0?"Prime":"Not Prime");
}}

// 23. Sum of digits
class Q23 { public static void main(String[] a){
int n=1234,s=0; while(n>0){s+=n%10;n/=10;}
System.out.println("Sum="+s);
}}

// 24. Factorial
class Q24 { public static void main(String[] a){
int n=5,f=1; for(int i=1;i<=n;i++) f*=i;
System.out.println("Fact="+f);
}}

// 25. Fibonacci series
class Q25 { public static void main(String[] a){
int n=5,f1=0,f2=1; System.out.print(f1+" "+f2);
for(int i=2;i<n;i++){int f=f1+f2;System.out.print(" "+f);f1=f2;f2=f;}
}}

// 26. Armstrong number
class Q26 { public static void main(String[] a){
int n=153,t=n,s=0; while(n>0){int d=n%10;s+=d*d*d;n/=10;}
System.out.println(t==s?"Armstrong":"Not");
}}

// 27. Perfect number
class Q27 { public static void main(String[] a){
int n=28,s=0; for(int i=1;i<n;i++) if(n%i==0)s+=i;
System.out.println(s==n?"Perfect":"Not");
}}

// 28. Strong number
class Q28 { public static void main(String[] a){
int n=145,t=n,s=0; while(n>0){int d=n%10,f=1;for(int i=1;i<=d;i++)f*=i;s+=f;n/=10;}
System.out.println(s==t?"Strong":"Not");
}}

// 29. Prime factors
class Q29 { public static void main(String[] a){
int n=28; for(int i=2;i<=n;i++) while(n%i==0){System.out.print(i+" ");n/=i;}
}}

// 30. Reverse number
class Q30 { public static void main(String[] a){
int n=1234,r=0; while(n>0){r=r*10+n%10;n/=10;}
System.out.println("Reverse="+r);
}}

// 31. LCM of two numbers
class Q31 { public static void main(String[] a){
int x=12,y=18,g=1; for(int i=1;i<=x&&i<=y;i++) if(x%i==0&&y%i==0) g=i;
int l=(x*y)/g; System.out.println("LCM="+l);
}}

// 32. GCD of two numbers
class Q32 { public static void main(String[] a){
int x=12,y=18,g=1; for(int i=1;i<=x&&i<=y;i++) if(x%i==0&&y%i==0) g=i;
System.out.println("GCD="+g);
}}

// 33. Count digits
class Q33 { public static void main(String[] a){
int n=12345,c=0; while(n>0){c++;n/=10;} System.out.println("Digits="+c);
}}

// 34. Check +ve/-ve
class Q34 { public static void main(String[] a){
int n=-5; System.out.println(n>0?"Positive":(n<0?"Negative":"Zero"));
}}

// 35. Sum 1 to N
class Q35 { public static void main(String[] a){
int n=10,s=0; for(int i=1;i<=n;i++) s+=i; System.out.println("Sum="+s);
}}

// 36. Even numbers in range
class Q36 { public static void main(String[] a){
for(int i=1;i<=20;i++) if(i%2==0) System.out.print(i+" ");
}}

// 37. Odd numbers in range
class Q37 { public static void main(String[] a){
for(int i=1;i<=20;i++) if(i%2!=0) System.out.print(i+" ");
}}

// 38. Pattern - right triangle
class Q38 { public static void main(String[] a){
for(int i=1;i<=5;i++){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();}
}}

// 39. Pattern - inverted triangle
class Q39 { public static void main(String[] a){
for(int i=5;i>=1;i--){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();}
}}

// 40. Pattern - pyramid
class Q40 { public static void main(String[] a){
for(int i=1;i<=5;i++){for(int j=5;j>i;j--)System.out.print(" ");for(int k=1;k<=2*i-1;k++)System.out.print("*");System.out.println();}
}}

// 41. Square & Cube
class Q41 { public static void main(String[] a){
double n=0.6; System.out.println("Square="+(n*n)+" Cube="+(n*n*n));
}}

// 42. nth odd numbers
class Q42 { public static void main(String[] a){
int n=7; for(int i=1,c=0;c<n;i+=2, c++) System.out.print(i+" ");
}}

// 43. Armstrong number
class Q43 { public static void main(String[] a){
int n=153,s=0,t=n; while(t>0){int d=t%10; s+=d*d*d; t/=10;}
System.out.println(s==n?"Armstrong":"Not");
}}

// 44. Sum of digits till single digit
class Q44 { public static void main(String[] a){
int n=143; while(n>9){int s=0;while(n>0){s+=n%10;n/=10;} n=s;}
System.out.println("Sum="+n);
}}

// 45. Square root (±)
class Q45 { public static void main(String[] a){
int n=6561; int r=(int)Math.sqrt(n); if(r*r==n) System.out.println(r+" "+(-r));
else System.out.println("Not perfect square");
}}

// 46. Power of three
class Q46 { public static void main(String[] a){
int n=27; boolean f=true; while(n>1){if(n%3!=0){f=false;break;} n/=3;}
System.out.println(f&&n==1);
}}

// 47. Most frequent non-banned word
import java.util.*; class Q47{public static void main(String[]a){
String p="Ram hit a ball, the hit ball flew far after it was hit".toLowerCase();
String[]w=p.replaceAll("[^a-z ]","").split(" "); List<String>b=Arrays.asList("hit");
Map<String,Integer>m=new HashMap<>(); for(String x:w) if(!b.contains(x)) m.put(x,m.getOrDefault(x,0)+1);
System.out.println(Collections.max(m.entrySet(),Map.Entry.comparingByValue()).getKey());
}}

// 48. Duplicate zeros
import java.util.*; class Q48{public static void main(String[]a){
int[] arr={1,0,2,3,0,4,5,0}; List<Integer> l=new ArrayList<>();
for(int x:arr){ l.add(x); if(x==0) l.add(0);} System.out.println(l);
}}

// 49. Missing number in range
class Q49 { public static void main(String[] a){
int[] arr={3,0,1}; int n=arr.length; int s=n*(n+1)/2; for(int x:arr) s-=x;
System.out.println("Missing="+s);
}}

// 50. Max subarray sum (Kadane)
class Q50 { public static void main(String[] a){
int[] arr={-2,1,-3,4,-1,2,1,-5,4}; int m=arr[0],c=arr[0];
for(int i=1;i<arr.length;i++){c=Math.max(arr[i],c+arr[i]); m=Math.max(m,c);}
System.out.println("Max Sum="+m);
}}

// 51. Multiplication table
class Q51 { public static void main(String[] a){
int m=4,n=5; for(int i=1;i<=n;i++) System.out.println(i+"x"+m+"="+(i*m));
}}

// 52. Threads with join & sleep
class Q52 extends Thread{ public void run(){System.out.println("Thread running");}
public static void main(String[] a)throws Exception{
Q52 t=new Q52(); t.start(); t.join(500); // join after 500ms
}}

// 53. Menu using do-while
import java.util.*; class Q53{ public static void main(String[]a){
Scanner sc=new Scanner(System.in); int ch; do{
System.out.println("1.If 2.For 3.While 4.Exit"); ch=sc.nextInt();
switch(ch){case 1:System.out.println("if(cond){}else{}");break;
case 2:System.out.println("for(i=0;i<n;i++){}");break;
case 3:System.out.println("while(cond){}");break;}
}while(ch!=4);
}}

// 54. Simple Generics Sort
import java.util.*; class Q54<T extends Comparable<T>>{
void sort(List<T> l){Collections.sort(l);System.out.println(l);}
public static void main(String[] a){
new Q54<Integer>().sort(Arrays.asList(5,2,9,1));
new Q54<String>().sort(Arrays.asList("c","a","b"));
}}

// 55. Overloading demo
class Overload{ 
void set(int a,int b){System.out.println("Sum="+(a+b));}
void set(int a){System.out.println("Square="+(a*a));}
public static void main(String[] a){Overload o=new Overload(); o.set(5); o.set(5,3);}
}
