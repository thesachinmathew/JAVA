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
