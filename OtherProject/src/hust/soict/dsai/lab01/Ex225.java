package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class Ex225 {
    public static void main(String[] args) {
        String strNum1,strNum2;
        
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        String sum = Double.toString(num1 + num2);
        String difference = Double.toString(num1-num2);
        String product = Double.toString(num1*num2);
        String quotient;
        if (num2 == 0) {
            quotient = "Divide by 0!";
        }
        else {quotient = Double.toString(num1/num2);}

        JOptionPane.showMessageDialog(null, "Sum Difference Product Quotient: " + sum + "|"+ difference+ "|"+ product + "|"+ quotient +".","Show some number",1);
        System.exit(0);
    }
}