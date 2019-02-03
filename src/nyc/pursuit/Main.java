package nyc.pursuit;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        System.out.println(postFixCalculator("+ *".split(" ")));

        MyQueue line = new MyQueue();

        line.enqueue("Jose");

        line.enqueue("Caroline");

        System.out.println(line.front.name);
        System.out.println(line.tail.name);

        line.dequeue();

        System.out.println(line.front.name);
        System.out.println(line.tail.name);

        line.enqueue("Sanje");
        line.enqueue("Enrique");
        line.enqueue("Geo");
        line.print();
        System.out.println(line.size());
        System.out.println(line.isEmpty());

    }

    public static double postFixCalculator(String [] arr){
        double result = 0;
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            String current = arr[i];
            try {
                switch (current) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        double first = stack.pop();
                        double second = stack.pop();
                        double tempResult = 0;
                        switch (current) {
                            case "+":
                                tempResult = first + second;
                                break;
                            case "-":
                                tempResult = first - second;
                                break;
                            case "*":
                                tempResult = first * second;
                                break;
                            case "/":
                                tempResult = first / second;
                                break;
                        }
                        stack.push(tempResult);
                        break;
                    default:
                        stack.push(Double.valueOf(current));
                }
            }catch (EmptyStackException e){
                throw new RuntimeException("Provide valid in");
            }
        }
        result = stack.pop();
        return result;
    }

}
