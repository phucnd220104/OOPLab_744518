package hust.soict.dsai.lab01;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Ex226 {
    public static void firstdegree()
    {
        String info = "Please type";
        String X;
        String A = JOptionPane.showInputDialog(null, info + " a: ", "ax+b=0", 0);
        String B = JOptionPane.showInputDialog(null, info + " b: ", "ax+b=0", 0);
        double a = Double.parseDouble(A);
        double b = Double.parseDouble(B);
        if(a == 0) 
        {
            if(b == 0) X= "Infinite Solution!";
            else X="No Solution!";
        }
        else {double x = -b/a; X = Double.toString(x);}

        JOptionPane.showMessageDialog(null, "The solution: "+ X);
    }
    public static void system_eq()
    {
        String info = "Please type";
        String A11 = JOptionPane.showInputDialog(null, info + " a11: ", "a11*x1+a12*x2=b1 and a21*x1+a22*x2=b2", 0);
        String A12 = JOptionPane.showInputDialog(null, info + " a12: ", "a11*x1+a12*x2=b1 and a21*x1+a22*x2=b2", 0);
        String A21 = JOptionPane.showInputDialog(null, info + " a21: ", "a11*x1+a12*x2=b1 and a21*x1+a22*x2=b2", 0);
        String A22 = JOptionPane.showInputDialog(null, info + " a22: ", "a11*x1+a12*x2=b2 and a21*x1+a22*x2=b2", 0);
        String B1 = JOptionPane.showInputDialog(null, info + " b1: ", "a11*x1+a12*x2=b1 and a21*x1+a22*x2=b2", 0);
        String B2 = JOptionPane.showInputDialog(null, info + " b2: ", "a11*x1+a12*x2=b2 and a21*x1+a22*x2=b2", 0);
        

        double a11 = Double.parseDouble(A11);
        double a12 = Double.parseDouble(A12);
        double a21 = Double.parseDouble(A21);
        double a22 = Double.parseDouble(A22);
        double b1 = Double.parseDouble(B1);
        double b2 = Double.parseDouble(B2);

        double d = a11*a22-a21*a12;
        double dx1 = b1*a22-b2*a12;
        double dx2 = a11*b2-a21*b1;

        String result;

        if(d != 0) 
        {
            double x1 = dx1/d;
            double x2 = dx2/d;
            result = "X1= "+ x1+ "; X2= "+x2+".";
        }
        else
        {
            if(dx1 !=0 || dx2 != 0) {result = "No solution!";} 
            else{result = "Infinite Solution.";}
        }

        JOptionPane.showMessageDialog(null, "The solution is: " +result);

    }
    public static void second_eq()
    {
        String info = "Please type";
        String A = JOptionPane.showInputDialog(null, info + " a: ", "ax^2+bx+c=0", 0);
        String B = JOptionPane.showInputDialog(null, info + " b: ", "ax^2+bx+c=0", 0);
        String C = JOptionPane.showInputDialog(null, info + " c: ", "ax^2+bx+c=0", 0);

        double a = Double.parseDouble(A);
        double b = Double.parseDouble(B);
        double c = Double.parseDouble(C);

        double delta = b*b-4*a*c;
        String result;
        if(delta <0) {result = "No solution!";}
        else if(delta == 0){result = Double.toString(-b/(2*a));}
        else 
        {
            result = "x1= "+ (-b+Math.sqrt(delta))/(2*a) + " and X2= " + (-b-Math.sqrt(delta))/(2*a) + ".";
        }

        JOptionPane.showMessageDialog(null, "The solution is: " +result);
    }
    public static void main(String[] args) {
        String strNum1;
        strNum1 = JOptionPane.showInputDialog(null, "Press 1: solving 1st degree equation; 2 for system of first degree equations with 2 variables, 3 for solving a 2nd degree equation.", "Input",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        if(num1 ==1){firstdegree();}
        else if (num1==2) {system_eq();}
        else if (num1==3) {second_eq();}

    }
}
