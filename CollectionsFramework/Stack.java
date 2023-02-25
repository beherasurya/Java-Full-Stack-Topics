package CollectionsFramework;

import java.util.Stack;

class StackEx{
    
    public static void main(String[] args) {
        Stack demo =new Stack<>();
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.push(6);
        demo.push(7);

        demo.pop();
        for(Object items:demo)
        {
            System.out.println(items);
        }

        if(!demo.isEmpty())
        {
            System.out.println("Stack is not empty");
        }
    }
    
}
