import javax.swing.*;

public class w10 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("What is your name?");
        System.out.print("Hello "+name);
        JOptionPane.showInputDialog("My name is Hal!What would you like me to do?");
        JOptionPane.showMessageDialog(null,"I am sorry "+name+",I am afraid i can not do that.");
    }
}
