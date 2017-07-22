package ParametersDemo;

/**
 * Created by macbook on 7/21/2017.
 */
public class PassParameters2 {
  public static void main(String[] args){

    DynamicCalculator obj1 = new DynamicCalculator();

    int sum = obj1.add(455,78);
    System.out.println("Sum result is " + sum);

    double result = obj1.sub(7888.89, 45.45);
    System.out.println("Substraction result is " + result);

    String fullname = DynamicCalculator.getMyFullName("Angelica", "Art");
    System.out.println("Congrates " + fullname);
  }
}
