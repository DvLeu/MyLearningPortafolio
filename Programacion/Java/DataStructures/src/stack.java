import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //what is a stack
        //stack = LIFO data structure, LAST IN - FIRST OUT
        //Stores objects into a sort of vertical tower



        //Declare stack
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Valorant");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("NBA");
        System.out.println(stack);
        //String myFavGame = stack.pop();
        //System.out.println(stack.peek()); peek of the stack
        //System.out.println(stack); print the stack
        //System.out.println(stack.search("DOOM")); search in the stack and says the pos were is the "DOOM"

        //uses of the stack
        //undo / redo features in text editors
        //moving back / forward through browser history
        //backtracking algorithms (maze, file directories)
        //calling functions (call stack)
    }
}
