package org.example.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = gerJavaEEExpression();

        System.out.println("Does developer knows JavaCore: " + isJava.interpret("JavaCore"));

        System.out.println("Does developer knows JavaEE: " + isJavaEEDeveloper.interpret("Java Spring"));

    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("JavaCore");

        return new OrExpression(java, javaCore);
    }

    public static Expression gerJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
