import java.util.Scanner;
class Dummy {
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.println("Enter a 4-digit Number");
int number = ob.nextInt();
ob.close();
int copy = number;
int digits[] = new int[4];
for (int i = 0; i < 4; i++) {
digits[i] = number % 10;
number /= 10; 
}
for (int j = 0; j < 4; j++) {
System.out.println(digits[j]);
}
String result = isVampire(digits, copy) ? " a Vampire Number" : " not a Vampire Number";
System.out.println(copy + " is" + result);
}
public static boolean isVampire(int[] digits, int number) {
// System.out.println("You Have called isVampire");
int compare = 0;
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
for (int k = 0; k < 4; k++) {
for (int l = 0; l < 4; l++) {
if (i != j && j != k && k != l && l != i && j != l && i != k) {
compare = ((digits[i] * 10 + digits[j]) * (digits[k] * 10 + digits[l]));
// System.out.println(compare);
if (compare == number) {
return true;
} // if
} // outer if
} // l
} // k
} // j
} // i
return false;
}
}