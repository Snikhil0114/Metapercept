import java.util.Scanner;

class ClassA {
  private int num1;
  private int num2;

  public void AcceptNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the First Number");
    num1 = scanner.nextInt();
    System.out.print("Enter the Second Number");
    num2 = scanner.nextInt();
  }

  public int getNum1() {
    return num1;
  }

  public int getNum2() {
    return num2;
  }
}

class ClassB {
  private int lastDigitNum1;
  private int lastDigitNum2;

  public void fetchLastDigits(ClassA classA) {
    lastDigitNum1 = classA.getNum1() % 10;
    lastDigitNum2 = classA.getNum2() % 10;
  }

  public int getLastDigitNum1() {
    return lastDigitNum1;
  }

  public int getLastDigitNum2() {
    return lastDigitNum2;
  }
}

class ClassC {

  public int multiplyLastDigits(ClassB classB) {
    return classB.getLastDigitNum1() * classB.getLastDigitNum2();
  }
}

public class Classes {

  public static void main(String args[]) {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB();
    ClassC classC = new ClassC();

    classA.AcceptNumber();
    classB.fetchLastDigits(classA);
    int result = classC.multiplyLastDigits(classB);
    System.out.println("Result of Multiplying Last Digits:" + result);
  }
}
